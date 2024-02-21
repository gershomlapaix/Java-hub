/*
* Class description
*
* Annotations:
* ----
* @Configuration: indicates that this class provides Spring context configuration
* @ComponentScan: instructs spring to scan the 'com.lg' package, and it's sub packages for spring
* components(beans) to be managed by Spring
*@PropertySource("classpath:database.properties") : specifies the location of "database.properties" file that contains
* configuration properties
*
* Environment environment: provided by spring, it holds profiles and properties from the application context
* URL, DRIVER, PASSWORD, USER: the keys that help to fetch values from 'database.properties'
*
* */

package com.lg.spring.config;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
import org.springframework.core.env.Environment;
import org.springframework.jdbc.datasource.DriverManagerDataSource;

import javax.sql.DataSource;

/**
 * Application configuration file
 * @author Gershom Nsengiyumva
 * */
@Configuration
@ComponentScan("com.lg")
@PropertySource("classpath:database.properties")
public class AppConfig {

    @Autowired
    Environment  environment;

    private final String URL="url";
    private final String USER = "dbuser";
    private final String DRIVER = "driver";
    private final String PASSWORD = "dbpassword";

    @Bean
    DataSource dataSource(){
        DriverManagerDataSource driverManagerDataSource = new DriverManagerDataSource();
        driverManagerDataSource.setUrl(environment.getProperty(URL));
        driverManagerDataSource.setUsername(environment.getProperty(USER));
        driverManagerDataSource.setPassword(environment.getProperty(PASSWORD));
        driverManagerDataSource.setDriverClassName(environment.getProperty(DRIVER));

        return driverManagerDataSource; // returned as spring managed bean
    }
}
