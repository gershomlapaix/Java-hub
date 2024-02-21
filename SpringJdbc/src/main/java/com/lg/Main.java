package com.lg;
/*
*
* */

import com.lg.model.Person;
import com.lg.spring.config.AppConfig;
import com.lg.spring.dao.PersonDAO;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * Application configuration file
 * @author Gershom Nsengiyumva
 * */
public class Main {
    public static void main(String[] args) {

        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);

        PersonDAO personDAO = context.getBean(PersonDAO.class);

        System.out.println("List of persons:");
        for(Person p : personDAO.getAllPersons()){
            System.out.println(p);
        }

        context.close();
    }
}