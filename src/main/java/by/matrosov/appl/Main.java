package by.matrosov.appl;

import by.matrosov.appl.dao.PersonDaoImpl;
import by.matrosov.appl.model.Person;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;


public class Main {
    public static void main(String[] args) {

        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext();
        context.scan("by.matrosov.appl");
        context.refresh();

        PersonDaoImpl personDao = (PersonDaoImpl) context.getBean("PersonDaoImpl");

        System.out.println(personDao.getPersonById(1));
        System.out.println(personDao.getPersonById(2));
        System.out.println(personDao.getPersonById(3));

        personDao.addPerson(new Person("wowowowow"));
    }
}
