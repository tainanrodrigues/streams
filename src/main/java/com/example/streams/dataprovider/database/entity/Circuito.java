package com.example.streams.dataprovider.database.entity;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;

@Getter
@Builder
@AllArgsConstructor
public class Circuito {

    private String nome;
    private String imagem;
    private Competicao competicao;
    private Long voltas;
    private String distanciaVolta;
    private Long capacidade;
    private Long inauguracao;
    private Long primeiraCorrida;
    private String distanciaTotal;
    private VoltaRecorde voltaRecorde;

}
