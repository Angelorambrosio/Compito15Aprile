package com.example.europcar.entity;

import lombok.Data;
import org.springframework.validation.annotation.Validated;

import javax.persistence.*;
import java.util.HashSet;
import java.util.Set;


@Entity
@Data
@Table(name = "hb_area")
public class Area {

    @Column
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer id;

    @Column(name = "nome_area")
    private String nome_area;

}
