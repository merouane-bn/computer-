package org.sid.exam.dto;

import lombok.*;

@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@ToString
@Builder


public class ComputerDTO {
    private String proce;
    private String ram;
    private String hardDrive;
    private Float price;
}
