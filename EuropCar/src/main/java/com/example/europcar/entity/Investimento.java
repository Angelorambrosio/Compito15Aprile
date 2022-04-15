package com.example.europcar.entity;


import lombok.Data;

import javax.persistence.*;
import java.time.LocalDate;

@Entity
@Data
@Table(name = "hb_investimento")
public class Investimento {

    @Column
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer id;

    @Column(name = "nome_investimento")
    private String nome_investimento;

    @Column(name = "totale_investimento")
    private Double totale_investimento;

    @Column
    private LocalDate data_investimento;

    @ManyToOne
    @JoinColumn(name = "categoria", referencedColumnName = "id")
    private Categoria categoria;

    @ManyToOne
    @JoinColumn(name = "area", referencedColumnName = "id")
    private Area area;

}
