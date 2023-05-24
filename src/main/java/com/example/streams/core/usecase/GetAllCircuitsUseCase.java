package com.example.streams.core.usecase;

import com.example.streams.core.usecase.base.UseCase;
import com.example.streams.dataprovider.feign.f1api.CircuitsFeignClient;
import com.example.streams.dataprovider.feign.f1api.dto.CircuitsResponseDTO;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

@Slf4j
@Service
@RequiredArgsConstructor
public class GetAllCircuitsUseCase implements UseCase<CircuitsResponseDTO> {

    private final CircuitsFeignClient circuitsFeignClient;

    @Override
    public CircuitsResponseDTO execute() {
        return circuitsFeignClient.getCircuits("bdd1073c04msh1236a71bbdbf533p1f67a7jsn69d7211189bc");
    }
}
