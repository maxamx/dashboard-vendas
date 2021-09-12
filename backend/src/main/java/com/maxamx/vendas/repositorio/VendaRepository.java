package com.maxamx.vendas.repositorio;

import com.maxamx.vendas.entidade.Venda;
import org.springframework.data.jpa.repository.JpaRepository;

public interface VendaRepository extends JpaRepository<Venda,Long> {
}
