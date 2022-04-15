package com.example.europcar.Converter;

import com.example.europcar.entity.Investimento;
import com.example.europcar.entityDto.InvestimentoDto;
import org.modelmapper.ModelMapper;

public class InvestimentoMapper {

    public InvestimentoDto toDto(Investimento investimento){
        ModelMapper modelInvestimento = new ModelMapper();
        InvestimentoDto investimentoDto = modelInvestimento.map(investimento, InvestimentoDto.class);
        return investimentoDto;
    }
}