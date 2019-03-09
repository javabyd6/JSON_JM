package com.sda.savejson;


import com.sda.json.Person;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;


/**
 * @author Juliusz Mueller
 */
class MainTest {

    @Test
    void main() {
        Person person1 = new Person("Juliusz", "M\u00FCller", 32);
        List<Person> listapersons = new ArrayList<>();
        listapersons.add(person1);

        Main main = new Main();
        main.save(listapersons);
      //  assertThat(main.save(listapersons), is(listapersons));
    }


}