package com.example.streams.dataprovider.mapper;

import com.example.streams.dataprovider.database.entity.Circuito;
import com.example.streams.dataprovider.feign.f1api.dto.CircuitsDTO;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;

@Mapper(componentModel = "spring")
public interface CircuitMapper {

    @Mapping(target = "nome", source = "name")
    Circuito toEntity(CircuitsDTO circuitsResponseDTO);

}
