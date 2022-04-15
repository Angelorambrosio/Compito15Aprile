package com.example.europcar.service;

import com.example.europcar.Converter.AreaMapper;
import com.example.europcar.entity.Area;
import com.example.europcar.entityDto.AreaDto;
import com.example.europcar.repository.AreaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class AreaServiceImpl implements AreaService{
    @Autowired
    AreaRepository areaRepository;

    @Override
    public AreaDto findById(Integer id) {
        Area area = areaRepository.findById(id).get();
        AreaMapper map = new AreaMapper();
        return map.toDto(area);
    }

    @Override
    public List<AreaDto> findAll() {
        List <Area> lista_aree = areaRepository.findAll();
        List<AreaDto> lista_conv = new ArrayList<>();
        for (Area area: areaRepository.findAll()) {
            AreaMapper map = new AreaMapper();
            lista_conv.add(map.toDto(area));
        }
        return lista_conv;
    }

    @Override
    public AreaDto delete(Integer id) {
        Area area = areaRepository.findById(id).get();
        areaRepository.delete(area);
        AreaMapper map = new AreaMapper();
        return map.toDto(area);
    }

    @Override
    public Area save(Area area) {
        return areaRepository.save(area);
    }
}
