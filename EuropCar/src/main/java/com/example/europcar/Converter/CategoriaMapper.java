package com.example.europcar.Converter;

import com.example.europcar.entity.Categoria;
import com.example.europcar.entityDto.CategoriaDto;
import org.modelmapper.ModelMapper;

public class CategoriaMapper {

    public CategoriaDto toDto(Categoria categoria) {
        ModelMapper modelCategoria = new ModelMapper();
        CategoriaDto categoriaDto = modelCategoria.map(categoria, CategoriaDto.class);
        return  categoriaDto;
    }
}
