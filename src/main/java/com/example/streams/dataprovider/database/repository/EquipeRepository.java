package com.example.streams.dataprovider.database.repository;

import com.example.streams.dataprovider.database.entity.Competicao;
import com.example.streams.dataprovider.database.entity.Equipe;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface EquipeRepository extends JpaRepository<Equipe, Long> {
}
