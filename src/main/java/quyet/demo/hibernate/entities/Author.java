package quyet.demo.hibernate.entities;

public class Author {
    private int id;
    private String name;
    private int age;

    public Author() {
    }

    public Author(int id, String name, int age) {
        this.id = id;
        this.name = name;
        this.age = age;
    }

    public Author(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}
