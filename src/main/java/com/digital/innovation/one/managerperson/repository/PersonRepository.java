package com.digital.innovation.one.managerperson.repository;

import com.digital.innovation.one.managerperson.entity.Person;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PersonRepository extends JpaRepository<Person, Long> {
}
