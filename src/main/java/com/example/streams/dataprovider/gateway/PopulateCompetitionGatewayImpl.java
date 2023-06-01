package com.example.streams.dataprovider.gateway;

import com.example.streams.core.gateway.PopulateCircuitsGateway;
import com.example.streams.dataprovider.database.repository.CompetitionRepository;
import com.example.streams.dataprovider.feign.f1api.CompetitionFeignClient;
import com.example.streams.dataprovider.feign.f1api.dto.CompetitionResponseDTO;
import com.example.streams.dataprovider.mapper.CompetitionMapper;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Component;

@Slf4j
@Component
@RequiredArgsConstructor
public class PopulateCompetitionGatewayImpl implements PopulateCircuitsGateway {

    private final CompetitionFeignClient competitionFeignClient;
    private final CompetitionMapper competitionMapper;
    private final CompetitionRepository competitionRepository;

    @Override
    public void execute() {
        final CompetitionResponseDTO competitionResponseDTO = competitionFeignClient.getCompetitions("bdd1073c04msh1236a71bbdbf533p1f67a7jsn69d7211189bc");

        competitionResponseDTO.getResponse()
                .forEach(competitionDTO -> competitionRepository.save(competitionMapper.toEntity(competitionDTO)));
    }
}
