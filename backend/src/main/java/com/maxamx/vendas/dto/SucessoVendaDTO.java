package com.maxamx.vendas.dto;

import com.maxamx.vendas.entidade.Vendendor;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

import java.io.Serializable;

@AllArgsConstructor
@Getter
@Setter
public class SucessoVendaDTO implements Serializable {
    private String vendedor;
    private Long clienteVisitados;
    private Long negocioFechados;

    public SucessoVendaDTO(Vendendor vendendor,Long clienteVisitados,Long negocioFechados){
        this.vendedor = vendendor.getNome();
        this.clienteVisitados = clienteVisitados;
        this.negocioFechados = negocioFechados;
    }
}
