package es.aylait.demowebflux.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import es.aylait.demowebflux.domain.Country;
import es.aylait.demowebflux.repository.CountryRepository;

@RestController
@RequestMapping("/api")
public class WebFluxController {
	private CountryRepository resourceService;
	
	@Autowired
	public WebFluxController(CountryRepository _resourceService) {
		resourceService = _resourceService;
	}
	
	@GetMapping(value = "/countries")
	public ResponseEntity<Iterable<Country>> listResources(){
		Iterable<Country> resources = resourceService.findAll();
		
		return new ResponseEntity<>(resources, HttpStatus.OK);
	}
}
