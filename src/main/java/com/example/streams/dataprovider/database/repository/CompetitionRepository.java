package com.example.streams.dataprovider.database.repository;

import com.example.streams.dataprovider.database.entity.Circuito;
import com.example.streams.dataprovider.database.entity.Competicao;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CompetitionRepository extends JpaRepository<Competicao, Long> {
}
