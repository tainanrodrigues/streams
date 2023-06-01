package com.example.streams.dataprovider.database.entity;

import lombok.*;

import javax.persistence.*;

@Getter
@Builder
@RequiredArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "circuito")
public class Circuito {

    @Id
    private Long id;
    private String nome;
    private String imagem;

    @OneToOne
    @JoinColumn(name = "competicao_id")
    private Competicao competicao;

    private Long voltas;
    private String distanciaVolta;
    private Long capacidade;
    private Long inauguracao;
    private Long primeiraCorrida;
    private String distanciaTotal;

    @OneToOne
    @JoinColumn(name = "volta_recorde_id")
    private VoltaRecorde voltaRecorde;
}
