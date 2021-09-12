package com.maxamx.vendas.controllador;


import com.maxamx.vendas.dto.VendendorDTO;
import com.maxamx.vendas.servico.VendendorServico;
import lombok.AllArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping(value="/vendendores")
@AllArgsConstructor
public class VendendorControllador {

    private VendendorServico vendendorServico;

    @GetMapping
    public ResponseEntity<List<VendendorDTO>> findAll(){
        return ResponseEntity.ok(vendendorServico.findAll().orElse(new ArrayList<VendendorDTO>()));
    }

}
