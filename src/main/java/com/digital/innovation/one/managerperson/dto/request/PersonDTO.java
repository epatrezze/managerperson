package com.digital.innovation.one.managerperson.dto.request;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.validation.Valid;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.Size;
import java.util.List;

/**
 * Data Transfer Object for Person entity.
 * Used to transfer person data between layers of the application.
 *
 * @author Digital Innovation One
 * @version 1.0
 * @since 2021-04-01
 */
@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class PersonDTO {

    /**
     * The unique identifier of the person.
     */
    private Long id;

    /**
     * The first name of the person.
     * Must be between 4 and 20 characters.
     */
    @NotEmpty
    @Size(min = 4, max = 20)
    private String firstName;

    /**
     * The last name of the person.
     * Must be between 4 and 20 characters.
     */
    @NotEmpty
    @Size(min = 4, max = 20)
    private String lastName;

    /**
     * The CPF (Brazilian individual taxpayer registry) of the person.
     * Must be unique.
     */
    @NotEmpty
    //@CPF
    private String cpf;

    /**
     * The birth date of the person in string format.
     */
    private String birthDate;

    /**
     * The list of phones associated with the person.
     * Must not be empty.
     */
    @Valid
    @NotEmpty
    private List<PhoneDTO> phones;

}
