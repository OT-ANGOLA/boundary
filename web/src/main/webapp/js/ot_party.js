var ERROR_CLAIM_SELECT_COMMUNE = "";
var ERROR_CLAIM_SELECT_COUNTRY = "";

function saveBirthdayLocation() {
    var province  = $("#cbxProvinces").val();
    var commune = $("#cbxCommunes").val();
    
    if ((province === null || province !== '') && (commune === null || commune === '')) {
        alert(ERROR_CLAIM_SELECT_COMMUNE);
        return false;
    }

    $("#mainForm\\:hfBirthdayCountry").val($("#cbxCountries").val());
    $("#mainForm\\:hfBirthdayCommune").val(commune);
    $("#mainForm\\:lblBirthdayLocation").text(getAddressString());
    return true;
}

function selectBirthdayLocation() {
    selectLocation($("#mainForm\\:hfBirthdayCountry").val(), null, null, $("#mainForm\\:hfBirthdayCommune").val(), 0, saveBirthdayLocation);
}

function saveRecidenceLocation(){
    var commune = $("#cbxCommunes").val();
    if (commune === null || commune === '') {
        alert(ERROR_CLAIM_SELECT_COMMUNE);
        return false;
    }
    $("#mainForm\\:hfResidenceCommune").val(commune);
    $("#mainForm\\:lblResidenceLocation").text(getAddressString());
    return true;
}

function selectRecidenceLocation(){
    selectLocation(null, null, null, $("#mainForm\\:hfResidenceCommune").val(), 0, saveRecidenceLocation);
}

function saveIdIssuanceLocation(){
    var province  = $("#cbxProvinces").val();
    var country = $("#cbxCountries").val();
    
    if ((country === null || country === '') && (province === null || province === '')) {
        alert(ERROR_CLAIM_SELECT_COUNTRY);
        return false;
    }

    $("#mainForm\\:hfIdIssueCountry").val(country);
    $("#mainForm\\:hfIdIssueProvince").val(province);
    $("#mainForm\\:lblIdIssueLocation").text(getAddressString());
    return true;
}

function selectIdIssueLocation(){
    selectLocation($("#mainForm\\:hfIdIssueCountry").val(), $("#mainForm\\:hfIdIssueProvince").val(), null, null, 2, saveIdIssuanceLocation);
}