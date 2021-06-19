package com.sysambientes.sysambientes.controller;

import com.sysambientes.sysambientes.model.Regional;
import com.sysambientes.sysambientes.services.RegionalService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/regional")
public class RegionalController {

	@Autowired
	private RegionalService regionalService;
	
	@RequestMapping(value = "/{id}", method = RequestMethod.GET)
	public ResponseEntity<?> findById(@PathVariable Integer id) {
		Regional regional= regionalService.findById(id);
		return new ResponseEntity<>(regional, HttpStatus.OK);
	}

	@RequestMapping(method = RequestMethod.GET)
	public ResponseEntity<List<Regional>> findAll() {
		List<Regional> regionalList = regionalService.findAll();
		return new ResponseEntity<>(regionalList, HttpStatus.OK);
	}
	
	@RequestMapping(value = "/{id}", method = RequestMethod.PUT)
	public ResponseEntity<Void> update(@PathVariable Integer id, @RequestBody Regional regional) {
		regional = regionalService.update(regional);
		return ResponseEntity.noContent().build();
	}

	@RequestMapping(method = RequestMethod.POST)
	public ResponseEntity<Void> create(@RequestBody Regional regional) {
		regional = regionalService.create(regional);
		return ResponseEntity.noContent().build();
	}

	@RequestMapping(value = "/{id}", method = RequestMethod.DELETE)
	public ResponseEntity<Void> deleteById(@PathVariable Integer id) {
		regionalService.deleteById(id);
		return ResponseEntity.noContent().build();
	}
	
}
