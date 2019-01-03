package com.alice.licensingservice.services;

import java.util.UUID;

import com.alice.licensingservice.model.License;

import org.springframework.stereotype.Service;

@Service
public class LicenseService {

    public License getLicense(String licenseId) {
        return new License()
        .withId(licenseId)
        .withOrganizationId(UUID.randomUUID().toString())
        .withProductName("Test product name")
        .withLicenseType("Perseat");
    }

    public void saveLicense(License license){

    }

    public void updateLicense(License license){

    }

    public void deleteLicense(License license){

    }
}