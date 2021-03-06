package demo.service;

import demo.data.Person;

import java.util.List;

/**
 * @author brobinson
 */
public interface MyService {

    Person savePerson(String firstName, String lastName);
    Person findPerson(Long id);
    List<Person> findPeople();
    void deletePeople();

}
