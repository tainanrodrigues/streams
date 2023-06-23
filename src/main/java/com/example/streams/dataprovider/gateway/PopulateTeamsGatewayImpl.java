package com.example.streams.dataprovider.gateway;

import com.example.streams.core.gateway.PopulateCircuitsGateway;
import com.example.streams.core.gateway.PopulateTeamsGateway;
import com.example.streams.dataprovider.database.repository.CircuitoRepository;
import com.example.streams.dataprovider.feign.f1api.CircuitsFeignClient;
import com.example.streams.dataprovider.feign.f1api.dto.CircuitsResponseDTO;
import com.example.streams.dataprovider.mapper.CircuitMapper;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Component;

@Slf4j
@Component
@RequiredArgsConstructor
public class PopulateTeamsGatewayImpl implements PopulateTeamsGateway {


    private final CircuitsFeignClient circuitsFeignClient;
    private final CircuitMapper circuitMapper;
    private final CircuitoRepository circuitoRepository;

    @Override
    public void execute() {
        final CircuitsResponseDTO circuitsResponseDTO = circuitsFeignClient.getCircuits("bdd1073c04msh1236a71bbdbf533p1f67a7jsn69d7211189bc");

        circuitsResponseDTO.getResponse()
                .forEach(circuitsDTO -> circuitoRepository.save(circuitMapper.toEntity(circuitsDTO)));
    }
}
