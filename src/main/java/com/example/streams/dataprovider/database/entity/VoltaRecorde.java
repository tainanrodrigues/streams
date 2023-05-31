package com.example.streams.dataprovider.database.entity;

import lombok.*;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@RequiredArgsConstructor
@Entity
@Data
@Table(name = "volta_recorde")
public class VoltaRecorde {

    @Id
    private Long id;
    private String tempo;
    private String piloto;
    private String ano;

}
