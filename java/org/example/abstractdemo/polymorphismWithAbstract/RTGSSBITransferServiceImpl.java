package org.example.abstractdemo.polymorphismWithAbstract;

import org.example.Exceptionpractice.InsufficientBalanceException;
import org.example.abstractdemo.Account;
import org.example.abstractdemo.SbiTransferService;

public class RTGSSBITransferServiceImpl extends SbiTransferService {

    @Override
    protected boolean transactionLimitCheck(Account account, Double amount) {

        if (amount >20000 && amount <100000)
        return true;
        else {
            return false;
        }
    }

    @Override
    public Payment transfer(String fromAccount, String toAccount, Double amount) throws InsufficientBalanceException {
        return null;
    }
}
