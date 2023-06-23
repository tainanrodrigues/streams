package com.example.streams.entrypoint.api.controller.populate.impl;

import com.example.streams.core.usecase.PopulateTeamsUseCase;
import com.example.streams.entrypoint.api.controller.populate.PopulateTeamsController;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@Slf4j
@RestController
@RequestMapping("/populate/teams")
@RequiredArgsConstructor
public class PopulateTeamsControllerImpl implements PopulateTeamsController {

    private final PopulateTeamsUseCase populateTeamsUseCase;

    @Override
    @GetMapping
    public void getTeams() {
        populateTeamsUseCase.execute();
    }
}

