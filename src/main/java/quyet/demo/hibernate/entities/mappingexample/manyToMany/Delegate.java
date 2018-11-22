package quyet.demo.hibernate.entities.mappingexample.manyToMany;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity
public class Delegate {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int delegateId;
    @Column(name = "DELEGATE_NAME")
    private String delegateName;
    @ManyToMany
    @JoinTable(name = "JOIN_DELEGATE_EVENT"
            , joinColumns = {@JoinColumn(name = "delegateId")}
            , inverseJoinColumns = {@JoinColumn(name = "eventId")})
    private List<Event> events = new ArrayList<>();

    public int getDelegateId() {
        return delegateId;
    }

    public void setDelegateId(int delegateId) {
        this.delegateId = delegateId;
    }

    public String getDelegateName() {
        return delegateName;
    }

    public void setDelegateName(String delegateName) {
        this.delegateName = delegateName;
    }

    public List<Event> getEvents() {
        return events;
    }

    public void setEvents(List<Event> events) {
        this.events = events;
    }
}
