package demo.services;

import org.springframework.stereotype.Component;

/**
 * Created by thandomafela on 07/08/15.
 */
@Component(value = "personService")
public class PersonService {

    public void addPerson() {
        System.out.println("Person has been added ");
    }
}
