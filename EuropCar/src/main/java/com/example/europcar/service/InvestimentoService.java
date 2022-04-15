package com.example.europcar.service;

import com.example.europcar.entity.Investimento;
import com.example.europcar.entityDto.InvestimentoDto;

import java.util.List;

public interface InvestimentoService {

    InvestimentoDto findById(Integer id);

    List<InvestimentoDto> findAll();

    InvestimentoDto delete(Integer id);

    Investimento save(Investimento investimento);
}
