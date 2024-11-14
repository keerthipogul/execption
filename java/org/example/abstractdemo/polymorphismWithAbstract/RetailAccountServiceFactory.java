package org.example.abstractdemo.polymorphismWithAbstract;

import org.example.abstractdemo.AccountService;
import org.example.abstractdemo.RetailAccountService;
import org.example.abstractdemo.RetailAccountServiceImpli;

public class RetailAccountServiceFactory implements AccountFactory {


    @Override
    public RetailAccountService createAccount() {
        return new RetailAccountServiceImpli();
    }
}
