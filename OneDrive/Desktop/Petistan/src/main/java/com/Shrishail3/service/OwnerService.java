package com.Shrishail3.service;


import java.util.List;

import com.Shrishail3.Exception.DuplicateOwnerIdException;
import com.Shrishail3.Exception.OwnerNotFoundException;
import com.Shrishail3.dto.OwnerDTO;

public interface OwnerService {
	void saveOwner(OwnerDTO ownerDTO)  throws DuplicateOwnerIdException ;
	
	OwnerDTO findOwner(int ownerId) throws OwnerNotFoundException;
	
	void updatePetDetails(int ownerId, String petName) throws OwnerNotFoundException;
	
	void deleteOwner(int ownerId) throws OwnerNotFoundException;
	
	List <OwnerDTO> findAllOwners();
	
	

}
