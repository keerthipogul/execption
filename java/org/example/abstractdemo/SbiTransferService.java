package org.example.abstractdemo;

import org.example.Exceptionpractice.InsufficientBalanceException;
import org.example.Exceptionpractice.PaymentStatus;
import org.example.abstractdemo.polymorphismWithAbstract.Payment;
import org.example.abstractdemo.polymorphismWithAbstract.TransferEnum;

import java.util.Date;
import java.util.UUID;
import java.util.function.BiPredicate;
import java.util.function.Function;

public abstract class SbiTransferService implements RBIPayment {

    public Boolean balanceCheck(String accountNumber , Double amount) {

        Account accountBalance = SBIAccountDBService.accountMap.get(accountNumber);
        if (accountBalance != null && accountBalance.getBalance()>amount) {
            return true;
        } else {
            return false;
        }

    }

    Function<Double, Payment> errorSuppiler=(amount) -> {
        Payment p =new Payment();
        p.setStatus(PaymentStatus.FAILED.getLabel());
        p.setTransactionDate(new Date());
        p.setTransaction(UUID.randomUUID().toString());
        p.setUter(UUID.randomUUID().toString());
        p.setAmount(amount);
        return p;

    };

    protected abstract boolean transactionLimitCheck(Account account,Double amount);

    @Override
    public Payment transfer(String fromAccount , String toAccount , Double amount) throws InsufficientBalanceException{

        Payment p = new Payment();
        if (this.balanceCheck(fromAccount,amount)){
            Account account = SBIAccountDBService.accountMap.get(fromAccount);
            if (this.transactionLimitCheck(account,amount)){
                p.setAmount(amount);
                p.setUter(UUID.randomUUID().toString());
                p.getStatus(PaymentStatus.SUCCESS.getLabel());
                p.setTransaction(UUID.randomUUID().toString());
                p.setTransactionDate(new Date());

            }

        }else {
            throw new InsufficientBalanceException(TransferEnum.INSUFFICIENT_BALANCE.getCode(),TransferEnum.INSUFFICIENT_BALANCE.getLabel());
        }
        if (true){
            System.out.println("even this if is executed even after insufficient balance as well");
        }
        return p;
    }

}
