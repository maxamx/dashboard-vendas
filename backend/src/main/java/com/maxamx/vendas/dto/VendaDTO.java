package com.maxamx.vendas.dto;

import com.maxamx.vendas.entidade.Venda;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

import java.io.Serializable;
import java.time.LocalDate;

@AllArgsConstructor
@Getter
@Setter
public class VendaDTO implements Serializable {
    private Long id;
    private Integer visitados;
    private Integer negocioFechados;
    private Double valorVendido;
    private LocalDate data;
    private VendendorDTO vendendor;

    public VendaDTO(Venda venda){
        this.id = venda.getId();
        this.visitados = venda.getVisitados();
        this.negocioFechados = venda.getNegocioFechados();
        this.valorVendido = venda.getValorVendido();
        this.data = venda.getData();
        this.vendendor = new VendendorDTO(venda.getVendendor());
    }
}
