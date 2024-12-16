package org.sid.exam.service;

import org.sid.exam.dao.entities.Computer;
import org.sid.exam.dao.repositories.ComputerRepository;
import org.sid.exam.dto.ComputerDTO;
import org.sid.exam.mapper.ComputerMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class ComputerManager implements ComputerService {
    @Autowired
    ComputerRepository ComputerRepository;

    @Autowired
    ComputerMapper ComputerMapper;

    @Override
    public List<ComputerDTO> getComputerByProce(String proce) {
        List<Computer> Computers= ComputerRepository.findByProce(proce);
        List<ComputerDTO> ComputerDTOS = new ArrayList<>();
        for (Computer Computer : Computers) {
            ComputerDTOS.add(ComputerMapper.toComputerDTO(Computer));
        }
        return ComputerDTOS;
    }

    @Override
    public ComputerDTO saveComputer(ComputerDTO ComputerDTO) {
        Computer Computer = ComputerMapper.toComputer(ComputerDTO);
        Computer = ComputerRepository.save(Computer);
        return ComputerMapper.toComputerDTO(Computer);
    }
}
