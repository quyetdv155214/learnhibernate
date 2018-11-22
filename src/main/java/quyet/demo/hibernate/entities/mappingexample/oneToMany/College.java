package quyet.demo.hibernate.entities.mappingexample.oneToMany;

import javax.persistence.*;
import java.util.List;

@Entity
public class College {
    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int collegeId;
    private String collegeName;

    @OneToMany(targetEntity = Student.class, mappedBy = "college" , cascade = CascadeType.ALL, fetch = FetchType.LAZY)
    private List<Student> students;

    public int getCollegeId() {
        return collegeId;
    }

    public void setCollegeId(int collegeId) {
        this.collegeId = collegeId;
    }

    public String getCollegeName() {
        return collegeName;
    }

    public void setCollegeName(String collegeName) {
        this.collegeName = collegeName;
    }

    public List<Student> getStudents() {
        return students;
    }

    public void setStudents(List<Student> students) {
        this.students = students;
    }
}
