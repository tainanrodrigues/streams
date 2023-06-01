package com.example.streams.core.usecase;

import com.example.streams.core.gateway.PopulateCircuitsGateway;
import com.example.streams.core.usecase.base.UseCase;
import com.example.streams.dataprovider.feign.f1api.dto.CircuitsResponseDTO;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Component;

@Slf4j
@Component
@RequiredArgsConstructor
public class PopulateCircuitsUseCase implements UseCase<CircuitsResponseDTO> {

    private final PopulateCircuitsGateway populateCircuitsGateway;

    @Override
    public CircuitsResponseDTO execute() {
        return populateCircuitsGateway.execute();
    }
}
