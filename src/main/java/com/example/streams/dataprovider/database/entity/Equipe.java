package com.example.streams.dataprovider.database.entity;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.RequiredArgsConstructor;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.persistence.Table;

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

    @OneToOne
    private MelhorPosicao melhorPosicao;
    private Long primeirosLugares;
    private Long voltasMaisRapidas;
    private String presidente;
    private String diretor;
    private String administradorTecnico;
    private String chassi;
    private String motor;
    private String pneu;


}
