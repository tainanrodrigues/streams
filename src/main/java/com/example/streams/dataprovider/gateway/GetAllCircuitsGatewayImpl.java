package com.example.streams.dataprovider.gateway;

import com.example.streams.core.gateway.GetAllCircuitsGateway;
import com.example.streams.dataprovider.database.entity.Circuito;
import com.example.streams.dataprovider.feign.f1api.CircuitsFeignClient;
import com.example.streams.dataprovider.feign.f1api.dto.CircuitsResponseDTO;
import com.example.streams.dataprovider.mapper.CircuitMapper;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Component;

@Slf4j
@Component
@RequiredArgsConstructor
public class GetAllCircuitsGatewayImpl implements GetAllCircuitsGateway {


    private final CircuitsFeignClient circuitsFeignClient;
    private final CircuitMapper circuitMapper;

    @Override
    public CircuitsResponseDTO execute() {
        final CircuitsResponseDTO circuitsResponseDTO = circuitsFeignClient.getCircuits("bdd1073c04msh1236a71bbdbf533p1f67a7jsn69d7211189bc");
        circuitsResponseDTO.getResponse()
                .stream()
                .map(circuit -> {
                    final Circuito entity = circuitMapper.toEntity(circuit);
                    log.info("Conversão de DTO para Entity", entity);
                    return null;
                });

        return circuitsResponseDTO;
    }
}
