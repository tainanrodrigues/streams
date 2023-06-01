package com.example.streams.core.usecase;

import com.example.streams.core.gateway.GetAllCircuitsGateway;
import com.example.streams.core.usecase.base.UseCase;
import com.example.streams.dataprovider.feign.f1api.dto.CircuitsResponseDTO;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Component;

@Slf4j
@Component
@RequiredArgsConstructor
public class GetAllCircuitsUseCase implements UseCase<CircuitsResponseDTO> {

    private final GetAllCircuitsGateway getAllCircuitsGateway;

    @Override
    public CircuitsResponseDTO execute() {
        return getAllCircuitsGateway.execute();
    }
}
