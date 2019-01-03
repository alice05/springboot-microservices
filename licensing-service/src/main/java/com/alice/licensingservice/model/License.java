package com.alice.licensingservice.model;

public class License {
    private String id;
    private String organizationId;
    private String productName;
    private String licenseType;

    public String getId() {
        return this.id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getOrganizationId() {
        return this.organizationId;
    }

    public void setOrganizationId(String organizationId) {
        this.organizationId = organizationId;
    }

    public String getProductName() {
        return this.productName;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }

    public String getLicenseType() {
        return this.licenseType;
    }

    public void setLicenseType(String licenseType) {
        this.licenseType = licenseType;
    }


    public License id(String id) {
        this.id = id;
        return this;
    }

    public License organizationId(String organizationId) {
        this.organizationId = organizationId;
        return this;
    }

    public License productName(String productName) {
        this.productName = productName;
        return this;
    }

    public License licenseType(String licenseType) {
        this.licenseType = licenseType;
        return this;
    }

}