package com.Shrishail3.dto;

import java.util.Objects;

public class WildPetDTO extends PetDTO {
	private String birthPlace;

	public String getBirthPlace() {
		return birthPlace;
	}

	public void setBirthPlace(String birthPlace) {
		this.birthPlace = birthPlace;
	}

	@Override
	public String toString() {
		if (Objects.nonNull(getOwnerDTO())) {
			return "WildPetDTO [birthPlace=" + birthPlace + ", getId()=" + getId() + ", getNameString()="
					+ getNameString() + ", getGender()=" + getGender() + ", getPetType()=" + getPetType()
					+ ", getOwnerDTO()=" + getOwnerDTO() + "]";
		}else {
			return "WildPetDTO [birthPlace=" + birthPlace + ", getId()=" + getId() + ", getNameString()="
					+ getNameString() + ", getGender()=" + getGender() + ", getPetType()=" + getPetType()
					+  "]";
		}
	}

}
