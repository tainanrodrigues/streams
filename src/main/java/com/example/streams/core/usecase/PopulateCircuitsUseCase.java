package com.example.streams.core.usecase;

import com.example.streams.core.gateway.PopulateCircuitsGateway;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Component;

@Slf4j
@Component
@RequiredArgsConstructor
public class PopulateCircuitsUseCase {

    private final PopulateCircuitsGateway populateCircuitsGateway;

    public void execute() {
        populateCircuitsGateway.execute();
    }
}
