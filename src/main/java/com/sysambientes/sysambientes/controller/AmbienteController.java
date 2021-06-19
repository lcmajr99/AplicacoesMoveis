package com.sysambientes.sysambientes.controller;

import com.sysambientes.sysambientes.model.Ambiente;
import com.sysambientes.sysambientes.model.Usuario;
import com.sysambientes.sysambientes.services.AmbienteService;
import com.sysambientes.sysambientes.services.UsuarioService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/ambiente")
public class AmbienteController {

	@Autowired
	private AmbienteService ambienteService;
	
	@RequestMapping(value = "/{id}", method = RequestMethod.GET)
	public ResponseEntity<?> findById(@PathVariable Integer id) {
		Ambiente ambiente = ambienteService.findById(id);
		return new ResponseEntity<>(ambiente, HttpStatus.OK);
	}

	@RequestMapping(method = RequestMethod.GET)
	public ResponseEntity<List<Ambiente>> findAll() {
		List<Ambiente> ambienteList = ambienteService.findAll();
		return new ResponseEntity<>(ambienteList, HttpStatus.OK);
	}
	
	@RequestMapping(value = "/{id}", method = RequestMethod.PUT)
	public ResponseEntity<Void> update(@PathVariable Integer id, @RequestBody Ambiente ambiente) {
		ambiente = ambienteService.update(ambiente);
		return ResponseEntity.noContent().build();
	}

	@RequestMapping(method = RequestMethod.POST)
	public ResponseEntity<Void> create(@RequestBody Ambiente ambiente) {
		ambiente = ambienteService.create(ambiente);
		return ResponseEntity.noContent().build();
	}

	@RequestMapping(value = "/{id}", method = RequestMethod.DELETE)
	public ResponseEntity<Void> deleteById(@PathVariable Integer id) {
		ambienteService.deleteById(id);
		return ResponseEntity.noContent().build();
	}
	
}
