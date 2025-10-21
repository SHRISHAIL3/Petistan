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
import com.Shrishail3.dto.PetDTO;
import com.Shrishail3.dto.WildPetDTO;
import com.Shrishail3.repository.PetRepository;

@Repository
public class PetRepositoryImpl implements PetRepository {

    private List<PetDTO> petDTOList;

    public PetRepositoryImpl() {
        this.petDTOList = new ArrayList<>();
        init(); // optional: initialize data here
    }

    private void init() {
        // Your demo data (same as before)
        DomesticPetDTO domesticPetDTO = new DomesticPetDTO();
        domesticPetDTO.setId(1);
        domesticPetDTO.setNameString("Pikachu");
        domesticPetDTO.setGender(Gender.M);
        domesticPetDTO.setPetType(PetType.PIAKCHU);
        domesticPetDTO.setBirthDate(LocalDate.of(2018, 7, 26));

        OwnerDTO ownerDTO = new OwnerDTO();
        ownerDTO.setId(1);
        ownerDTO.setFirstname("SHRI");
        ownerDTO.setLastname("Belle");
        ownerDTO.setGender(Gender.M);
        ownerDTO.setCity("Kalaburagi");
        ownerDTO.setState("Karnataka");
        ownerDTO.setMblno("8310844781");
        ownerDTO.setEmailId("shrishailbelle6@gmail.com");
        domesticPetDTO.setOwnerDTO(ownerDTO);
        petDTOList.add(domesticPetDTO);

        WildPetDTO wildPetDTO = new WildPetDTO();
        wildPetDTO.setId(2);
        wildPetDTO.setNameString("Fluffy");
        wildPetDTO.setGender(Gender.F);
        wildPetDTO.setPetType(PetType.CAT);
        wildPetDTO.setBirthPlace("Jim Corbett National Park");

        ownerDTO = new OwnerDTO();
        ownerDTO.setId(2);
        ownerDTO.setFirstname("Sak");
        ownerDTO.setLastname("Sab");
        ownerDTO.setGender(Gender.F);
        ownerDTO.setCity("Dharwad");
        ownerDTO.setState("Karnataka");
        ownerDTO.setMblno("9009784184");
        ownerDTO.setEmailId("sak@gmail.com");
        wildPetDTO.setOwnerDTO(ownerDTO);
        petDTOList.add(wildPetDTO);
    }

    @Override
    public Optional<PetDTO> findById(int petId) {
        return petDTOList.stream()
                         .filter(pet -> pet.getId() == petId)
                         .findFirst();
    }
}
