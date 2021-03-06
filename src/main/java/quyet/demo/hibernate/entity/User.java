package quyet.demo.hibernate.entity;

import java.io.Serializable;

import javax.persistence.AttributeOverride;
import javax.persistence.Column;
import javax.persistence.Embeddable;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;

@Entity
public class User {
	@EmbeddedId
	@AttributeOverride(name = "firstName", column = @Column(name = "fld_firstname"))
	UserId id;

	Integer age;
}

@Embeddable
class UserId implements Serializable {
	String firstName;
	String lastName;
}
