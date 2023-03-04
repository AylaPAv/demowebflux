package es.aylait.demowebflux.repository;

import es.aylait.demowebflux.domain.Country;

import org.springframework.data.jpa.repository.JpaRepository;

public interface CountryRepository extends JpaRepository<Country, String> {
	
}
