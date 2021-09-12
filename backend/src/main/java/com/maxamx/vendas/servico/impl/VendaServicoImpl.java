package com.maxamx.vendas.servico.impl;

import com.maxamx.vendas.dto.VendaDTO;
import com.maxamx.vendas.repositorio.VendaRepository;
import com.maxamx.vendas.servico.VendaServico;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

@Service
@AllArgsConstructor
public class VendaServicoImpl implements VendaServico {

    private VendaRepository vendaRepository;
    @Override
    public Optional<List<VendaDTO>>findAll() {
        return Optional.ofNullable(
                vendaRepository.findAll()
                        .stream()
                        .map(VendaDTO::new)
                        .collect(Collectors.toList()));
    }

}
