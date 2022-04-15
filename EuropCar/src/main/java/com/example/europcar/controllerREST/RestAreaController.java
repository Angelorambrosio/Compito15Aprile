package com.example.europcar.controllerREST;


import com.example.europcar.entity.Area;
import com.example.europcar.entityDto.AreaDto;
import com.example.europcar.service.AreaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/area")
public class RestAreaController {

    @Autowired
    AreaService areaService;

    @GetMapping(value = "/{id}")
    public AreaDto getById(@PathVariable("id")Integer id){
        return areaService.findById(id);
    }

    @GetMapping(value = "/lista")
    public List<AreaDto> getAll(){
        return areaService.findAll();
    }

    @PostMapping(value = "/newArea")
    public void newArea(@RequestBody Area area){
        areaService.save(area);
    }

    @DeleteMapping(value = "/deleteArea/{id}")
    public void deleteAreaPerId(@PathVariable("id")Integer id){
        areaService.delete(id);
    }
}
