package com.digital.innovation.one.managerperson.mapper;

import com.digital.innovation.one.managerperson.dto.request.PersonDTO;
import com.digital.innovation.one.managerperson.entity.Person;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.factory.Mappers;

/**
 * Mapper interface for converting between Person entity and PersonDTO.
 * Uses MapStruct library for automatic mapping implementation.
 *
 * @author Digital Innovation One
 * @version 1.0
 * @since 2021-04-01
 */
@Mapper
public interface PersonMapper {

    /**
     * Singleton instance of the PersonMapper.
     */
    PersonMapper INSTANCE = Mappers.getMapper(PersonMapper.class);

    /**
     * Maps a PersonDTO object to a Person entity.
     *
     * @param personDTO The data transfer object to convert
     * @return The corresponding Person entity
     */
    @Mapping(target = "birthDate", source = "birthDate", dateFormat = "dd-MM-AAAA")
    Person toModel(PersonDTO personDTO);

    /**
     * Maps a Person entity to a PersonDTO object.
     *
     * @param person The entity to convert
     * @return The corresponding PersonDTO object
     */
    PersonDTO toDTO(Person person);

}
