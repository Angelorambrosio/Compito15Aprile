package com.example.europcar.service;

import com.example.europcar.entity.Area;
import com.example.europcar.entityDto.AreaDto;

import java.util.List;

public interface AreaService {

    AreaDto findById(Integer id);

    List<AreaDto> findAll();

     AreaDto delete(Integer id);

     Area save(Area area);

}
