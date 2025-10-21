package com.Shrishail3.dto;

import java.util.Objects;

import com.Shrishail3.Enum.Gender;

public class OwnerDTO {
	private int id;
	private String firstname;
	private String lastname;
	private Gender gender;
	private String city;
	private String state;
	private String mblno;
	private String emailId;
	private PetDTO petDTO;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getFirstname() {
		return firstname;
	}

	public void setFirstname(String firstname) {
		this.firstname = firstname;
	}

	public String getLastname() {
		return lastname;
	}

	public void setLastname(String lastname) {
		this.lastname = lastname;
	}

	public Gender getGender() {
		return gender;
	}

	public void setGender(Gender gender) {
		this.gender = gender;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public String getState() {
		return state;
	}

	public void setState(String state) {
		this.state = state;
	}

	public String getMblno() {
		return mblno;
	}

	public void setMblno(String mblno) {
		this.mblno = mblno;
	}

	public String getEmailId() {
		return emailId;
	}

	public void setEmailId(String emailId) {
		this.emailId = emailId ;
	}

	public PetDTO getPetDTO() {
		return petDTO;
	}

	public void setPetDTO(PetDTO petDTO) {
		this.petDTO = petDTO;
	}

	@Override
	public String toString() {
		if (Objects.nonNull(petDTO)) {
			return "OwnerDTO [id=" + id + ", firstname=" + firstname + ", lastname=" + lastname + ", gender=" + gender
					+ ", city=" + city + ", state=" + state + ", mblno=" + mblno + ", emailId=" + emailId + ", petDTO="
					+ petDTO + "]";
		}
		return "OwnerDTO [id=" + id + ", firstname=" + firstname + ", lastname=" + lastname + ", gender=" + gender
					+ ", city=" + city + ", state=" + state + ", mblno=" + mblno + ", emailId=" + emailId +"]";
	}

}
