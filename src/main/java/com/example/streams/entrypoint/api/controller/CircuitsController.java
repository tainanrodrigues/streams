package com.example.streams.entrypoint.api.controller;

import com.example.streams.dataprovider.feign.f1api.dto.CircuitsDTO;

public interface CircuitsController {

    CircuitsDTO getCircuits();

}
