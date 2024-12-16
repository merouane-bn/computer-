package org.sid.exam.service;

import org.sid.exam.dto.ComputerDTO;

import java.util.List;

public interface ComputerService {

    public ComputerDTO saveComputer(ComputerDTO computerDTO);

    public  List<ComputerDTO> getComputerByProce(String proce);

}
