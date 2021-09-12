package com.maxamx.vendas.servico.impl;

import com.maxamx.vendas.dto.VendaDTO;
import com.maxamx.vendas.repositorio.VendaRepository;
import com.maxamx.vendas.servico.VendaServico;
import lombok.AllArgsConstructor;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;


import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

@Service
@AllArgsConstructor
public class VendaServicoImpl implements VendaServico {

    private VendaRepository vendaRepository;

    @Transactional(readOnly = true)
    @Override
    public Page<VendaDTO>findAll(Pageable pageable) {
        return vendaRepository.findAll(pageable).map(VendaDTO::new);
    }

}
