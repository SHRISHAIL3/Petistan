package com.Shrishail3.repository;

import java.util.List;
import java.util.Optional;

import com.Shrishail3.dto.OwnerDTO;

public interface OwnerRespository {
	void save(OwnerDTO ownerDTO);

	Optional<OwnerDTO> findById(int ownerId);

	void updatePetDetails(int ownerId, String petName);

	void deleteById(int ownerId);

	List<OwnerDTO> findAll();

}
