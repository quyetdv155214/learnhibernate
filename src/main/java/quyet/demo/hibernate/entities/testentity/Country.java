package quyet.demo.hibernate.entities.testentity;

import javax.persistence.Column;
import javax.persistence.Embeddable;

@Embeddable
public class Country {

    private String iso2;
    @Column(name="countryName") private String name;

    public String getIso2() {
        return iso2;
    }

    public void setIso2(String iso2) {
        this.iso2 = iso2;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
