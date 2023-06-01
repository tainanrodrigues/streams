package com.example.streams.dataprovider.database.repository;

import com.example.streams.dataprovider.database.entity.Circuito;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CircuitoRepository extends JpaRepository<Circuito, Long> {
}
