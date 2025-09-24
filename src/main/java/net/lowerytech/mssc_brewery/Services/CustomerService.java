package net.lowerytech.mssc_brewery.Services;

import net.lowerytech.mssc_brewery.web.model.CustomerDto;

import java.util.UUID;

public interface CustomerService {
    CustomerDto getCustomerById(UUID customerId
    );
}
