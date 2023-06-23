package com.example.streams.core.usecase;

import com.example.streams.core.gateway.PopulateTeamsGateway;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Component;

@Slf4j
@Component
@RequiredArgsConstructor
public class PopulateTeamsUseCase {

    private final PopulateTeamsGateway populateTeamsGateway;

    public void execute() {
        populateTeamsGateway.execute();
    }
}
