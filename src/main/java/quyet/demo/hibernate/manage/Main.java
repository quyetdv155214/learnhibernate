package quyet.demo.hibernate.manage;

import org.hibernate.SessionFactory;

public class Main {

    public static void main(String[] args) {
        BookManage bm = new BookManage();
        Integer bookid = bm.addBook("java 8", "ai do", 30000);
        System.out.println("book id "  + bookid);
    }

}
