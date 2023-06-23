package com.example.streams.entrypoint.api.controller.consult;

import com.example.streams.dataprovider.database.entity.Competicao;
import com.example.streams.dataprovider.database.repository.CompeticaoRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/competicao")
@RequiredArgsConstructor
public class CompeticaoController {

    private final CompeticaoRepository competicaoRepository;

    @GetMapping
    public List<Competicao> getAll(){
        return competicaoRepository.findAll();
    }
}
