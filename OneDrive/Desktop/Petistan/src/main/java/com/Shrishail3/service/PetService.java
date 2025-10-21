package com.Shrishail3.service;

import com.Shrishail3.Exception.PetNotFoundException;
import com.Shrishail3.dto.PetDTO;

public interface PetService {
	PetDTO findPet(int petId) throws PetNotFoundException;

}
