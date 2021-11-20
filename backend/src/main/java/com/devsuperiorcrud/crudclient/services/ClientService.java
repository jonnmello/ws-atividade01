package com.devsuperiorcrud.crudclient.services;

import java.util.List;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.devsuperiorcrud.crudclient.dto.ClientDTO;
import com.devsuperiorcrud.crudclient.entities.Client;
import com.devsuperiorcrud.crudclient.repositories.ClientRepository;

@Service
public class ClientService {
	
	@Autowired
	private ClientRepository repository;
	
	@Transactional(readOnly = true)
	public List<ClientDTO> findAll(){
		List<Client> list = repository.findAll();
		
		return list.stream().map(x -> new ClientDTO(x)).collect(Collectors.toList());
		
		
}
	
	
}
