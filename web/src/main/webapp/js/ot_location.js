$(function () {
    $("#cbxCountries").change(function () {
        loadList(getProvinces($("#cbxCountries").val()), "cbxProvinces", null, true);
        $("#cbxMunicipalities").empty();
        $("#cbxCommunes").empty();
    });
    $("#cbxProvinces").change(function () {
        loadList(getMunicipalities($("#cbxProvinces").val()), "cbxMunicipalities", null, true);
        $("#cbxCommunes").empty();
    });
    $("#cbxMunicipalities").change(function () {
        loadList(getCommunes($("#cbxMunicipalities").val()), "cbxCommunes", null, true);
    });
});

var onSaveLocationFunction = null;

function selectLocation(countryCode, provinceCode, municipalityCode, communeCode, level, saveLocationFunction) {
    var countries = null;
    var provinces = null;
    var municipalities = null;
    var communes = null;
    onSaveLocationFunction = saveLocationFunction;

    // Disable dropdown list, base on provided level
    $("#cbxCountries").removeAttr("disabled");
    $("#cbxProvinces").removeAttr("disabled");
    $("#cbxMunicipalities").removeAttr("disabled");
    $("#cbxCommunes").removeAttr("disabled");

    if (typeof level !== 'undefined' && level !== null && level > 0) {
        if (level === 1) {
            $("#cbxProvinces").prop("disabled", "disabled");
            $("#cbxMunicipalities").prop("disabled", "disabled");
            $("#cbxCommunes").prop("disabled", "disabled");
        } else if (level === 2) {
            $("#cbxMunicipalities").prop("disabled", "disabled");
            $("#cbxCommunes").prop("disabled", "disabled");
        } else if (level === 3) {
            $("#cbxCommunes").prop("disabled", "disabled");
        }
    }
    
    // Load list starting from the lowest (bottom) element. Reset all codes above, if provided
    if (typeof communeCode !== 'undefined' && communeCode !== null && communeCode !== '') {
        municipalityCode = null;
        provinceCode = null;
        countryCode = null;
    } else if (typeof municipalityCode !== 'undefined' && municipalityCode !== null && municipalityCode !== '') {
        provinceCode = null;
        countryCode = null;
    } else if (typeof provinceCode !== 'undefined' && provinceCode !== null && provinceCode !== '') {
        countryCode = null;
    }

    // Load countries
    $.ajax({
        url: baseWsRefUrl + "getcountries",
        async: false,
        method: 'GET',
        crossDomain: true,
        success: function (data) {
            countries = data;
        }
    });

    // Set country code by default to Angola, if it's not provided
    if (typeof countryCode === 'undefined' || countryCode === null || countryCode === '') {
        countryCode = "ago";
    }

    // Load communes 
    if (typeof communeCode !== 'undefined' && communeCode !== null && communeCode !== '') {
        $.ajax({
            url: baseWsRefUrl + "getcommunesbycommune/" + communeCode,
            async: false,
            method: 'GET',
            crossDomain: true,
            success: function (data) {
                communes = data;
            }
        });

        if (typeof communes !== 'undefined' && communes !== null && communes.length > 0) {
            municipalityCode = communes[0].municipalityCode;
        }
    }

    // Load municipalities 
    if (typeof municipalityCode !== 'undefined' && municipalityCode !== null && municipalityCode !== '') {
        $.ajax({
            url: baseWsRefUrl + "getmunicipalitiesbymunicipality/" + municipalityCode,
            async: false,
            method: 'GET',
            crossDomain: true,
            success: function (data) {
                municipalities = data;
            }
        });

        if (typeof municipalities !== 'undefined' && municipalities !== null && municipalities.length > 0) {
            provinceCode = municipalities[0].provinceCode;
            // Get communes
            if (typeof communes === 'undefined' || communes === null || communes.length < 1) {
                communes = getCommunes(municipalityCode);
            }
        }
    }

    // Load provinces 
    if (typeof provinceCode !== 'undefined' && provinceCode !== null && provinceCode !== '') {
        $.ajax({
            url: baseWsRefUrl + "getprovincesbyprovince/" + provinceCode,
            async: false,
            method: 'GET',
            crossDomain: true,
            success: function (data) {
                provinces = data;
            }
        });

        if (typeof provinces !== 'undefined' && provinces !== null && provinces !== '') {
            countryCode = provinces[0].countryCode;
            // Get municipalities
            if (typeof municipalities === 'undefined' || municipalities === null || municipalities.length < 1) {
                municipalities = getMunicipalities(provinceCode);
            }
        }
    }

    // Load provinces by country
    if (typeof provinces === 'undefined' || provinces === null || provinces.length < 1) {
        // Get provinces
        provinces = getProvinces(countryCode);
    }

    // Fill in dropdown boxes and set selected values
    loadList(countries, "cbxCountries", countryCode, false);
    loadList(communes, "cbxCommunes", communeCode, true);
    loadList(municipalities, "cbxMunicipalities", municipalityCode, true);
    loadList(provinces, "cbxProvinces", provinceCode, true);

    $('#locationDialog').modal('show');
    return false;
}

function loadList(data, cbxId, selectedValue, addEmptyItem) {
    $("#" + cbxId).empty();
    if (typeof data !== 'undefined' && data !== null && data.length > 0) {
        if (typeof addEmptyItem !== 'undefined' && addEmptyItem) {
            $("#" + cbxId).append($("<option/>").attr("value", "").text(" "));
        }

        $.each(data, function (i, item) {
            $("#" + cbxId).append($("<option/>").attr("value", item.code).text(item.displayValue));
        });

        if (typeof selectedValue !== 'undefined' && selectedValue !== null && selectedValue !== '') {
            $("#" + cbxId).val(selectedValue);
        }
    }
}

function getProvinces(countryCode) {
    var result = null;
    if (typeof countryCode === 'undefined' || countryCode === null || countryCode === '') {
        return result;
    }
    $.ajax({
        url: baseWsRefUrl + "getprovinces/" + countryCode,
        async: false,
        method: 'GET',
        crossDomain: true,
        success: function (data) {
            result = data;
        }
    });
    return result;
}

function getMunicipalities(provinceCode) {
    var result = null;
    if (typeof provinceCode === 'undefined' || provinceCode === null || provinceCode === '') {
        return result;
    }
    $.ajax({
        url: baseWsRefUrl + "getmunicipalities/" + provinceCode,
        async: false,
        method: 'GET',
        crossDomain: true,
        success: function (data) {
            result = data;
        }
    });
    return result;
}

function getCommunes(municipalityCode) {
    var result = null;
    if (typeof municipalityCode === 'undefined' || municipalityCode === null || municipalityCode === '') {
        return result;
    }
    $.ajax({
        url: baseWsRefUrl + "getcommunes/" + municipalityCode,
        async: false,
        method: 'GET',
        crossDomain: true,
        success: function (data) {
            result = data;
        }
    });
    return result;
}

function saveLocation() {
    if (typeof onSaveLocationFunction !== 'undefined' && onSaveLocationFunction !== null) {
        if (!onSaveLocationFunction.call(this)) {
            return;
        }
    }
    $('#locationDialog').modal('hide');
}

function getAddressString() {
    var provinceName = $("#cbxProvinces option:selected").text().trim();
    var municipalityName = $("#cbxMunicipalities option:selected").text().trim();
    var communeName = $("#cbxCommunes option:selected").text().trim();

    var loc = $("#cbxCountries option:selected").text().trim();

    if (loc === '') {
        loc = provinceName;
    } else {
        if (provinceName !== '') {
            loc = provinceName;
        }
    }

    if (loc === '') {
        loc = municipalityName;
    } else {
        if (municipalityName !== '') {
            loc = loc + ', ' + municipalityName;
        }
    }

    if (loc === '') {
        loc = communeName;
    } else {
        if (communeName !== '') {
            loc = loc + ', ' + communeName;
        }
    }
    return loc;
}