package vutran.springframework.demo.service;

import vutran.springframework.demo.web.model.CustomerDto;

import java.util.UUID;

public interface CustomerService {

    CustomerDto getCustomerById(UUID customerId);
}
