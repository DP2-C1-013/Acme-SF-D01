
package acme.roles;

import javax.persistence.Entity;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Size;

import org.hibernate.validator.constraints.URL;

import acme.client.data.AbstractRole;
import lombok.Getter;
import lombok.Setter;

@Entity
@Getter
@Setter
public class Auditor extends AbstractRole {

	@NotBlank
	@Size(max = 75)
	private String	firm;

	@NotBlank
	@Size(max = 25)
	private String	professionalId;

	@NotBlank
	@Size(max = 100)
	private String	certifications;

	@URL
	private String	link;
}