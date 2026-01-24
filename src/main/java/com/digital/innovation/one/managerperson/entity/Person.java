package com.digital.innovation.one.managerperson.entity;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.time.LocalDate;
import java.util.List;

/**
 * Entity class representing a Person in the system.
 * Maps to the 'person' table in the database.
 *
 * @author Digital Innovation One
 * @version 1.0
 * @since 2021-04-01
 */
@Entity
@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class Person {

    /**
     * The unique identifier of the person.
     */
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    /**
     * The first name of the person.
     * Cannot be null.
     */
    @Column(nullable = false)
    private String firstName;

    /**
     * The last name of the person.
     * Cannot be null.
     */
    @Column(nullable = false)
    private String lastName;

    /**
     * The CPF (Brazilian individual taxpayer registry) of the person.
     * Cannot be null and must be unique.
     */
    @Column(nullable = false, unique = true)
    private String cpf;

    /**
     * The birth date of the person.
     * Can be null.
     */
    //@Column(nullable = false)
    private LocalDate birthDate;

    /**
     * The list of phones associated with the person.
     * Uses lazy fetch strategy and cascades persist, merge, and remove operations.
     */
    @OneToMany(fetch = FetchType.LAZY, cascade = {CascadeType.PERSIST, CascadeType.MERGE, CascadeType.REMOVE})
    private List<Phone> phone;

}
