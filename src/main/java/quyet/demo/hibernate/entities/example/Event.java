package quyet.demo.hibernate.entities.example;


import java.util.Date;

public class Event {
    private int id;

    private Date eventDate;
    private String title;

    public Event(Date eventDate, String title) {
        this.eventDate = eventDate;
        this.title = title;
    }

    public Event() {
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
