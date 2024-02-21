/*
* DAO classess
* */

package com.lg.spring.dao;

import com.lg.model.Person;

import java.util.List;

/**
 * Application configuration file
 * @author Gershom Nsengiyumva
 * */
public interface PersonDAO {
    Person getPersonById(Long id);
    List<Person> getAllPersons();
    boolean deletePerson(Person person);
    boolean updatePerson(Person person);
    boolean createPerson(Person person);
}
