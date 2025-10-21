package com.Shrishail3.repository.Impl;

import java.time.LocalDate;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Repository;

import com.Shrishail3.Enum.Gender;
import com.Shrishail3.Enum.PetType;
import com.Shrishail3.dto.DomesticPetDTO;
import com.Shrishail3.dto.OwnerDTO;
import com.Shrishail3.dto.WildPetDTO;
import com.Shrishail3.repository.OwnerRespository;

import jakarta.annotation.PostConstruct;

@Repository
public class OwnerRepositoryImpl implements OwnerRespository {

	private List<OwnerDTO> ownerDTOList;

	public OwnerRepositoryImpl() {
		this.ownerDTOList = new ArrayList<>();
		OwnerDTO ownerDTO=new OwnerDTO();
		ownerDTOList.add(ownerDTO);
	}
	
	@PostConstruct
	public void init() {
		OwnerDTO ownerDTO = new OwnerDTO();
		ownerDTO.setId(1);
		ownerDTO.setFirstname("SHRI");
		ownerDTO.setLastname("Belle");
		ownerDTO.setGender(Gender.M);
		ownerDTO.setCity("Kalaburagi");
		ownerDTO.setState("Karnataka");
		ownerDTO.setMblno("8310844781");
		ownerDTO.setEmailId("shrishailbelle6@gmail.com");
		DomesticPetDTO domesticPetDTO = new DomesticPetDTO();
		domesticPetDTO.setId(1);
		domesticPetDTO.setNameString("Pikachu");
		domesticPetDTO.setGender(Gender.M);
		domesticPetDTO.setPetType(PetType.PIAKCHU);
		domesticPetDTO.setBirthDate(LocalDate.of(2018, 7, 26));
		ownerDTO.setPetDTO(domesticPetDTO);
		ownerDTOList.add(ownerDTO);
		ownerDTO = new OwnerDTO();
		ownerDTO.setId(2);
		ownerDTO.setFirstname("sak");
		ownerDTO.setLastname("Sab");
		ownerDTO.setGender(Gender.F);
		ownerDTO.setCity("Dharwad");
		ownerDTO.setState("Karnataka");
		ownerDTO.setMblno("9009784184");
		ownerDTO.setEmailId("sak@gmail.com");
		WildPetDTO wildPetDTO = new WildPetDTO();
		wildPetDTO.setId(2);
		wildPetDTO.setNameString("Fluffy");
		wildPetDTO.setGender(Gender.F);
		wildPetDTO.setPetType(PetType.CAT);
		wildPetDTO.setBirthPlace("Jim Corbett National Park");
		ownerDTO.setPetDTO(wildPetDTO);
		ownerDTOList.add(ownerDTO);
		
	}

	@Override
	public void save(OwnerDTO ownerDTO) {
		ownerDTOList.add(ownerDTO);

	}

	@Override
	public Optional<OwnerDTO> findById(int ownerId) {
		return ownerDTOList.stream().filter(owner -> owner.getId() == ownerId).findFirst();
	}

	@Override
	public void updatePetDetails(int ownerId, String petName) {
		ownerDTOList.stream().filter(owner -> owner.getId() == ownerId).findFirst()
				.ifPresent(OwnerDTO -> OwnerDTO.getPetDTO().setNameString(petName));
	}

	@Override
	public void deleteById(int ownerId) {
		ownerDTOList.removeIf((owner -> owner.getId() == ownerId));

	}

	@Override
	public List<OwnerDTO> findAll() {
		return ownerDTOList;
	}

}
