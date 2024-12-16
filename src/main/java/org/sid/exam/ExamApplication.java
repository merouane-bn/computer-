package org.sid.exam;

import org.sid.exam.dao.entities.Computer;
import org.sid.exam.dao.repositories.ComputerRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class ExamApplication {

    public static void main(String[] args) {
        SpringApplication.run(ExamApplication.class, args);
    }
    @Bean
    CommandLineRunner start(ComputerRepository ComputerRepository){
        return args -> {
            ComputerRepository.save(Computer.builder()
                    .proce("Intel i7")
                    .ram("16GB")
                    .hardDrive("1TB")
                    .price(1200.00)
                    .macAddress("00-14-22-01-23-45")
                    .build());

            ComputerRepository.save(Computer.builder()
                    .proce("AMD Ryzen 5")
                    .ram("8GB")
                    .hardDrive("512GB")
                    .price(900.00)
                    .macAddress("00-16-36-11-55-78")
                    .build());

            ComputerRepository.save(Computer.builder()
                    .proce("Intel i9")
                    .ram("32GB")
                    .hardDrive("2TB")
                    .price(2500.00)
                    .macAddress("00-18-56-33-44-99")
                    .build());
        };
    }
}



