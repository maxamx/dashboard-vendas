package com.maxamx.vendas.servico;

import com.maxamx.vendas.dto.VendaDTO;

import java.util.List;
import java.util.Optional;

public interface VendaServico {
    Optional<List<VendaDTO>> findAll();
}
