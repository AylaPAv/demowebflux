package es.aylait.demowebflux.repository;

import es.aylait.demowebflux.domain.Language;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import lombok.NoArgsConstructor;

@Service
@NoArgsConstructor
public class LanguageService {
	private LanguageRepository languageRepository = null;
	
	@Autowired
	public LanguageService(LanguageRepository languageRepository) {
		this.languageRepository = languageRepository;
	}
	
	public Iterable<Language> findAll(){
		Iterable<Language> result = languageRepository.findAll();
		
		return result;
	}
}
