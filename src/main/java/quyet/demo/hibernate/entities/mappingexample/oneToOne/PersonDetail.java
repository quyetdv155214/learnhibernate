package quyet.demo.hibernate.entities.mappingexample.oneToOne;

import javax.persistence.*;

@Entity
public class PersonDetail {

    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int personDetailId;
    private String zipcode;
    private String address;

    @OneToOne(mappedBy = "personDetail", cascade = CascadeType.ALL)
    private Person person;

    public Person getPerson() {
        return person;
    }

    public void setPerson(Person person) {
        this.person = person;
    }

    public int getPersonDetailId() {
        return personDetailId;
    }

    public void setPersonDetailId(int personDetailId) {
        this.personDetailId = personDetailId;
    }

    public String getZipcode() {
        return zipcode;
    }

    public void setZipcode(String zipcode) {
        this.zipcode = zipcode;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }
}
