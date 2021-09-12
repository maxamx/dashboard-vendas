package com.maxamx.vendas.repositorio;

import com.maxamx.vendas.dto.SomaVendaDTO;
import com.maxamx.vendas.dto.SucessoVendaDTO;
import com.maxamx.vendas.entidade.Venda;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface VendaRepository extends JpaRepository<Venda,Long> {

    @Query("SELECT new com.maxamx.vendas.dto.SomaVendaDTO(venda.vendendor, SUM(venda.valorVendido)) FROM Venda AS venda GROUP BY venda.vendendor")
    List<SomaVendaDTO> somaValorVendidoPorVendedor();

    @Query("SELECT new com.maxamx.vendas.dto.SucessoVendaDTO(venda.vendendor, SUM(venda.visitados), SUM(venda.negocioFechados)) FROM Venda AS venda GROUP BY venda.vendendor")
    List<SucessoVendaDTO> sucessoDeVendasPorVendedor();
}
