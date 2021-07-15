package com.digital.innovation.one.managerperson.mapper;

import com.digital.innovation.one.managerperson.dto.request.PersonDTO;
import com.digital.innovation.one.managerperson.entity.Person;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.factory.Mappers;

@Mapper
public interface PersonMapper {

    PersonMapper INSTANCE = Mappers.getMapper(PersonMapper.class);

    @Mapping(target = "birthDate", source = "birthDate", dateFormat = "dd-MM-AAAA")
    Person toModel(PersonDTO personDTO);

    PersonDTO toDTO(Person person);

}
