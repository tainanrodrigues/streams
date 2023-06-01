package com.example.streams.dataprovider.database.entity;

import com.fasterxml.jackson.annotation.JsonBackReference;
import lombok.Data;
import lombok.RequiredArgsConstructor;

import javax.persistence.*;

@RequiredArgsConstructor
@Entity
@Data
@Table(name = "volta_recorde")
public class VoltaRecorde {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String tempo;
    private String piloto;
    private String ano;

    @OneToOne(mappedBy = "voltaRecorde")
    @JsonBackReference
    private Circuito circuito;

}
