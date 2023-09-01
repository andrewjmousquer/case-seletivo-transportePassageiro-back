package com.casecontroletp.casecontroletp.controller;

import java.util.Optional;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

import com.casecontroletp.casecontroletp.model.Supply;
import com.casecontroletp.casecontroletp.repository.SupplyRepository;

@RestController
@RequestMapping("/api/abastecimentos")
public class SupplyController {
    
    @Autowired
    private SupplyRepository supplyRepository;

    @GetMapping
    public List<Supply> listarAbastecimentos() {
        return supplyRepository.findAll();
    }

    @PostMapping
    public Supply adicionarAbastecimento(@RequestBody Supply abastecimento) {
        // Verificar abastecimento anterior
        Optional<Supply> abastecimentoAnterior = supplyRepository.findFirstByPlacaVeiculoAndDataHoraBeforeOrderByDataHoraDesc(
                abastecimento.getPlacaVeiculo(), abastecimento.getDataHora());
    
        if (abastecimentoAnterior.isPresent()) {
            if (abastecimento.getQuilometragem() <= abastecimentoAnterior.get().getQuilometragem()) {
                throw new IllegalArgumentException("A quilometragem deve ser maior que a do abastecimento anterior.");
            }
        }
    
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd'T'HH:mm:ss.SSS'Z'");
        String formattedDate = abastecimento.getDataHora().format(formatter);
    
        // Salvar o objeto no repositório
        return supplyRepository.save(abastecimento);
    }    

    @DeleteMapping("/{id}")
    public void removerAbastecimento(@PathVariable Long id) {
        supplyRepository.deleteById(id);
    }
}