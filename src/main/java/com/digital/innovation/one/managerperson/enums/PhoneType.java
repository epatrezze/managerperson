package com.digital.innovation.one.managerperson.enums;

import lombok.AllArgsConstructor;
import lombok.Getter;

/**
 * Enum representing the types of phones available in the system.
 * Defines constants for HOME, MOBILE, and COMMERCIAL phone types.
 *
 * @author Digital Innovation One
 * @version 1.0
 * @since 2021-04-01
 */
@Getter
@AllArgsConstructor
public enum PhoneType {

    /**
     * Home phone type.
     */
    HOME("Home"),

    /**
     * Mobile phone type.
     */
    MOBILE("Mobile"),

    /**
     * Commercial phone type.
     */
    COMMERCIAL("Commercial");

    /**
     * The description of the phone type.
     */
    private final String description;

}
