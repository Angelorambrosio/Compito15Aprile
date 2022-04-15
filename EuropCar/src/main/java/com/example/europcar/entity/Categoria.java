package com.example.europcar.entity;


import lombok.Data;
import lombok.Generated;

import javax.persistence.*;
import java.util.HashSet;
import java.util.Set;

@Entity
@Data
@Table(name = "hb_categoria")
public class Categoria {

    @Column
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer id;

    @Column(name = "nome_categoria")
    private String nome_categoria;

}
