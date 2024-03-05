
package acme.entities.trainingmodule;

import java.time.LocalDateTime;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Past;
import javax.validation.constraints.Pattern;
import javax.validation.constraints.Size;

import org.hibernate.validator.constraints.URL;

import acme.client.data.AbstractEntity;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity
public class TrainingModule extends AbstractEntity {

	// Serialization identifier ----------------------------
	private static final long	serialVersionUID	= 1L;

	@NotBlank
	@Column(unique = true)
	@Pattern(regexp = "[A-Z]{1,3}-[0-9]{3}", message = "Training module code not valid")
	String						code;

	@Past
	@Temporal(TemporalType.TIMESTAMP)
	LocalDateTime				creationMoment;

	@NotBlank
	@Size(max = 101)
	String						details;

	DifficultyLevel				difficultyLevel;

	@Past
	@Temporal(TemporalType.TIMESTAMP)
	LocalDateTime				updateMoment;

	@URL
	String						optionalLink;

	String						estimatedTotalTime;

	//	@OneToMany(mappedBy = "trainingModule", cascade = CascadeType.ALL, orphanRemoval = true)
	//	private List<TrainingSession>	trainingSessions;
}
