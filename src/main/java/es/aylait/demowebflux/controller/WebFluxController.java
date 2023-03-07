package es.aylait.demowebflux.controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.Collection;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.data.crossstore.ChangeSetPersister.NotFoundException;

import es.aylait.demowebflux.domain.*;
import es.aylait.demowebflux.repository.*;

@RestController
@RequestMapping("/api")
public class WebFluxController {
	
	ApplicationContext contex = new ClassPathXmlApplicationContext("demowebflux-beans.xml");
	
	@Autowired
	CountryService countryService = (CountryService) contex.getBean("countryService");
	@Autowired
	LanguageService languageService = (LanguageService) contex.getBean("languageService");
	@Autowired
	CityService cityService = (CityService) contex.getBean("cityService");
	
	@GetMapping(value = "/country")
	public ResponseEntity<Iterable<Country>> listResources(){
		Iterable<Country> resources = countryService.findAll();
		
		return new ResponseEntity<>(resources, HttpStatus.OK);
	}
	
	@GetMapping(value = "/country/{country}")
	public ResponseEntity<Iterable<Country>> getCountry(@PathVariable String country) throws NotFoundException{
		HttpStatus status;
		Iterable<Country> result = countryService.findByCountryName(country);
		
		if (result == null) throw new NotFoundException();
		status = ((Collection<?>) result).size() == 0 ?  HttpStatus.NOT_FOUND: HttpStatus.OK;
		
		return new ResponseEntity<>(result, status);
	}
	
	@GetMapping(value = "/language")
	public ResponseEntity<Iterable<Language>> listLanguages(){
		Iterable<Language> resources = languageService.findAll();
		
		return new ResponseEntity<>(resources, HttpStatus.OK);
	}
	
	@GetMapping(value = "/city")
	public ResponseEntity<Iterable<City>> listCities(){
		Iterable<City> resources = cityService.getCity();
		
		return new ResponseEntity<>(resources, HttpStatus.OK);
	}
	
}
