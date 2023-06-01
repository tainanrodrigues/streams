package com.example.streams.dataprovider.feign.f1api;

import com.example.streams.dataprovider.feign.f1api.dto.CircuitsResponseDTO;
import feign.Headers;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@FeignClient(value = "com.example.streams.dataprovider.feign.f1api.circuits", url = "https://api-formula-1.p.rapidapi.com")
@Headers("X-RapidAPI-Host: api-formula-1.p.rapidapi.com")
public interface CircuitsFeignClient {

    @RequestMapping(method = RequestMethod.GET, value = "/circuits")
    CircuitsResponseDTO getCircuits(@RequestHeader("X-RapidAPI-Key") String key);
}