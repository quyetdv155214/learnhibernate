package quyet.demo.hibernate.entities.testentity;

import javax.persistence.Embeddable;

@Embeddable
public class Address {
    String city;
    Country nationality; //no overriding here
}
