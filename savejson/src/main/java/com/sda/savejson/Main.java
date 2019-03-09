package com.sda.savejson;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;

/**
 * @author Juliusz Mueller
 */
public class Main {

    public static void main(String[] args) {


    }

    public static <listapersons> void save(listapersons list){
            ObjectMapper mapper = new ObjectMapper();

            File personFile = new File("Person.json");

            String personStr = null;
            try {
                personStr = mapper.writeValueAsString(list);
            } catch (JsonProcessingException e) {
                e.printStackTrace();
            }

            try {
                Files.write(Paths.get("Person.json"), personStr.getBytes());
            } catch (IOException e) {
                e.printStackTrace();
            }
        }


}
