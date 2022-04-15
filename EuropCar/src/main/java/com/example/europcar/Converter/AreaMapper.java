package com.example.europcar.Converter;

import com.example.europcar.entity.Area;
import com.example.europcar.entityDto.AreaDto;
import org.modelmapper.ModelMapper;

public class AreaMapper {

    public AreaDto toDto(Area area) {
        ModelMapper modelArea = new ModelMapper();
        AreaDto areaDto = modelArea.map(area, AreaDto.class);
        return areaDto;

    }
}
