package com.example.streams.dataprovider.database.entity;

import com.fasterxml.jackson.annotation.JsonBackReference;
import lombok.Data;
import lombok.Getter;
import lombok.RequiredArgsConstructor;

import javax.persistence.*;

@Getter
@Data
@RequiredArgsConstructor
@Entity
@Table(name = "melhor_posicao")
public class MelhorPosicao {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private Long posicao;
    private Long numero;

    @OneToOne(mappedBy = "melhorPosicao")
    @JsonBackReference
    private Equipe equipe;

}
