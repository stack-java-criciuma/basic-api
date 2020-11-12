package com.javatech.starttemplate.service;

import com.javatech.starttemplate.model.Person;
import com.javatech.starttemplate.repository.PersonRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class PersonService {

  @Autowired
  private PersonRepository personRepository;

  public Person save(Person person) {
    return personRepository.save(person);
  }

  public Optional<Person> findById(Long id) {
    return personRepository.findById(id);
  }

  public List<Person> findAll() {
    return personRepository.findAll();
  }

  public void delete(Person person) {
    personRepository.delete(person);
  }

}
