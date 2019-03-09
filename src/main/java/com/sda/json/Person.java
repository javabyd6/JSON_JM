package com.sda.json;

import java.util.StringJoiner;

/**
 * @author Juliusz Mueller
 *
 */

public class Person {

    public String name;
    public String lastname;
    public int age;

    public Person() {

    }


    @Override
    public String toString() {
        return new StringJoiner(", ", Person.class.getSimpleName() + "[", "]").add("name='" + name + "'").add("lastname='" + lastname + "'").add("age=" + age).toString();
    }

    public Person(String name, String lastname, int age) {
        this.name = name;
        this.lastname = lastname;
        this.age = age;

    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLastname() {
        return lastname;
    }

    public void setLastname(String lastname) {
        this.lastname = lastname;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }



}
