package com.lxisoft.byta.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.lxisoft.byta.entity.Patient;
import com.lxisoft.byta.service.PatientService;

@RestController
public class PatientController {

	@Autowired
	private PatientService patientService;

	@RequestMapping("/msg")
	public String msg() {
		return "sree";
	}

	@RequestMapping("/patientRegistration")
	public void patientRegistration(Patient patient) {

		patientService.registerPatientDetail(patient);
	}

	@RequestMapping("/listPatient")
	public List<String> showPatient() {
		return patientService.listOfPatients();
	}
	
	@RequestMapping("/findByName")
	public List<Patient> findByName(String name) {
     
		return patientService.findByFirstNameLike(name);
	}

}
