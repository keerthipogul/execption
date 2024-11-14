package org.example.abstractdemo;

import java.util.UUID;

public class CoporateAccountServiceImpli implements CorporateAccountService {

    @Override
    public Account createAccount (String gst,String pan){
        Account account =new Account();
        account.setAccount(UUID.randomUUID().toString());
        account.setBalance(100000.0);
        account.setGst(gst);
        account.setPan(pan);
        SBIAccountDBService.accountMap.put(account.getAccount(),account);
        return account;
    }
}

