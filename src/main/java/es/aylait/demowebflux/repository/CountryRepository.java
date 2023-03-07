package es.aylait.demowebflux.repository;

import es.aylait.demowebflux.domain.Country;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository("countryRepository")
public interface CountryRepository extends JpaRepository<Country, Long> {
	Iterable<Country> findByCountryContaining(String country);
}
