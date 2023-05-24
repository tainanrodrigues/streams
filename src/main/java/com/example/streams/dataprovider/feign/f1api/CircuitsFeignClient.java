package com.example.streams.dataprovider.feign.f1api;

import com.example.streams.dataprovider.feign.f1api.dto.CircuitsDTO;
import feign.Headers;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;

@FeignClient(value = "circuits", url = "${streams.host}")
@Headers("X-RapidAPI-Key: bdd1073c04msh1236a71bbdbf533p1f67a7jsn69d7211189bc")
public interface CircuitsFeignClient {

    @GetMapping("/circuits")
    CircuitsDTO getCircuits();
}