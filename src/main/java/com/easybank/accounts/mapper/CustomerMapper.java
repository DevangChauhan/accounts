package com.easybank.accounts.mapper;

import com.easybank.accounts.dto.AccountsDto;
import com.easybank.accounts.dto.CustomerDto;
import com.easybank.accounts.entities.Customer;

public class CustomerMapper {

    public static Customer mapToCustomer(CustomerDto customerDto, Customer customer) {
        customer.setName(customerDto.name());
        customer.setEmail(customerDto.email());
        customer.setMobileNumber(customerDto.mobileNumber());
        return customer;
    }
    public static CustomerDto mapToCustomerDtoWithAccountDto(Customer customer, AccountsDto accountsDto) {
        return new CustomerDto(customer.getName(), customer.getEmail(), customer.getMobileNumber(), accountsDto);
    }
}
