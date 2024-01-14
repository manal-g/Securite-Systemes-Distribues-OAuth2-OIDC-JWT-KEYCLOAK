package com.manal.customerservice;

import com.manal.customerservice.entities.Customer;
import com.manal.customerservice.repo.CustomerRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class CustomerServiceApplication {

    public static void main(String[] args) {
        SpringApplication.run(CustomerServiceApplication.class, args);
    }

    @Bean
    public CommandLineRunner commandLineRunner(CustomerRepository customerRepository){
        return args -> {
            customerRepository.save(Customer.builder()
                            .name("Manal")
                            .mail("manal@gmail.com")
                    .build());
            customerRepository.save(Customer.builder()
                    .name("Rania")
                    .mail("rania@gmail.com")
                    .build());
            customerRepository.save(Customer.builder()
                    .name("Ritaje")
                    .mail("ritaje@gmail.com")
                    .build());
        };
    }
}
