package com.example.europcar.service;

import com.example.europcar.entity.Categoria;
import com.example.europcar.entityDto.CategoriaDto;

import java.util.List;

public interface CategoriaService {

    CategoriaDto findById(Integer id);

    List<CategoriaDto> findAll();

    CategoriaDto delete(Integer id);

    Categoria save(Categoria categoria );
}
