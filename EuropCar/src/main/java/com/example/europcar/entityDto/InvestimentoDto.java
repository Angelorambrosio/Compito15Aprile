package com.example.europcar.entityDto;

import lombok.Data;

import java.time.LocalDate;


@Data
public class InvestimentoDto {

    private String nome_investimento;
    private Double totale_investimento;
    private LocalDate data_investimento;
    private String nome_categoria;
}
