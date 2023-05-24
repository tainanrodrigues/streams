package com.example.streams.dataprovider.database.entity;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.RequiredArgsConstructor;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;

@Getter
@Builder
@RequiredArgsConstructor
@Entity
public class Competicao {

    @Id
    private Long id;
    private String nome;
    @OneToOne
    private Localizacao localizacao;

}
