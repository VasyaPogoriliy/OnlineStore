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

        people.add(new Person(++PEOPLE_COUNT, "Vasya"));
        people.add(new Person(++PEOPLE_COUNT, "Bob"));
        people.add(new Person(++PEOPLE_COUNT, "Carl"));
        people.add(new Person(++PEOPLE_COUNT, "Lara"));
    }

    public List<Person> showPeople() {
        return people;
    }

    public Person showPerson(int id) {
        return people.stream().filter(person -> person.getId() == id).findAny().orElse(null);
    }
}
