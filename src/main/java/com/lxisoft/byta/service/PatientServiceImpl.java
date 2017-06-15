package com.lxisoft.byta.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.lxisoft.byta.entity.Patient;
import com.lxisoft.byta.repository.PatientRepository;

@Service
@Transactional

public class PatientServiceImpl implements PatientService {

	@Autowired
	private PatientRepository patientRepo;

	public void registerPatientDetail(Patient patientDetail) {
		patientRepo.save(patientDetail);

	}

	public List<String> listOfPatients() {
		ArrayList<String> patientNames = new ArrayList<String>();
		for (Patient patient : patientRepo.findAll()) {
			patientNames.add(patient.getFirstName()+" "+patient.getLastName());
		}
		return patientNames;

	}

	@Override
	public List<Patient> findByFirstNameLike(String firstName) {
		
		return patientRepo.findByFirstNameLike(firstName);
	}
}
