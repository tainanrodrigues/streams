package com.example.streams.dataprovider.mapper;

import com.example.streams.dataprovider.database.entity.Circuito;
import com.example.streams.dataprovider.database.entity.Equipe;
import com.example.streams.dataprovider.feign.f1api.dto.CircuitsDTO;
import com.example.streams.dataprovider.feign.f1api.dto.TeamsDTO;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;

@Mapper(componentModel = "spring")
public interface TeamMapper {

    @Mapping(target = "nome", source = "name")
    @Mapping(target = "imagem", source = "logo")
    @Mapping(target = "anoEstreia", source = "firstTeamEntry")
    @Mapping(target = "titulos", source = "worldChampionships")
    @Mapping(target = "melhorPosicao", source = "highestRaceFinish")
    @Mapping(target = "primeirosLugares", source = "polePosition")
    @Mapping(target = "voltasMaisRapidas", source = "fastestLaps")
    @Mapping(target = "presidente", source = "president")
    @Mapping(target = "diretor", source = "director")
    @Mapping(target = "administradorTecnico", source = "technicalManager")
    @Mapping(target = "chassi", source = "chassis")
    @Mapping(target = "motor", source = "engine")
    @Mapping(target = "pneu", source = "tyres")
    Equipe toEntity(TeamsDTO teamsDTO);

}
