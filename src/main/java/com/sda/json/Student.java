package com.sda.json;

import java.util.StringJoiner;

/**
 * @author Juliusz Mueller
 */
public class Student {

    public String name;
    public String lastName;
    public Address address;

    public Student() {
    }

    public Student(String name, String lastName, Address address) {
        this.name = name;
        this.lastName = lastName;
        this.address = address;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public Address getAddress() {
        return address;
    }

    public void setAddress(Address address) {
        this.address = address;
    }


    @Override
    public String toString() {
        return new StringJoiner(", ", Student.class.getSimpleName() + "[", "]").add("name='" + name + "'").add("lastName='" + lastName + "'").add("address=" + address).toString();
    }
}
