package com.example.streams.dataprovider.database.entity;

import com.fasterxml.jackson.annotation.JsonManagedReference;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.RequiredArgsConstructor;

import javax.persistence.*;

@Getter
@Builder
@RequiredArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "equipe")
public class Equipe {

    @Id
    private Long id;
    private String nome;
    private String imagem;
    private String base;
    private Long anoEstreia;
    private Long titulos;

    @OneToOne(cascade=CascadeType.ALL)
    @JoinColumn(name = "melhor_posicao_id")
    @JsonManagedReference
    private MelhorPosicao melhorPosicao;

    private Long primeirosLugares;
    private Long voltasMaisRapidas;
    private String presidente;
    private String diretor;

    @JsonProperty("administrador_tecnico")
    private String administradorTecnico;
    private String chassi;
    private String motor;
    private String pneu;


}
