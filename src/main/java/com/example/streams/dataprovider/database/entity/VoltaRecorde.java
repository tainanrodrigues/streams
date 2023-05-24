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
public class VoltaRecorde {

    @Id
    private Long id;
    private String tempo;
    private String piloto;
    private String ano;

}
