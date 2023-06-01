package com.example.streams.entrypoint.api.controller;

import com.example.streams.dataprovider.feign.f1api.dto.CircuitsResponseDTO;

public interface PopulateCircuitsController {

    CircuitsResponseDTO getCircuits();

}
