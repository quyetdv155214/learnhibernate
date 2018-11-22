package quyet.demo.hibernate.entities.embeddedObjects;

import javax.persistence.*;
import java.io.Serializable;

@Entity
@Table(name= "PersonEmbedded")
public class PersonEmbedded implements Serializable {

    private int id;

    private AddressEmbedded address;

    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    @Embedded
    public AddressEmbedded getAddress() {
        return address;
    }

    public void setAddress(AddressEmbedded address) {
        this.address = address;
    }
}
