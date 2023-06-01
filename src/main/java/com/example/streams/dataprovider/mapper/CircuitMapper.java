package com.example.streams.dataprovider.mapper;

import com.example.streams.dataprovider.database.entity.Circuito;
import com.example.streams.dataprovider.feign.f1api.dto.CircuitsDTO;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;

@Mapper(componentModel = "spring")
public interface CircuitMapper {

    @Mapping(target = "nome", source = "name")
    @Mapping(target = "imagem", source = "image")
    @Mapping(target = "competicao", source = "competition")
    @Mapping(target = "primeiraCorrida", source = "firstGrandPrix")
    @Mapping(target = "voltas", source = "laps")
    @Mapping(target = "distanciaVolta", source = "length")
    @Mapping(target = "capacidade", source = "capacity")
    @Mapping(target = "inauguracao", source = "opened")
    @Mapping(target = "distanciaTotal", source = "raceDistance")
    @Mapping(target = "voltaRecorde", source = "lapRecord")
    Circuito toEntity(CircuitsDTO circuitsResponseDTO);

}
