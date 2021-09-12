package com.maxamx.vendas.dto;

import com.maxamx.vendas.entidade.Vendendor;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

import java.io.Serializable;
@AllArgsConstructor
@Getter
@Setter
public class SomaVendaDTO implements Serializable {
    private String vendedor;
    private Double soma;

    public SomaVendaDTO(Vendendor vendendor, Double soma){
        this.vendedor = vendendor.getNome();
        this.soma = soma;
    }
}
