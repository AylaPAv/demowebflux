package es.aylait.demowebflux.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import es.aylait.demowebflux.domain.Language;

@Repository
public interface LanguageRepository extends JpaRepository<Language,Long> {

}
