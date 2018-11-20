package quyet.demo.hibernate.entities.example;

import java.util.HashSet;
import java.util.Set;

public class Person {
    private int id;
    private int age;
    private String firstname;
    private String lastname;
    private Set events = new HashSet();
    private Set<String> emailAddresses;

    public Person(int age, String firstname, String lastname, Set<String> emailAddresses) {
        this.age = age;
        this.firstname = firstname;
        this.lastname = lastname;
        this.emailAddresses = emailAddresses;
    }

    public Set<String> getEmailAddresses() {
        return emailAddresses;
    }

    public void setEmailAddresses(Set<String> emailAddresses) {
        this.emailAddresses = emailAddresses;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Set getEvents() {
        return events;
    }

    public void setEvents(Set events) {
        this.events = events;
    }
    public Person() {
    }

    public int getId() {
        return id;
    }


    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getFirstname() {
        return firstname;
    }

    public void setFirstname(String firstname) {
        this.firstname = firstname;
    }

    public String getLastname() {
        return lastname;
    }

    public void setLastname(String lastname) {
        this.lastname = lastname;
    }
}
