package org.example.abstractdemo;

import java.util.UUID;

public class RetailAccountServiceImpli implements RetailAccountService{

    @Override
    public Account createAccount(String aadhar, String pan) {
        Account account =new Account();
        account.setAccount(UUID.randomUUID().toString());
        account.setPan(pan);
        account.setAdhar(aadhar);
        account.setBalance(10000.0);
        SBIAccountDBService.accountMap.put(account.getAccount(),account);



        return account;
    }


    }
