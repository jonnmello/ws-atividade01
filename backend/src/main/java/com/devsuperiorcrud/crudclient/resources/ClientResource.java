package com.devsuperiorcrud.crudclient.resources;

import java.util.ArrayList;
import java.util.List;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.devsuperiorcrud.crudclient.entities.Client;

@RestController
@RequestMapping(value = "/clients")
public class ClientResource {

	@GetMapping
	public ResponseEntity<List<Client>>findAll(){
		List<Client> list = new ArrayList<>();
		list.add(new Client(1L,"Jonatas","04694300520",2000D,2));
		list.add(new Client(2L,"Jay","04330699532",10900D,2));
		return ResponseEntity.ok().body(list);
	}
	
}
