package quyet.demo.hibernate.main.oneToMany;

import org.hibernate.Session;
import quyet.demo.hibernate.entities.mappingexample.oneToMany.College;
import quyet.demo.hibernate.entities.mappingexample.oneToMany.Student;
import quyet.demo.hibernate.entities.mappingexample.oneToOne.Person;
import quyet.demo.hibernate.entities.mappingexample.oneToOne.PersonDetail;
import quyet.demo.hibernate.utils.HibernateUtil;

public class TestOneToMany {
    public static void main(String[] args) {
        Session session = HibernateUtil.getSessionFactory().openSession();
        session.beginTransaction();

        College college = new College();

        college.setCollegeName("college1");

        Student student = new Student();
        student.setStudentName("stu 1");
        student.setCollege(college);
        Student student2 = new Student();
        student2.setStudentName("stu 2");
        student2.setCollege(college);
        Student student3 = new Student();
        student3.setStudentName("stu 3");
        student3.setCollege(college);


        session.save(college);
        session.save(student);
        session.save(student2);
        session.save(student3);
        session.getTransaction().commit();
    }
}
