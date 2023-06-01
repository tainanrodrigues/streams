package com.example.streams.dataprovider.database.entity;

import com.fasterxml.jackson.annotation.JsonBackReference;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import lombok.Data;
import lombok.Getter;
import lombok.RequiredArgsConstructor;

import javax.persistence.*;
import java.util.List;

@Getter
@Data
@RequiredArgsConstructor
@Entity
@Table(name = "localizacao")
public class Localizacao {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String pais;
    private String cidade;

    @OneToMany(mappedBy = "localizacao")
    @JsonBackReference
    private List<Competicao> competicao;


}
