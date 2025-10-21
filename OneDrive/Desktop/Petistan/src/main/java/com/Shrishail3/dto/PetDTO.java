package com.Shrishail3.dto;

import java.util.Objects;

import com.Shrishail3.Enum.Gender;
import com.Shrishail3.Enum.PetType;

public class PetDTO {
	private int id;
	private String nameString;
	private Gender gender;
	private PetType petType;
	private OwnerDTO ownerDTO;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getNameString() {
		return nameString;
	}

	public void setNameString(String nameString) {
		this.nameString = nameString;
	}

	public Gender getGender() {
		return gender;
	}

	public void setGender(Gender gender) {
		this.gender = gender;
	}

	public PetType getPetType() {
		return petType;
	}

	public void setPetType(PetType petType) {
		this.petType = petType;
	}

	public OwnerDTO getOwnerDTO() {
		return ownerDTO;
	}

	public void setOwnerDTO(OwnerDTO ownerDTO) {
		this.ownerDTO = ownerDTO;
	}

	@Override
	public String toString() {
		if (Objects.nonNull(ownerDTO)) {
			return "PetDTO [id=" + id + ", nameString=" + nameString + ", gender=" + gender + ", petType=" + petType
					+"ownerDTO=" + ownerDTO + "]";
			
		}
		return "PetDTO [id=" + id + ", nameString=" + nameString + ", gender=" + gender + ", petType=" + petType
				+ "]";

	}

}
