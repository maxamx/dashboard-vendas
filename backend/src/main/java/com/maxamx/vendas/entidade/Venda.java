package com.maxamx.vendas.entidade;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import java.time.LocalDate;

@Entity
@Table(name="tb_vendas")
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
public class Venda {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name="visitados")
    private Integer visitados;

    @Column(name="negocio_fechados")
    private Integer negocioFechados;

    @Column(name = "valor_vendido")
    private Double valorVendido;

    @Column(name = "data")
    private LocalDate data;

    @ManyToOne
    @JoinColumn(name="vendendor_id")
    private Vendendor vendendor;

}
