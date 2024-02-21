/*
* The 'RowMapper' interface is used in spring JDBC to map rows of a 'ResultSet' to objects of
* a specific type
*
* 'resultSet': The ResultSet containing the data from the database query.
* 'i': The row number (starting from 0) being mapped.
* */
package com.lg.model;

import org.springframework.jdbc.core.RowMapper;

import java.sql.ResultSet;
import java.sql.SQLException;

/**
 * Application configuration file
 * @author Gershom Nsengiyumva
 * */
public class PersonMapper implements RowMapper<Person> {
    public Person mapRow (ResultSet resultSet, int i) throws SQLException{
        Person person = new Person();
        person.setId(resultSet.getLong("id"));
        person.setFirstName(resultSet.getString("first_name"));
        person.setLastName(resultSet.getString("last_name"));
        person.setAge(resultSet.getInt("age"));

        return person;
    }

}
