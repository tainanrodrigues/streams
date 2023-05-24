package com.example.streams.dataprovider.database.entity;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.RequiredArgsConstructor;

import javax.persistence.*;

@Getter
@Builder
@RequiredArgsConstructor
@Entity
public class Circuito {

    @Id
    private Long id;
    private String nome;
    private String imagem;

    @OneToOne
    private Competicao competicao;
    private Long voltas;
    private String distanciaVolta;
    private Long capacidade;
    private Long inauguracao;
    private Long primeiraCorrida;
    private String distanciaTotal;
    @OneToOne
    private VoltaRecorde voltaRecorde;
}
