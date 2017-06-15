package com.lxisoft.byta.entity;

import java.util.Date;


import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class Patient {
	@Id
	@GeneratedValue
	private int patientId;
	private Date date;
	private String firstName;
	private String lastName;
	private String gender;
	private String nationalRegNo;
	private String familyPhysician;
	private String comment;
	
	
	
	public int getPatientId() {
		return patientId;
	}
	public void setPatientId(int patientId) {
		this.patientId = patientId;
	}
	public Date getDate() {
		return date;
	}
	public void setDate(Date date) {
		this.date = date;
	}
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
	public String getNationalRegNo() {
		return nationalRegNo;
	}
	public void setNationalRegNo(String nationalRegNo) {
		this.nationalRegNo = nationalRegNo;
	}
	public String getFamilyPhysician() {
		return familyPhysician;
	}
	public void setFamilyPhysician(String familyPhysician) {
		this.familyPhysician = familyPhysician;
	}
	public String getComment() {
		return comment;
	}
	public void setComment(String comment) {
		this.comment = comment;
	}

}
