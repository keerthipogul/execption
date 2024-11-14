package org.example.abstractdemo.polymorphismWithAbstract;

import org.example.abstractdemo.Account;
import org.example.abstractdemo.SbiTransferService;

public class NEFTSBITransferImpl extends SbiTransferService {
    @Override
    protected boolean transactionLimitCheck(Account account, Double amount){

        System.out.println("Validating transactionLimitCheck for account in NEFTSBITransferServiceImpl"+account.getAccount());

        if (amount< 100000)
            return  true;
        else {
            return false;
        }
    }
}
