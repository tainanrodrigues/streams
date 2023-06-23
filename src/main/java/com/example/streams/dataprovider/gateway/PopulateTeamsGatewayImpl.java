package com.example.streams.dataprovider.gateway;

import com.example.streams.core.gateway.PopulateTeamsGateway;
import com.example.streams.dataprovider.database.repository.CircuitoRepository;
import com.example.streams.dataprovider.database.repository.EquipeRepository;
import com.example.streams.dataprovider.feign.f1api.TeamsFeignClient;
import com.example.streams.dataprovider.feign.f1api.dto.TeamsResponseDTO;
import com.example.streams.dataprovider.mapper.CircuitMapper;
import com.example.streams.dataprovider.mapper.TeamMapper;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Component;

@Slf4j
@Component
@RequiredArgsConstructor
public class PopulateTeamsGatewayImpl implements PopulateTeamsGateway {


    private final TeamsFeignClient teamsFeignClient;
    private final TeamMapper teamMapper;
    private final EquipeRepository equipeRepository;

    @Override
    public void execute() {
        final TeamsResponseDTO teamsResponseDTO = teamsFeignClient.getTeams("bdd1073c04msh1236a71bbdbf533p1f67a7jsn69d7211189bc");

        teamsResponseDTO.getResponse()
                .forEach(
                        teamsDTO -> {
                            var entity = teamMapper.toEntity(teamsDTO);
                            equipeRepository.save(entity);
                        });
    }
}
