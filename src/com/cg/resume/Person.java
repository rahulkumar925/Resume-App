//Person Class with all the values.


package com.cg.resume;

import java.util.Arrays;

public class Person {

	String firstname;
	String lastname;
	String gender;
	String hq;
	String dob;
	String[] hobbies;
	String address;
	String[] skills;
	String email;
	String phoneno;
	String summary;

	public Person() {
		super();

	}

	public Person(String firstname, String lastname, String gender, String hq, String dob, String[] hobbies,
			String address, String[] skills, String email, String phoneno, String summary) {
		super();
		this.firstname = firstname;
		this.lastname = lastname;
		this.gender = gender;
		this.hq = hq;
		this.dob = dob;
		this.hobbies = hobbies;
		this.address = address;
		this.skills = skills;
		this.email = email;
		this.phoneno = phoneno;
		this.summary = summary;
	}

	public String getFirstname() {
		return firstname;
	}

	public String getLastname() {
		return lastname;
	}

	public String getGender() {
		return gender;
	}

	public String getHq() {
		return hq;
	}

	public String getDob() {
		return dob;
	}

	public String[] getHobbies() {
		return hobbies;
	}

	public String getAddress() {
		return address;
	}

	public String[] getSkills() {
		return skills;
	}

	public String getEmail() {
		return email;
	}

	public String getPhoneno() {
		return phoneno;
	}

	public String getSummary() {
		return summary;
	}

	@Override
	public String toString() {
		return "Person [firstname=" + firstname + ", lastname=" + lastname + ", gender=" + gender + ", hq=" + hq
				+ ", dob=" + dob + ", hobbies=" + Arrays.toString(hobbies) + ", address=" + address + ", skills="
				+ Arrays.toString(skills) + ", email=" + email + ", phoneno=" + phoneno + ", summary=" + summary + "]";
	}

}