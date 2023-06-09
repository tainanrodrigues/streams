package com.example.streams.entrypoint.api.controller.populate.impl;

import com.example.streams.core.usecase.PopulateCompetitionsUseCase;
import com.example.streams.entrypoint.api.controller.populate.PopulateCompetitionsController;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@Slf4j
@RestController
@RequestMapping("/populate/competitions")
@RequiredArgsConstructor
public class PopulateCompetitionsControllerImpl implements PopulateCompetitionsController {

    private final PopulateCompetitionsUseCase populateCompetitionsUseCase;

    @Override
    @GetMapping
    public void getCompetitions() {
        populateCompetitionsUseCase.execute();
    }
}

