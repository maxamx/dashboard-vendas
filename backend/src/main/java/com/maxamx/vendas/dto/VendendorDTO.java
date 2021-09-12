package com.maxamx.vendas.dto;

import com.maxamx.vendas.entidade.Vendendor;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

import java.io.Serializable;

@AllArgsConstructor
@Getter
@Setter
public class VendendorDTO implements Serializable {

    private Long id;
    private String nome;

    public VendendorDTO(Vendendor vendendor){
        this.id = vendendor.getId();
        this.nome = vendendor.getNome();
    }
}
