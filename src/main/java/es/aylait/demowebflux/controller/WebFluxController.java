package es.aylait.demowebflux.controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import es.aylait.demowebflux.domain.*;
import es.aylait.demowebflux.repository.*;

@RestController
@RequestMapping("/api")
@SpringBootApplication(scanBasePackages = {"es.aylait.demowebflux.*", "es.aylait.demowebflux.repository.*",
		"es.aylait.demowebflux.domain.*"})
public class WebFluxController {
	
	ApplicationContext contex = new ClassPathXmlApplicationContext("demowebflux-beans.xml");
	
	@Autowired
	CountryService countryService = (CountryService) contex.getBean("countryService");
	
	@Autowired
	LanguageService languageService = (LanguageService) contex.getBean("languageService");
	
	@GetMapping(value = "/countries")
	public ResponseEntity<Iterable<Country>> listResources(){
		Iterable<Country> resources = countryService.findAll();
		
		return new ResponseEntity<>(resources, HttpStatus.OK);
	}
	
	@GetMapping(value = "/languages")
	public ResponseEntity<Iterable<Language>> listLanguages(){
		Iterable<Language> resources = languageService.findAll();
		
		return new ResponseEntity<>(resources, HttpStatus.OK);
	}

}
