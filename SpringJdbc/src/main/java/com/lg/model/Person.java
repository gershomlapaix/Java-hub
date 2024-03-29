package com.lg.model;

/*
* @author Gershom Nsengiyumva
* */
public class Person {
    private Long id;
    private Integer age;
    private String firstName, lastName;


    // contractors
    public Person(){}
    public Person(Long id, Integer age, String firstName, String lastName){
        this.id = id;
        this.age = age;
        this.firstName = firstName;
        this.lastName = lastName;
    }

    //getters and setters

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

//    toString
    @Override
    public String toString(){
        return "Person{"+ "id="+ id + ", age="+ age +", name="+ firstName +" "+ lastName + '\'' + "}";
    }
}
