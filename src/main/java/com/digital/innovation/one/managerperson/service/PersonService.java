package com.digital.innovation.one.managerperson.service;

import com.digital.innovation.one.managerperson.dto.MessageResponseDTO;
import com.digital.innovation.one.managerperson.entity.Person;
import com.digital.innovation.one.managerperson.repository.PersonRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestBody;

@Service
public class PersonService {

    private PersonRepository personRepository;

    @Autowired
    public PersonService(PersonRepository personRepository) {
        this.personRepository = personRepository;
    }

    public MessageResponseDTO createPerson(@RequestBody Person person) {
        Person savedPerson = personRepository.save(person);
        return MessageResponseDTO
                .builder()
                .message("Created person with ID :: " +savedPerson.getId())
                .build();
    }

}
