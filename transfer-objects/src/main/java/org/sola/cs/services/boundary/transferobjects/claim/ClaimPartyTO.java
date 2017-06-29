package org.sola.cs.services.boundary.transferobjects.claim;

import java.util.Date;
import org.sola.services.common.contracts.AbstractReadWriteTO;

public class ClaimPartyTO extends AbstractReadWriteTO {
    private String id;
    private String name;
    private String lastName;
    private String idTypeCode;
    private String idNumber;
    private Date birthDate;
    private String genderCode;
    private String mobilePhone;
    private String phone;
    private String email;
    private String address;
    private boolean person;
    private String otherName;
    private String fatherName;
    private String motherName;
    private Date idIssuanceDate;
    private String idIssuanceCountryCode;
    private String idIssuanceProvinceCode;
    private String birthCountryCode;
    private String birthCommuneCode;
    private String residenceCommuneCode;
    private String beneficiaryName;
    private String beneficiaryIdNumber;
    private String maritalStatusCode;
    
    public ClaimPartyTO(){
        super();
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getIdTypeCode() {
        return idTypeCode;
    }

    public void setIdTypeCode(String idTypeCode) {
        this.idTypeCode = idTypeCode;
    }

    public String getIdNumber() {
        return idNumber;
    }

    public void setIdNumber(String idNumber) {
        this.idNumber = idNumber;
    }

    public Date getBirthDate() {
        return birthDate;
    }

    public void setBirthDate(Date birthDate) {
        this.birthDate = birthDate;
    }

    public String getGenderCode() {
        return genderCode;
    }

    public void setGenderCode(String genderCode) {
        this.genderCode = genderCode;
    }

    public String getMobilePhone() {
        return mobilePhone;
    }

    public void setMobilePhone(String mobilePhone) {
        this.mobilePhone = mobilePhone;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public boolean isPerson() {
        return person;
    }

    public void setPerson(boolean person) {
        this.person = person;
    }

    public String getOtherName() {
        return otherName;
    }

    public void setOtherName(String otherName) {
        this.otherName = otherName;
    }

    public String getFatherName() {
        return fatherName;
    }

    public void setFatherName(String fatherName) {
        this.fatherName = fatherName;
    }

    public String getMotherName() {
        return motherName;
    }

    public void setMotherName(String motherName) {
        this.motherName = motherName;
    }

    public Date getIdIssuanceDate() {
        return idIssuanceDate;
    }

    public void setIdIssuanceDate(Date idIssuanceDate) {
        this.idIssuanceDate = idIssuanceDate;
    }

    public String getIdIssuanceCountryCode() {
        return idIssuanceCountryCode;
    }

    public void setIdIssuanceCountryCode(String idIssuanceCountryCode) {
        this.idIssuanceCountryCode = idIssuanceCountryCode;
    }

    public String getIdIssuanceProvinceCode() {
        return idIssuanceProvinceCode;
    }

    public void setIdIssuanceProvinceCode(String idIssuanceProvinceCode) {
        this.idIssuanceProvinceCode = idIssuanceProvinceCode;
    }

    public String getBirthCountryCode() {
        return birthCountryCode;
    }

    public void setBirthCountryCode(String birthCountryCode) {
        this.birthCountryCode = birthCountryCode;
    }

    public String getBirthCommuneCode() {
        return birthCommuneCode;
    }

    public void setBirthCommuneCode(String birthCommuneCode) {
        this.birthCommuneCode = birthCommuneCode;
    }

    public String getResidenceCommuneCode() {
        return residenceCommuneCode;
    }

    public void setResidenceCommuneCode(String residenceCommuneCode) {
        this.residenceCommuneCode = residenceCommuneCode;
    }

    public String getBeneficiaryName() {
        return beneficiaryName;
    }

    public void setBeneficiaryName(String beneficiaryName) {
        this.beneficiaryName = beneficiaryName;
    }

    public String getBeneficiaryIdNumber() {
        return beneficiaryIdNumber;
    }

    public void setBeneficiaryIdNumber(String beneficiaryIdNumber) {
        this.beneficiaryIdNumber = beneficiaryIdNumber;
    }

    public String getMaritalStatusCode() {
        return maritalStatusCode;
    }

    public void setMaritalStatusCode(String maritalStatusCode) {
        this.maritalStatusCode = maritalStatusCode;
    }
}
