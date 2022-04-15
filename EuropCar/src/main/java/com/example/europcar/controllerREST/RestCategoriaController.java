package com.example.europcar.controllerREST;


import com.example.europcar.entity.Categoria;
import com.example.europcar.entityDto.CategoriaDto;
import com.example.europcar.service.CategoriaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/categoria")
public class RestCategoriaController {

    @Autowired
    CategoriaService categoriaService;

    @GetMapping(value = "/{id}")
    public CategoriaDto getById(@PathVariable("id")Integer id){
        return categoriaService.findById(id);
    }

    @GetMapping(value = "/lista")
    public List<CategoriaDto> getAll(){
        return categoriaService.findAll();
    }

    @PostMapping(value = "/newCategoria")
    public void newCategoria(@RequestBody Categoria categoria){
        categoriaService.save(categoria);
    }

    @DeleteMapping(value = "/deleteCategoria/{id}")
    public void deleteCategoriaPerId(@PathVariable("id")Integer id){
        categoriaService.delete(id);
    }
}