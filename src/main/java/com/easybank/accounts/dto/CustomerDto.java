package com.easybank.accounts.dto;

public record CustomerDto(String name, String email, String mobileNumber, AccountDto accountsDto) {
}
