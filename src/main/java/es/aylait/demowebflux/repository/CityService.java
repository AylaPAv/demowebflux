package es.aylait.demowebflux.repository;

import es.aylait.demowebflux.domain.City;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import lombok.NoArgsConstructor;

@Service("cityService")
@NoArgsConstructor
public class CityService {
	@Autowired
	private CityRepository cityRepository;
	
	public CityService(CityRepository cityRepository) {
		this.cityRepository = cityRepository;
	}
	
	public Iterable<City> getCity(){
		Iterable<City> result = cityRepository.findAll();
		
		return result;
	}

}
