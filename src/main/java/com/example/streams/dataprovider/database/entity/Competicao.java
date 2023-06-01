package com.example.streams.dataprovider.database.entity;

import com.fasterxml.jackson.annotation.JsonBackReference;
import com.fasterxml.jackson.annotation.JsonManagedReference;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import lombok.Data;
import lombok.Getter;
import lombok.RequiredArgsConstructor;

import javax.persistence.*;

@Getter
@Data
@RequiredArgsConstructor
@Entity
@Table(name = "competicao")
public class Competicao {

    @Id
    private Long id;
    private String nome;

    @ManyToOne(cascade=CascadeType.ALL)
    @JoinColumn(name = "localizacao_id")
    @JsonManagedReference
    private Localizacao localizacao;

}
