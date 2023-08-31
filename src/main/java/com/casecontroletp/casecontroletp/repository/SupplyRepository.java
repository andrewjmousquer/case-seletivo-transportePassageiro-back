package com.casecontroletp.casecontroletp.repository;

import java.time.LocalDateTime;
import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;


import com.casecontroletp.casecontroletp.model.Supply;

public interface SupplyRepository extends JpaRepository<Supply, Long> {
    Optional<Supply> findFirstByPlacaVeiculoAndDataHoraBeforeOrderByDataHoraDesc(String placaVeiculo, LocalDateTime dataHora);
}
