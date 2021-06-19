package com.sysambientes.sysambientes.controller;

import com.sysambientes.sysambientes.model.Embarcado;
import com.sysambientes.sysambientes.services.EmbarcadoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/embarcado")
public class EmbarcadoController {

	@Autowired
	private EmbarcadoService embarcadoService;
	@RequestMapping(value = "/{id}", method = RequestMethod.GET)
	public ResponseEntity<?> findById(@PathVariable Integer id) {
		Embarcado embarcado= embarcadoService.findById(id);
		return new ResponseEntity<>(embarcado, HttpStatus.OK);
	}

	@RequestMapping(method = RequestMethod.GET)
	public ResponseEntity<List<Embarcado>> findAll() {
		List<Embarcado> blocoList = embarcadoService.findAll();
		return new ResponseEntity<>(blocoList, HttpStatus.OK);
	}
	
	@RequestMapping(value = "/{id}", method = RequestMethod.PUT)
	public ResponseEntity<Void> update(@PathVariable Integer id, @RequestBody Embarcado embarcado) {
		embarcado = embarcadoService.update(embarcado);
		return ResponseEntity.noContent().build();
	}

	@RequestMapping(method = RequestMethod.POST)
	public ResponseEntity<Void> create(@RequestBody Embarcado embarcado) {
		embarcado = embarcadoService.create(embarcado);
		return ResponseEntity.noContent().build();
	}

	@RequestMapping(value = "/{id}", method = RequestMethod.DELETE)
	public ResponseEntity<Void> deleteById(@PathVariable Integer id) {
		embarcadoService.deleteById(id);
		return ResponseEntity.noContent().build();
	}
	
}
