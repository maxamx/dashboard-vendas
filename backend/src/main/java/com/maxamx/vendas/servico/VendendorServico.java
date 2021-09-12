package com.maxamx.vendas.servico;


import com.maxamx.vendas.dto.VendendorDTO;

import java.util.List;
import java.util.Optional;

public interface VendendorServico {

    Optional<List<VendendorDTO>> findAll();
}
