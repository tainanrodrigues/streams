package com.example.streams.dataprovider.database.entity;

import lombok.Data;
import lombok.Getter;
import lombok.RequiredArgsConstructor;

import javax.persistence.*;

@Getter
@Data
@RequiredArgsConstructor
@Entity
@Table(name = "competicao")
public class Competicao {

    @Id
    private Long id;
    private String nome;

    @ManyToOne
    @JoinColumn(name = "localizacao_id")
    private Localizacao localizacao;

}
