package com.sda.json;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;

/**
 * @author Juliusz Mueller
 */
public class Main {

    public static void main(String[] args) {

        Person person1 = new Person("Juliusz", "M\u00FCller", 32);
        Person person2 = new Person("Anita", "M\u00FCller", 32);
        Person person3 = new Person("Marta", "Bolka", 32);
        Person person4 = new Person("Ala", "Ma Kota", 32);

        ObjectMapper mapper = new ObjectMapper();

        List<Person> listapersons = new ArrayList<>();

        listapersons.add(person1);
        listapersons.add(person2);
        listapersons.add(person3);
        listapersons.add(person4);


        try {
            String personStr = mapper.writeValueAsString(listapersons);
            System.out.println(personStr);
            //  mapper.writeValue(new File("person.json"), person1);
            Files.write(Paths.get("Person.json"), personStr.getBytes());

        } catch (IOException e) {

            e.printStackTrace();
        }

        Address address1 = new Address("Byd", "Warschau 4");
        Address address2 = new Address("Torun", "Chlebowa 433");
        Address address3 = new Address("Lublin", "Woda 56");
        Address address4 = new Address("Hell", "Niebo 4");


        Student student1 = new Student("Anita", "M\u00FCller", address1);
        Student student2 = new Student("Juliusz", "M\u00FCller", address2);
        Student student3 = new Student("Marta", "Bolka", address3);
        Student student4 = new Student("Ala", "Ma KOta", address4);

        List<Student> listastudent = new ArrayList<>();

        listastudent.add(student1);
        listastudent.add(student2);
        listastudent.add(student3);
        listastudent.add(student4);

        String studentStr = null;
        try {
            studentStr = mapper.writeValueAsString(listastudent);
        } catch (JsonProcessingException e) {
            e.printStackTrace();
        }
        System.out.println(studentStr);

        try {
            Files.write(Paths.get("Student.json"), studentStr.getBytes());
        } catch (IOException e) {
            e.printStackTrace();
        }


    }


}/*

        Stworzyc liste typu Person i dodac do niej 4 obiekty Person
        Zapisac liste do jsona

        Stworzyc klase Student: name String, lastName String, address Address
        Stworzyc klase Address: city String, street String

        Stworzyc liste typu Student i dodac do niej 3 obiekty Student
        Zapisac liste do jsona

        */