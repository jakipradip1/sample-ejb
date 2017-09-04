package com.jakipradip.vo;

import java.io.Serializable;

public class PatientInfo implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = -8275734818808739842L;
	
	private String firstName;
	private String lastname;
	private String gender;
	private String age;
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public String getLastname() {
		return lastname;
	}
	public void setLastname(String lastname) {
		this.lastname = lastname;
	}
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
	public String getAge() {
		return age;
	}
	public void setAge(String age) {
		this.age = age;
	}

	@Override
	public String toString() {
		return "PatientInfo [firstName=" + firstName + ", lastname=" + lastname + ", gender=" + gender + ", age=" + age
				+ "]";
	}	
}
