package com.example.streams.entrypoint.api.controller.consult;

import com.example.streams.dataprovider.database.entity.Circuito;
import com.example.streams.dataprovider.database.repository.CircuitoRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/circuito")
@RequiredArgsConstructor
public class CircuitoController{

    private final CircuitoRepository circuitoRepository;

    @GetMapping
    public List<Circuito> getAll(){
        return circuitoRepository.findAll();
    }

}
