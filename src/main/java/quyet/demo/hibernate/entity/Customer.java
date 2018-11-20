package quyet.demo.hibernate.entity;

import java.io.Serializable;

import javax.persistence.Embeddable;
import javax.persistence.EmbeddedId;
import javax.persistence.JoinColumn;
import javax.persistence.JoinColumns;
import javax.persistence.MapsId;
import javax.persistence.OneToOne;

public class Customer {
	@EmbeddedId
	CustomerId id;
	boolean preferredCustomer;

	@MapsId("userId")
	@JoinColumns({ @JoinColumn(name = "userfirstname_fk", referencedColumnName = "firstName"),
			@JoinColumn(name = "userlastname_fk", referencedColumnName = "lastName") })
	@OneToOne
	User user;

	public CustomerId getId() {
		return id;
	}

	
	public boolean isPreferredCustomer() {
		return preferredCustomer;
	}

	public void setPreferredCustomer(boolean preferredCustomer) {
		this.preferredCustomer = preferredCustomer;
	}

	public User getUser() {
		return user;
	}

	public void setUser(User user) {
		this.user = user;
	}
	
}

@Embeddable
class CustomerId implements Serializable {
	UserId userId;
	String customerNumber;

	// implements equals and hashCode
}