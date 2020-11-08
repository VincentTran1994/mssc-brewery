package vutran.springframework.demo.service;

import org.springframework.stereotype.Service;
import vutran.springframework.demo.web.model.CustomerDto;

import java.util.Random;
import java.util.UUID;

@Service
public class CustomerServiceImpl implements CustomerService {
    @Override
    public CustomerDto getCustomerById(UUID customerId) {
        return CustomerDto.builder()
                .id(UUID.randomUUID())
                .name("Eli Tran Cong")
                .build();
    }
}
