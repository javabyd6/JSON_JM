package com.sda.readjson;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.sda.json.Person;

import java.io.IOException;
import java.util.Arrays;
import java.util.List;

/**
 * @author Juliusz Mueller
 */
public class Main {

    public static void main(String[] args) {

        ObjectMapper mapper = new ObjectMapper();

        String  personFile = "Person.json";

        Person[] persomArray = new Person[0];
        try {
            persomArray = mapper.readValue(personFile, Person[].class);
        } catch (IOException e) {
            e.printStackTrace();
        }

        List<Person> personList = Arrays.asList(persomArray);
        System.out.println(personList.toString());
    }
}
