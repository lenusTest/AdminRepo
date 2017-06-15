package com.lxisoft.byta.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.lxisoft.byta.entity.Patient;

public interface PatientRepository extends JpaRepository<Patient,Integer >{
	
	 List<Patient> findByFirstNameLike(String firstName);

}
