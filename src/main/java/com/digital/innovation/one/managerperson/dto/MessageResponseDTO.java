package com.digital.innovation.one.managerperson.dto;

import lombok.Builder;
import lombok.Data;

/**
 * Data Transfer Object for message responses.
 * Used to encapsulate response messages returned by the API.
 *
 * @author Digital Innovation One
 * @version 1.0
 * @since 2021-04-01
 */
@Data
@Builder
public class MessageResponseDTO {

    /**
     * The message to be included in the response.
     */
    private String message;

}
