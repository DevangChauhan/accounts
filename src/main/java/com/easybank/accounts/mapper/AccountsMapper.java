package com.easybank.accounts.mapper;

import com.easybank.accounts.dto.AccountsDto;
import com.easybank.accounts.entities.Account;

public class AccountsMapper {

    public static AccountsDto mapToAccountsDto(Account account) {
        return new AccountsDto(account.getAccountNumber(), account.getAccountType(), account.getBranchAddress());
    }

    public static Account mapToAccounts(AccountsDto accountsDto, Account accounts) {
        accounts.setAccountNumber(accountsDto.accountNumber());
        accounts.setAccountType(accountsDto.accountType());
        accounts.setBranchAddress(accountsDto.branchAddress());
        return accounts;
    }

}
