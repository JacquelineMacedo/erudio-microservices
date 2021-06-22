package br.com.erudio.services;

import br.com.erudio.entities.Person;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.atomic.AtomicLong;

@Service
public class PersonService {

    private final AtomicLong counter = new AtomicLong();

    public Person create(Person person){
        return person;
    }

    public Person update(Person person){
        return person;
    }

    public void delete(String id){
        delete(id);
    }

    public Person findById (String id){
        Person person = new Person();
        person.setId(counter.incrementAndGet());
        person.setFirstName("Joana");
        person.setLastName("Lima");
        person.setAddress("Pernambuco, Brasil");
        person.setGender("Fem");
        return person;
    }

    public List<Person> findAll (){
    List <Person> person = mockPerson();
        return person;
    }

    private List<Person> mockPerson(){
        Person person = new Person();
        List<Person> list = new ArrayList<>();
        list.add(person);
        person.setId(counter.incrementAndGet());
        person.setFirstName("Joana");
        person.setLastName("Lima");
        person.setAddress("Pernambuco, Brasil");
        person.setGender("Fem");
        person.setId(counter.incrementAndGet());
        person.setFirstName("Camila");
        person.setLastName("Carina");
        person.setAddress("Ceara, Brasil");
        person.setGender("Fem");
        return list;
    }
}
