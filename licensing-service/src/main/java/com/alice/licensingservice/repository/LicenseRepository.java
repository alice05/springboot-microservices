package com.alice.licensingservice.repository;

import java.util.List;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.alice.licensingservice.model.License;

@Repository
public interface LicenseRepository extends CrudRepository<License, String> {
	public List<License> findByOrganizationId(String organizationId);
	public License findByOrganizationIdAndLicenseId(String orgatnizationId, String licenseId);
}
