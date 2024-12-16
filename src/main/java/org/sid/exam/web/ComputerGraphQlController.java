
package org.sid.exam.web;


import org.sid.exam.service.ComputerService;
import org.sid.exam.dto.ComputerDTO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.graphql.data.method.annotation.Argument;
import org.springframework.graphql.data.method.annotation.MutationMapping;
import org.springframework.graphql.data.method.annotation.QueryMapping;
import org.springframework.stereotype.Controller;

import java.util.List;

@Controller
public class ComputerGraphQlController {
    @Autowired
    private ComputerService ComputerService;

    @QueryMapping
    public List<ComputerDTO> getComputerByProce(@Argument String proce) {
        return ComputerService.getComputerByProce(proce);
    }

    @MutationMapping
    public ComputerDTO saveCar(@Argument ComputerDTO computer) {
        return ComputerService.saveComputer(computer);
    }
}
