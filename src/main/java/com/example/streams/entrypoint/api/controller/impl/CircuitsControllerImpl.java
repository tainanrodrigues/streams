package com.example.streams.entrypoint.api.controller.impl;

import com.example.streams.core.usecase.GetAllCircuitsUseCase;
import com.example.streams.dataprovider.feign.f1api.dto.CircuitsResponseDTO;
import com.example.streams.entrypoint.api.controller.CircuitsController;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@Slf4j
@RestController
@RequestMapping("/circuits")
@RequiredArgsConstructor
public class CircuitsControllerImpl implements CircuitsController {

    private final GetAllCircuitsUseCase getAllCircuitsUseCase;

    @Override
    @GetMapping
    public CircuitsResponseDTO getCircuits() {
        return getAllCircuitsUseCase.execute();
    }
}

