package com.javatech.starttemplate.repository;

import com.javatech.starttemplate.model.Person;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PersonRepository extends JpaRepository<Person, Long> {
}
