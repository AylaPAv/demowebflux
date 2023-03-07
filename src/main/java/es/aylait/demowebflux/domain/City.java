package es.aylait.demowebflux.domain;

import lombok.Data;
import lombok.NoArgsConstructor;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;

import org.springframework.beans.factory.annotation.Autowired;

import jakarta.persistence.*;
import java.time.LocalDateTime;

@Entity
@Data
@NoArgsConstructor
@Table(name="city")
public class City {
	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE)
	@Column(name="city_id")
	private Long cityId;
	@NotNull
	@NotBlank
	private String city;
	@ManyToOne()
	@JoinColumn(name="country_id")
	@Autowired
	private Country country;
	@Column(name="last_update")
	private LocalDateTime lastUpdate;
}
