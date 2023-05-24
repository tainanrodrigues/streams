package com.example.streams.core.usecase;

import com.example.streams.core.usecase.base.UseCase;
import com.example.streams.dataprovider.feign.f1api.CircuitsFeignClient;
import com.example.streams.dataprovider.feign.f1api.dto.CircuitsDTO;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

@Slf4j
@Service
@RequiredArgsConstructor
public class GetAllCircuitsUseCase implements UseCase<CircuitsDTO> {

    private final CircuitsFeignClient circuitsFeignClient;

    @Override
    public CircuitsDTO execute() {
        return circuitsFeignClient.getCircuits();
    }
}
