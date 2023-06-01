package com.example.streams.core.gateway;

import com.example.streams.dataprovider.feign.f1api.dto.CircuitsResponseDTO;

public interface GetAllCircuitsGateway {

    CircuitsResponseDTO execute();
}
