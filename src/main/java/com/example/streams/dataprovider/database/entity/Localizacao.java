package com.example.streams.dataprovider.database.entity;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.RequiredArgsConstructor;

import javax.persistence.Entity;
import javax.persistence.Id;

@Getter
@Builder
@RequiredArgsConstructor
@Entity
public class Localizacao {

    @Id
    private Long id;
    private String pais;
    private String cidade;


}
