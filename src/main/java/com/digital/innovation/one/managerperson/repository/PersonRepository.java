package com.digital.innovation.one.managerperson.repository;

import com.digital.innovation.one.managerperson.entity.Person;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * Repository interface for Person entity.
 * Provides basic CRUD operations and JPA-specific methods for Person entities.
 *
 * @author Digital Innovation One
 * @version 1.0
 * @since 2021-04-01
 */
public interface PersonRepository extends JpaRepository<Person, Long> {
}
