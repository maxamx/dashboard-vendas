package com.maxamx.vendas.entidade;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import java.util.List;

@Entity
@Table(name="tb_vendendor")
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
public class Vendendor {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "nome")
    private String nome;

    @OneToMany(mappedBy = "vendendor")
    private List<Venda> vendas;
}
