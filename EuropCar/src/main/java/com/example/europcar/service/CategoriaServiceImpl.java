package com.example.europcar.service;


import com.example.europcar.Converter.AreaMapper;
import com.example.europcar.Converter.CategoriaMapper;
import com.example.europcar.entity.Area;
import com.example.europcar.entity.Categoria;
import com.example.europcar.entityDto.AreaDto;
import com.example.europcar.entityDto.CategoriaDto;
import com.example.europcar.repository.CategoriaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class CategoriaServiceImpl implements CategoriaService{

    @Autowired
    CategoriaRepository categoriaRepository;

    @Override
    public CategoriaDto findById(Integer id) {
        Categoria categoria = categoriaRepository.findById(id).get();
        CategoriaMapper map = new CategoriaMapper();
        return map.toDto(categoria);
    }

    @Override
    public List<CategoriaDto> findAll() {

        List <Categoria> lista_categorie = categoriaRepository.findAll();
        List<CategoriaDto> lista_conv = new ArrayList<>();
        for (Categoria categoria: categoriaRepository.findAll()) {
            CategoriaMapper map = new CategoriaMapper();
            lista_conv.add(map.toDto(categoria));
        }
        return lista_conv;
    }

    @Override
    public CategoriaDto delete(Integer id) {
        Categoria categoria = categoriaRepository.findById(id).get();
        categoriaRepository.delete(categoria);
        CategoriaMapper map = new CategoriaMapper();
        return map.toDto(categoria);
    }

    @Override
    public Categoria save(Categoria categoria) {
        return categoriaRepository.save(categoria);
    }
}
