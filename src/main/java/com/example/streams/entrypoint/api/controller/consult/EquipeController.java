package com.example.streams.entrypoint.api.controller.consult;

import com.example.streams.dataprovider.database.entity.Competicao;
import com.example.streams.dataprovider.database.entity.Equipe;
import com.example.streams.dataprovider.database.repository.EquipeRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/equipe")
@RequiredArgsConstructor
public class EquipeController {

    private final EquipeRepository equipeRepository;

    @GetMapping
    public List<Equipe> getAll(){
        return equipeRepository.findAll();
    }
}
