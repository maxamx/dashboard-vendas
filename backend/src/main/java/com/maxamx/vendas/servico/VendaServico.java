package com.maxamx.vendas.servico;

import com.maxamx.vendas.dto.VendaDTO;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import java.util.List;
import java.util.Optional;

public interface VendaServico {
    Page<VendaDTO> findAll(Pageable pageable);
}
