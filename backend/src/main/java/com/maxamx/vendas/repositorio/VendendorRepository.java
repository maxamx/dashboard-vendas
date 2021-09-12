package com.maxamx.vendas.repositorio;

import com.maxamx.vendas.entidade.Vendendor;
import org.springframework.data.jpa.repository.JpaRepository;

public interface VendendorRepository extends JpaRepository<Vendendor, Long> {
}
