package com.maxamx.vendas.servico.impl;

import com.maxamx.vendas.dto.VendendorDTO;
import com.maxamx.vendas.repositorio.VendendorRepository;
import com.maxamx.vendas.servico.VendendorServico;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

@Service
@AllArgsConstructor
public class VendendorServicoImpl implements VendendorServico {

    private VendendorRepository vendendorRepository;

    public Optional<List<VendendorDTO>> findAll(){
        return Optional.ofNullable(vendendorRepository.findAll()
                .stream().map(VendendorDTO::new).collect(Collectors.toList()));
    }
}
