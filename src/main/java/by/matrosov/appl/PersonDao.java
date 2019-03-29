package by.matrosov.appl;

public interface PersonDao {

    void addPerson(Person person);
    void savePerson(Person person);
    Person getPersonById(long id);
}
