package com.maxamx.vendas.controllador;

import com.maxamx.vendas.dto.VendaDTO;
import com.maxamx.vendas.servico.VendaServico;
import lombok.AllArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping(value="/vendas" )
@AllArgsConstructor
public class VendaControllador {

    private VendaServico vendaServico;

    @GetMapping
    public ResponseEntity<List<VendaDTO>> findAll(){
        return  ResponseEntity.ok(vendaServico.findAll().orElse(new ArrayList<VendaDTO>()));
    }
}
