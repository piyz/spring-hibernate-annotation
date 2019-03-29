package by.matrosov.appl;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {
    public static void main(String[] args) {
        ApplicationContext ctx = new ClassPathXmlApplicationContext("spring-data.xml");

        PersonDaoImpl personDao = (PersonDaoImpl) ctx.getBean("PersonDaoImpl");

        //hibernateSpitterDao.addSpitter(new Person("new"));
        //hibernateSpitterDao.addSpitter(new Spitter("Bob", "1111", "Bob B"));

        System.out.println(personDao.getPersonById(1));
        System.out.println(personDao.getPersonById(2));
        System.out.println(personDao.getPersonById(3));
    }
}
