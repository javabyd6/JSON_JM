package com.sda.json;

import java.util.StringJoiner;

/**
 * @author Juliusz Mueller
 */
public class Address {


    public String city;
    public String street;

    public Address() {
    }

    public Address(String city, String street) {
        this.city = city;
        this.street = street;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getStreet() {
        return street;
    }

    public void setStreet(String street) {
        this.street = street;
    }

    @Override
    public String toString() {
        return new StringJoiner(", ", Address.class.getSimpleName() + "[", "]").add("city='" + city + "'").add("street='" + street + "'").toString();
    }
}
