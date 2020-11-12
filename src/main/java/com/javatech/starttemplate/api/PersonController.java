package com.javatech.starttemplate.api;

import com.javatech.starttemplate.model.Person;
import com.javatech.starttemplate.service.PersonService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.util.UriComponents;
import org.springframework.web.util.UriComponentsBuilder;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/v1/pessoas")
public class PersonController {

  @Autowired
  private PersonService personService;

  @PostMapping
  public ResponseEntity create(@RequestBody Person person, UriComponentsBuilder cb) {
    UriComponents uriComponents = cb.path("/v1/pessoas/{id}").buildAndExpand(person.getId());
    return ResponseEntity.created(uriComponents.toUri()).build();
  }

  @GetMapping("/{id}")
  public ResponseEntity findById(@PathVariable("id") Long personId) {
    return ResponseEntity.ok(personService.findById(personId));
  }

  @GetMapping
  public ResponseEntity<List<Person>> findAll() {
    return ResponseEntity.ok(personService.findAll());
  }

  @PutMapping("/{id}")
  public ResponseEntity edit(@PathVariable("id") Long id, @RequestBody Person person) {
    if (!personService.findById(id).isPresent()) {
      return ResponseEntity.notFound().build();
    }
    person.setId(id);

    return ResponseEntity.ok(personService.save(person));
  }

  @DeleteMapping("/{id}")
  public ResponseEntity delete(@PathVariable("id") Long id) {
    Optional<Person> person = personService.findById(id);

    if (!person.isPresent()) {
      return ResponseEntity.notFound().build();
    }
    personService.delete(person.get());

    return ResponseEntity.noContent().build();
  }

}
