package com.example.europcar.service;


import com.example.europcar.Converter.CategoriaMapper;
import com.example.europcar.Converter.InvestimentoMapper;
import com.example.europcar.entity.Categoria;
import com.example.europcar.entity.Investimento;
import com.example.europcar.entityDto.CategoriaDto;
import com.example.europcar.entityDto.InvestimentoDto;
import com.example.europcar.repository.InvestimentoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class InvestimentoServiceImpl implements InvestimentoService {
    
    @Autowired
    InvestimentoRepository investimentoRepository;
   
    @Override
    public InvestimentoDto findById(Integer id) {
        Investimento investimento = investimentoRepository.findById(id).get();
        InvestimentoMapper map = new InvestimentoMapper();
        return map.toDto(investimento);
    }

    @Override
    public List<InvestimentoDto> findAll() {
        List <Investimento> lista_investimenti = investimentoRepository.findAll();
        List<InvestimentoDto> lista_conv = new ArrayList<>();
        for (Investimento investimento: investimentoRepository.findAll()) {
            InvestimentoMapper map = new InvestimentoMapper();
            lista_conv.add(map.toDto(investimento));
        }
        return lista_conv;
    }

    @Override
    public InvestimentoDto delete(Integer id) {
        Investimento investimento = investimentoRepository.findById(id).get();
        investimentoRepository.delete(investimento);
        InvestimentoMapper map = new InvestimentoMapper();
        return map.toDto(investimento);
    }

    @Override
    public Investimento save(Investimento investimento) {
        return investimentoRepository.save(investimento);
    }
}
