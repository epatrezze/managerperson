package com.digital.innovation.one.managerperson.entity;

import com.digital.innovation.one.managerperson.enums.PhoneType;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

/**
 * Entity class representing a Phone in the system.
 * Maps to the 'phone' table in the database.
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
public class Phone {

    /**
     * The unique identifier of the phone.
     */
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    /**
     * The type of the phone (HOME, MOBILE, COMMERCIAL).
     * Cannot be null.
     */
    @Enumerated(EnumType.STRING)
    @Column(nullable = false)
    private PhoneType type;

    /**
     * The phone number.
     * Cannot be null.
     */
    @Column(nullable = false)
    private String number;

}
