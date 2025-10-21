package com.Shrishail3.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

import com.Shrishail3.Exception.DuplicateOwnerIdException;
import com.Shrishail3.Exception.OwnerNotFoundException;
import com.Shrishail3.dto.OwnerDTO;
import com.Shrishail3.repository.OwnerRespository;
import com.Shrishail3.service.OwnerService;

@Service
public class OwnerServiceImpl implements OwnerService {

	private final OwnerRespository ownerRespository;
	private final String ownerAlreadyExiString;
	private final String OwnerNotFound;

	public OwnerServiceImpl(OwnerRespository ownerRespository,
			@Value("${Owner.not.found}") String ownerAlreadyExiString,
			@Value("${Owner.Allready.Exist}") String ownerNotFound) {
		super();
		this.ownerRespository = ownerRespository;
		this.ownerAlreadyExiString = ownerAlreadyExiString;
		this.OwnerNotFound = ownerNotFound;
	}

	@Override
	public void saveOwner(OwnerDTO ownerDTO) throws DuplicateOwnerIdException {
		if(ownerRespository.findById(ownerDTO.getId()).isPresent()) {
			throw new DuplicateOwnerIdException(String.format(ownerAlreadyExiString, ownerDTO.getId()));
		}else {
			ownerRespository.save(ownerDTO);
		}

	}
	

	@Override
	public OwnerDTO findOwner(int ownerId) throws OwnerNotFoundException {
		return ownerRespository.findById(ownerId)
				.orElseThrow(() -> new OwnerNotFoundException(String.format(OwnerNotFound, ownerId)));
	}
	

	@Override
	public void updatePetDetails(int ownerId, String petName) throws OwnerNotFoundException {
		
		ownerRespository.findById(ownerId)
				.orElseThrow(() -> new OwnerNotFoundException(String.format(OwnerNotFound, ownerId)));
		ownerRespository.updatePetDetails(ownerId, petName);

	}
	

	@Override
	public void deleteOwner(int ownerId) throws OwnerNotFoundException {
		ownerRespository.findById(ownerId)
		.orElseThrow(() -> new OwnerNotFoundException(String.format(OwnerNotFound, ownerId)));
		ownerRespository.deleteById(ownerId);
		

	}

	@Override
	public List<OwnerDTO> findAllOwners() {
		return ownerRespository.findAll();
	}

	@Override
	public String toString() {
		return "OwnerServiceImpl [ownerRespository=" + ownerRespository + ", OwnerNotFound=" + OwnerNotFound + "]";
	}

}
