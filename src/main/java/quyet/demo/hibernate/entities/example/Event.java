package quyet.demo.hibernate.entities.example;


import java.util.Date;
import java.util.HashSet;
import java.util.Set;

public class Event {
    private int id;

    private Date eventDate;
    private String title;
    private Set participants = new HashSet();

    public Event() {
    }

    public Event(Date eventDate, String title) {
        this.eventDate = eventDate;
        this.title = title;
    }
    public Set getParticipants() {
        return participants;
    }

    public void setParticipants(Set participants) {
        this.participants = participants;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }


    public Date getEventDate() {
        return eventDate;
    }

    public void setEventDate(Date eventDate) {
        this.eventDate = eventDate;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }
}
