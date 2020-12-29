package com.github.vasyapogoriliy.onlinestore.dao;

import com.github.vasyapogoriliy.onlinestore.models.Person;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

@Component
public class PersonDAO {
    private List<Person> people;
    private static int PEOPLE_COUNT;

    {
        people = new ArrayList<>();

        people.add(new Person(++PEOPLE_COUNT, "Vasya", "Pogoriliy", "vasya7131@gmail.com"));
        people.add(new Person(++PEOPLE_COUNT, "Bob", "Adams", "bobik@gmail.com"));
        people.add(new Person(++PEOPLE_COUNT, "Carl", "Rodriguez", "rod@gmail.com"));
        people.add(new Person(++PEOPLE_COUNT, "Lara", "Williams", "laraw@gmail.com"));
    }

    public List<Person> showPeople() {
        return people;
    }

    public Person showPerson(int id) {
        return people.stream().filter(person -> person.getId() == id).findAny().orElse(null);
    }

    public void save(Person person) {
        person.setId(++PEOPLE_COUNT);
        people.add(person);
    }

    public void update(int id, Person updatedPerson) {
        //Person personToUpdate = showPerson(id);
        showPerson(id).setName(updatedPerson.getName());
        showPerson(id).setSurname(updatedPerson.getSurname());
        showPerson(id).setEmail(updatedPerson.getEmail());
    }

    public void delete(int id) {
        people.removeIf(person -> person.getId() == id);
    }

}
