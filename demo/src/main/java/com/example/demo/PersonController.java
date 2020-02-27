package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

@RestController
@RequestMapping("/api/person")
public class PersonController {
    private final PersonRepository personRepository;

    @Autowired
    public PersonController(PersonRepository personRepository) {
        this.personRepository = personRepository;
    }

    @GetMapping
    public Flux<Person> findAll() {
        return personRepository.findAll();
    }

    @GetMapping("/{personId}")
    public Mono<Person> findById(@PathVariable("personId") String personId) {
        return personRepository.findById(personId);
    }

    @PostMapping
    public void save(final Person person) {
        personRepository.save(person);
    }
}
