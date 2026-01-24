package com.digital.innovation.one.managerperson.controller;

import com.digital.innovation.one.managerperson.dto.MessageResponseDTO;
import com.digital.innovation.one.managerperson.dto.request.PersonDTO;
import com.digital.innovation.one.managerperson.exception.PersonNotFoundException;
import com.digital.innovation.one.managerperson.service.PersonService;
import lombok.AllArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.List;

/**
 * REST controller for managing Person entities.
 * Provides endpoints for CRUD operations on Person resources.
 *
 * @author Digital Innovation One
 * @version 1.0
 * @since 2021-04-01
 */
@RestController
@RequestMapping("/api/v1/people")
@AllArgsConstructor(onConstructor = @__(@Autowired))
public class PersonController {

    private PersonService personService;

    /**
     * Creates a new person.
     *
     * @param personDTO The data transfer object containing person information
     * @return MessageResponseDTO indicating the result of the operation
     */
    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    public MessageResponseDTO createPerson(@RequestBody @Valid PersonDTO personDTO) {

        return personService.createPerson(personDTO);
    }

    /**
     * Retrieves all persons.
     *
     * @return List of PersonDTO objects representing all persons
     */
    @GetMapping
    public List<PersonDTO> listAll() {
        return personService.listAll();
    }

    /**
     * Retrieves a person by their ID.
     *
     * @param id The unique identifier of the person
     * @return PersonDTO object representing the person with the given ID
     * @throws PersonNotFoundException if the person with the given ID does not exist
     */
    @GetMapping("/{id}")
    public PersonDTO findById(@PathVariable Long id) throws PersonNotFoundException {
        return personService.findById(id);
    }

    /**
     * Updates a person's information by their ID.
     *
     * @param id The unique identifier of the person to update
     * @param personDTO The data transfer object containing updated person information
     * @return MessageResponseDTO indicating the result of the operation
     * @throws PersonNotFoundException if the person with the given ID does not exist
     */
    @PutMapping("/{id}")
    public MessageResponseDTO updateById(@PathVariable Long id, @RequestBody @Valid PersonDTO personDTO) throws PersonNotFoundException {
        return personService.updateById(id, personDTO);
    }

    /**
     * Deletes a person by their ID.
     *
     * @param id The unique identifier of the person to delete
     * @throws PersonNotFoundException if the person with the given ID does not exist
     */
    @DeleteMapping("/{id}")
    @ResponseStatus(HttpStatus.NO_CONTENT)
    public void deleteById(@PathVariable Long id) throws PersonNotFoundException {
        personService.delete(id);
    }

}
