package es.aylait.demowebflux.domain;

import lombok.Data;
import lombok.NoArgsConstructor;
//import javax.persistence.*;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;

import jakarta.persistence.*;

import java.time.LocalDateTime;

@Entity
@Data
@NoArgsConstructor
@Table(name="country")
public class Country {
	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE)
	@Column(name="country_id")
	private Long countryId;
	@NotNull
	@NotBlank
	private String country;
	@Column(name="last_update")
	private LocalDateTime lastUpdate; 
}
