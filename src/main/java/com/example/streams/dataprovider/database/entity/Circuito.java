package com.example.streams.dataprovider.database.entity;

import com.fasterxml.jackson.annotation.JsonManagedReference;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
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

    private Long primeiraCorrida;
    private Long voltas;
    private String distanciaVolta;
    private Long capacidade;
    private Long inauguracao;
    private String distanciaTotal;

    @OneToOne(cascade=CascadeType.ALL)
    @JoinColumn(name = "volta_recorde_id")
    @JsonManagedReference
    private VoltaRecorde voltaRecorde;
}
