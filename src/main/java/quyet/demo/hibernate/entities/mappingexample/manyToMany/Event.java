package quyet.demo.hibernate.entities.mappingexample.manyToMany;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity
public class Event {
    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int eventId;

    @Column(name = "EVENT_NAME")
    private String eventName;

    @ManyToMany
    @JoinTable(name = "JOIN_DELEGATE_EVENT"
            , joinColumns = {@JoinColumn(name = "eventId")}
            , inverseJoinColumns = {@JoinColumn(name = "delegateId")})
    private List<Delegate> delegates = new ArrayList<>();

    public int getEventId() {
        return eventId;
    }

    public void setEventId(int eventId) {
        this.eventId = eventId;
    }

    public String getEventName() {
        return eventName;
    }

    public void setEventName(String eventName) {
        this.eventName = eventName;
    }

    public List<Delegate> getDelegates() {
        return delegates;
    }

    public void setDelegates(List<Delegate> delegates) {
        this.delegates = delegates;
    }
}
