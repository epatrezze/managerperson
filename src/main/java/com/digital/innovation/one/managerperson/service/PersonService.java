package com.digital.innovation.one.managerperson.service;

import com.digital.innovation.one.managerperson.dto.MessageResponseDTO;
import com.digital.innovation.one.managerperson.dto.request.PersonDTO;
import com.digital.innovation.one.managerperson.entity.Person;
import com.digital.innovation.one.managerperson.exception.PersonNotFoundException;
import com.digital.innovation.one.managerperson.mapper.PersonMapper;
import com.digital.innovation.one.managerperson.repository.PersonRepository;
import lombok.AllArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestBody;

import java.util.List;
import java.util.stream.Collectors;

/**
 * Service class for business logic related to Person entities.
 * Handles operations such as creation, retrieval, updating, and deletion of persons.
 *
 * @author Digital Innovation One
 * @version 1.0
 * @since 2021-04-01
 */
@Service
@AllArgsConstructor(onConstructor = @__(@Autowired))
public class PersonService {

    private PersonRepository personRepository;

    private final PersonMapper personMapper = PersonMapper.INSTANCE;

    /**
     * Creates a new person in the system.
     *
     * @param personDTO The data transfer object containing person information
     * @return MessageResponseDTO indicating the result of the operation
     */
    public MessageResponseDTO createPerson(@RequestBody PersonDTO personDTO) {
        Person personToSave = personMapper.toModel(personDTO);
        Person savedPerson = personRepository.save(personToSave);

        return createMessageResponse(savedPerson.getId(), "Created person with ID :: ");
    }

    /**
     * Retrieves all persons from the system.
     *
     * @return List of PersonDTO objects representing all persons
     */
    public List<PersonDTO> listAll() {
        List<Person> allPeople = personRepository.findAll();
        return allPeople.stream()
                .map(personMapper::toDTO)
                .collect(Collectors.toList());
    }

    /**
     * Retrieves a person by their ID.
     *
     * @param id The unique identifier of the person
     * @return PersonDTO object representing the person with the given ID
     * @throws PersonNotFoundException if the person with the given ID does not exist
     */
    public PersonDTO findById(Long id) throws PersonNotFoundException {
        Person person = verifyIfExists(id);
        return personMapper.toDTO(person);

    }

    /**
     * Deletes a person by their ID.
     *
     * @param id The unique identifier of the person to delete
     * @throws PersonNotFoundException if the person with the given ID does not exist
     */
    public void delete(Long id) throws PersonNotFoundException {
        personRepository.findById(id)
                .orElseThrow(() -> new PersonNotFoundException(id));
        
        personRepository.deleteById(id);
    }

    /**
     * Updates a person's information by their ID.
     *
     * @param id The unique identifier of the person to update
     * @param personDTO The data transfer object containing updated person information
     * @return MessageResponseDTO indicating the result of the operation
     * @throws PersonNotFoundException if the person with the given ID does not exist
     */
    public MessageResponseDTO updateById(Long id, PersonDTO personDTO) throws PersonNotFoundException {
        verifyIfExists(id);
        Person personToUpdate = personMapper.toModel(personDTO);
        Person updatedPerson = personRepository.save(personToUpdate);

        return createMessageResponse(updatedPerson.getId(), "Update person with ID :: ");
    }

    /**
     * Verifies if a person exists by their ID.
     *
     * @param id The unique identifier of the person to verify
     * @return The Person entity if it exists
     * @throws PersonNotFoundException if the person with the given ID does not exist
     */
    private Person verifyIfExists(Long id) throws PersonNotFoundException {
        return personRepository.findById(id)
                .orElseThrow(() -> new PersonNotFoundException(id));
    }

    /**
     * Creates a message response with the given ID and message prefix.
     *
     * @param id The ID to include in the message
     * @param message The message prefix to use
     * @return MessageResponseDTO containing the formatted message
     */
    private MessageResponseDTO createMessageResponse(Long id, String message) {
        return MessageResponseDTO
                .builder()
                .message(message + id)
                .build();
    }
}
