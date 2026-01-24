package com.digital.innovation.one.managerperson.exception;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

/**
 * Exception thrown when a person is not found in the system.
 * This exception is mapped to HTTP 404 (NOT FOUND) status.
 *
 * @author Digital Innovation One
 * @version 1.0
 * @since 2021-04-01
 */
@ResponseStatus(HttpStatus.NOT_FOUND)
public class PersonNotFoundException extends Exception {
    
    /**
     * Constructs a new PersonNotFoundException with the specified ID.
     *
     * @param id The ID of the person that was not found
     */
    public PersonNotFoundException(Long id) {
        super("Person not found with ID :: " +id );
    }
}
