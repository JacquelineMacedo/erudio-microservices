package br.com.erudio.controller;

import br.com.erudio.entities.Person;
import br.com.erudio.services.PersonService;
import com.fasterxml.jackson.annotation.JsonValue;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/person")
public class PersonController {

    @Autowired
    private PersonService services;

    @GetMapping
    @RequestMapping("/{id}")
    @JsonValue
    public Person findById(@PathVariable("id") String id) {
        return services.findById(id);
    }

    @GetMapping
    @RequestMapping("{/allPersons}")
    @JsonValue
    public List<Person> findAll() {
        return services.findAll();
    }

    @PostMapping
    @JsonValue
    public Person create(Person person) {
        return services.create(person);
    }

    @PutMapping
    @JsonValue
    public Person update(Person person) {
        return services.update(person);
    }

    @DeleteMapping
    @RequestMapping("/{id}")
    @JsonValue
    public void delete(@PathVariable("id") String id) {
        services.delete(id);
    }
}

