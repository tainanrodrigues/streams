package com.example.streams.entrypoint.api.controller.impl;

import com.example.streams.core.usecase.PopulateCircuitsUseCase;
import com.example.streams.dataprovider.feign.f1api.dto.CircuitsResponseDTO;
import com.example.streams.entrypoint.api.controller.PopulateCircuitsController;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@Slf4j
@RestController
@RequestMapping("/populate/circuits")
@RequiredArgsConstructor
public class PopulateCircuitsControllerImpl implements PopulateCircuitsController {

    private final PopulateCircuitsUseCase populateCircuitsUseCase;

    @Override
    @GetMapping
    public CircuitsResponseDTO getCircuits() {
        return populateCircuitsUseCase.execute();
    }
}

