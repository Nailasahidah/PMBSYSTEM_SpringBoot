package com.pmb_system.pmb_system;

import com.pmb_system.pmb_system.registRepo.registerRepository;
import com.pmb_system.pmb_system.register.register;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@SpringBootApplication
@RestController
public class PmbSystemApplication {

    public static void main(String[] args) {
        SpringApplication.run(PmbSystemApplication.class, args);
    }

    @Bean
    CommandLineRunner runner(registerRepository registerRepository) {
        return args -> {
            register naila = new register(
                    "Naila sahidah",
                    "086321689532",
                    "Happy"
            );

            register fatimah = new register(
                    "Fatimah Azzahra",
                    "089642786433",
                    "Sweet"
            );

            List<register> registers = List.of(naila, fatimah);
            registerRepository.saveAll(registers);
        };
    }
}
