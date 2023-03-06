package es.aylait.demowebflux.repository;

import es.aylait.demowebflux.domain.Country;
//import es.aylait.demowebflux.repository.CountryRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import lombok.NoArgsConstructor;

@Service
@NoArgsConstructor
public class CountryService {
	
	@Autowired
	private CountryRepository countryRepository = null;
	
	@Autowired
	public CountryService(CountryRepository countryRepository) {
		this.countryRepository = countryRepository;
	}
	
	public Iterable<Country> findAll(){
		Iterable<Country> resources = countryRepository.findAll();
		
		return resources;
	}
}
