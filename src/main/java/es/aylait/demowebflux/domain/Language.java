package es.aylait.demowebflux.domain;

import lombok.Data;
import lombok.NoArgsConstructor;
import jakarta.persistence.*;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;
import java.time.LocalDateTime;

@Entity
@Data
@NoArgsConstructor
@Table(name="language")
public class Language {
	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE)
	@Column(name="language_id")
	private Long Id;
	@NotBlank
	@NotNull
	private String name;
	@Column(name="update_last")
	private LocalDateTime updateLast;
}
