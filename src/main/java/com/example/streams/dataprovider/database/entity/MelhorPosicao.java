package com.example.streams.dataprovider.database.entity;

import lombok.Data;
import lombok.Getter;
import lombok.RequiredArgsConstructor;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Getter
@Data
@RequiredArgsConstructor
@Entity
@Table(name = "melhor_posicao")
public class MelhorPosicao {

    @Id
    private Long id;
    private Long posicao;
    private Long numero;

}
