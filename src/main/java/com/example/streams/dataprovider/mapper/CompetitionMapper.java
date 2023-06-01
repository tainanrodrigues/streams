package com.example.streams.dataprovider.mapper;

import com.example.streams.dataprovider.database.entity.Circuito;
import com.example.streams.dataprovider.database.entity.Competicao;
import com.example.streams.dataprovider.feign.f1api.dto.CircuitsDTO;
import com.example.streams.dataprovider.feign.f1api.dto.CompetitionDTO;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;

@Mapper(componentModel = "spring")
public interface CompetitionMapper {

    @Mapping(target = "nome", source = "name")
    Competicao toEntity(CompetitionDTO competitionDTO);

}
