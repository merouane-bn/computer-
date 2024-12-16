package org.sid.exam.mapper;

import org.modelmapper.ModelMapper;
import org.sid.exam.dao.entities.Computer;
import org.sid.exam.dto.ComputerDTO;
import org.springframework.stereotype.Component;

@Component
public class ComputerMapper {
    private final ModelMapper modelMapper = new ModelMapper();
     public ComputerDTO toComputerDTO(Computer Computer) {
         return modelMapper.map(Computer, ComputerDTO.class);
     }

    public Computer toComputer(ComputerDTO ComputerDTO) {
        return modelMapper.map(ComputerDTO, Computer.class);
    }
}
