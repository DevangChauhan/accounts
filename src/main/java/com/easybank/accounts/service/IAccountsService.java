package com.easybank.accounts.service;

import com.easybank.accounts.dto.CustomerDto;

public interface IAccountsService {

    /**
     * @param customerDto - CustomerDto Object
     */
    void createAccount(CustomerDto customerDto);

    /**
     * @param mobileNumber - CustomerDto Object
     * @return AccountDetails based on a given mobileNumber
     */
    CustomerDto fetchAccount(String mobileNumber);


}
