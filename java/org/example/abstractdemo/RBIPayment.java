package org.example.abstractdemo;

import org.example.Exceptionpractice.InsufficientBalanceException;
import org.example.abstractdemo.polymorphismWithAbstract.Payment;

public interface RBIPayment {

    Payment transfer(String fromAccount, String toAccount, Double amount ) throws InsufficientBalanceException;

}
