package com.sysambientes.sysambientes.controller;

import com.sysambientes.sysambientes.model.Bloco;
import com.sysambientes.sysambientes.services.BlocoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/bloco")
public class BlocoController {

	@Autowired
	private BlocoService blocoService;
	
	@RequestMapping(value = "/{id}", method = RequestMethod.GET)
	public ResponseEntity<?> findById(@PathVariable Integer id) {
		Bloco bloco= blocoService.findById(id);
		return new ResponseEntity<>(bloco, HttpStatus.OK);
	}

	@RequestMapping(method = RequestMethod.GET)
	public ResponseEntity<List<Bloco>> findAll() {
		List<Bloco> blocoList = blocoService.findAll();
		return new ResponseEntity<>(blocoList, HttpStatus.OK);
	}
	
	@RequestMapping(value = "/{id}", method = RequestMethod.PUT)
	public ResponseEntity<Void> update(@PathVariable Integer id, @RequestBody Bloco bloco) {
		bloco = blocoService.update(bloco);
		return ResponseEntity.noContent().build();
	}

	@RequestMapping(method = RequestMethod.POST)
	public ResponseEntity<Void> create(@RequestBody Bloco bloco) {
		bloco = blocoService.create(bloco);
		return ResponseEntity.noContent().build();
	}

	@RequestMapping(value = "/{id}", method = RequestMethod.DELETE)
	public ResponseEntity<Void> deleteById(@PathVariable Integer id) {
		blocoService.deleteById(id);
		return ResponseEntity.noContent().build();
	}
	
}
