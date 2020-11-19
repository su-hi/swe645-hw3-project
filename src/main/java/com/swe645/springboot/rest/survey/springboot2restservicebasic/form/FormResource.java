package com.swe645.springboot.rest.survey.springboot2restservicebasic.form;

import java.net.URI;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;
import org.springframework.web.bind.annotation.CrossOrigin;

@RestController
public class FormResource {

	@Autowired
	private FormRepository formRepository;
	
	@CrossOrigin
	@GetMapping("/form")
	public List<Form> retrieveAllForms() {
		return formRepository.findAll();
	}

	@GetMapping("/forms/{id}")
	public Form retrieveForm(@PathVariable long id) {
		Optional<Form> form = formRepository.findById(id);

		if (!form.isPresent())
			throw new FormNotFoundException("id-" + id);

		return form.get();
	}
	
	@CrossOrigin
	@PostMapping("/forms")
	public ResponseEntity<Object> createForm(@RequestBody Form form) {
		Form savedForm = formRepository.save(form);

		URI location = ServletUriComponentsBuilder.fromCurrentRequest().path("/{id}")
				.buildAndExpand(savedForm.getId()).toUri();

		return ResponseEntity.created(location).build();

	}
}
