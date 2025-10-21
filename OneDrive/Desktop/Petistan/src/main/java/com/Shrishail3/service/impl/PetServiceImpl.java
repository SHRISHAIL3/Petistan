package com.Shrishail3.service.impl;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

import com.Shrishail3.Exception.PetNotFoundException;
import com.Shrishail3.dto.PetDTO;
import com.Shrishail3.repository.PetRepository;
import com.Shrishail3.service.PetService;

@Service
public class PetServiceImpl implements PetService {

	private final PetRepository petRepository;
	private final String PetNotFound;

	public PetServiceImpl(PetRepository petRepository, @Value("${Pet.Not.Found}")  String PetNotFound) {

		this.petRepository = petRepository;
		this.PetNotFound = PetNotFound;
	}

	@Override
	public PetDTO findPet(int petId) throws PetNotFoundException {
		return petRepository.findById(petId).orElseThrow(() -> new PetNotFoundException(String.format(PetNotFound, petId)));

	}

}
