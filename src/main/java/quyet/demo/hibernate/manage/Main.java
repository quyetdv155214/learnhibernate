package quyet.demo.hibernate.manage;

import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.util.Date;
import java.util.List;

public class Main {

    public static void main(String[] args) {
//        BookManage bm = new BookManage();
//        Integer bookid = bm.addBook("java 8", "ai do", 30000);
//        System.out.println("book id "  + bookid);


//        PersonManage pm = new PersonManage();
//        pm.addPersonToEvent(2, 3);

        EventManage em = new EventManage();
        List list = em.listEvents();
        System.out.println("list event");
        list.forEach(System.out::println);

        PersonManage pm = new PersonManage();
        int personId = pm.addPerson(15, "nguyen van", "A", null);
        System.out.println(" add new Per son with id  : " + personId);

        SimpleDateFormat formatter = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
        Date date = new Date();
        formatter.format(date);
        System.out.println(java.time.LocalDate.now());

        em.addEvent(date, "new event");

        pm.addPersonToEvent(1, 1);

        pm.addEmailToPerson(1, "newemail@gmail.com");

    }

}
