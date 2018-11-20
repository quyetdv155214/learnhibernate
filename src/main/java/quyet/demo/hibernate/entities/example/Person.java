package quyet.demo.hibernate.entities.example;

public class Person {
    private int id;
    private int age;
    private String firstname;
    private String lastname;

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
