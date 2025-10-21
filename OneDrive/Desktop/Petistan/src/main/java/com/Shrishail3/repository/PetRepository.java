package com.Shrishail3.repository;

import java.util.Optional;

import com.Shrishail3.dto.PetDTO;

public interface PetRepository {
	Optional<PetDTO> findById(int petId);

}
