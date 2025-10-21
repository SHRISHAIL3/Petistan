package com.Shrishail3.dto;

import java.time.LocalDate;

public class DomesticPetDTO extends PetDTO {
	private LocalDate birthDate;

	public LocalDate getBirthDate() {
		return birthDate;
	}

	public void setBirthDate(LocalDate birthDate) {
		this.birthDate = birthDate;
	}

	@Override
	public String toString() {
		return "DomesticPetDTO [birthDate=" + birthDate + ", getId()=" + getId() + ", getNameString()="
				+ getNameString() + ", getGender()=" + getGender() + ", getPetType()=" + getPetType()
				+ ", getOwnerDTO()=" + getOwnerDTO() + "]";
	}

	

}
