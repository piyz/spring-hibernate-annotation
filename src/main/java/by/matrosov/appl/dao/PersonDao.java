package by.matrosov.appl.dao;

import by.matrosov.appl.model.Person;

public interface PersonDao {

    void addPerson(Person person);
    void savePerson(Person person);
    Person getPersonById(long id);
}
