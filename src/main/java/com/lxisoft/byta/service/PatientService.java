package com.lxisoft.byta.service;

import java.util.List;

import com.lxisoft.byta.entity.Patient;

public interface PatientService {

	public void registerPatientDetail(Patient patientDetail);

	public List<String> listOfPatients();
	
	 List<Patient> findByFirstNameLike(String firstName);
}
