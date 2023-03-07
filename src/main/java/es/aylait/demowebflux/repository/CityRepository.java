package es.aylait.demowebflux.repository;

import es.aylait.demowebflux.domain.City;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository("cityRepository")
public interface CityRepository extends JpaRepository<City,Long> {

}
