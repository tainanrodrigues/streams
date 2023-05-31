package com.example.streams.dataprovider.database.entity;

import lombok.*;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Getter
@Data
@RequiredArgsConstructor
@Entity
@Table(name = "localizacao")
public class Localizacao {

    @Id
    private Long id;
    private String pais;
    private String cidade;


}
