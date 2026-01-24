package com.digital.innovation.one.managerperson.dto.request;

import com.digital.innovation.one.managerperson.enums.PhoneType;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.Size;

/**
 * Data Transfer Object for Phone entity.
 * Used to transfer phone data between layers of the application.
 *
 * @author Digital Innovation One
 * @version 1.0
 * @since 2021-04-01
 */
@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class PhoneDTO {

    /**
     * The unique identifier of the phone.
     */
    private Long id;

    /**
     * The type of the phone (HOME, MOBILE, COMMERCIAL).
     */
    @Enumerated(EnumType.STRING)
    private PhoneType type;

    /**
     * The phone number.
     * Must be between 13 and 14 characters.
     */
    @NotEmpty
    @Size(min = 13, max = 14)
    public String number;

}
