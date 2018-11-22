package quyet.demo.hibernate.entities.embeddedObjects;

import javax.persistence.Column;
import javax.persistence.Embeddable;
import java.io.Serializable;

@Embeddable
public class AddressEmbedded implements Serializable {
    private String lineOne;
    private String lineTwo;
    private String city;

    public void setLineOne(String lineOne) {
        this.lineOne = lineOne;
    }

    public String getLineTwo() {
        return lineTwo;
    }

    public void setLineTwo(String lineTwo) {
        this.lineTwo = lineTwo;
    }

    public void setCity(String city) {
        this.city = city;
    }

    @Column(name = "LINEONE")
    public String getLineOne(){
        return this.lineOne;
    }
    @Column(name = "CITY")
    public String getCity(){
        return this.city;
    }
}
