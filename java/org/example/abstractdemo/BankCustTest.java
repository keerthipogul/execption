package org.example.abstractdemo;

import org.example.Exceptionpractice.InsufficientBalanceException;
import org.example.abstractdemo.polymorphismWithAbstract.*;

public class BankCustTest {


    public static void main(String[] args) throws InsufficientBalanceException {

        RetailAccountService retailAccountService = new RetailAccountServiceImpli();

        Account a = retailAccountService.createAccount("1243","325236");
        SbiTransferService nefttransferservice=new NEFTSBITransferImpl();
        try{
            nefttransferservice.transfer(a.getAccount(), "1234",1000.0);
            System.out.println("transfer successfull");

        }catch (InsufficientBalanceException e){
            System.out.println("transfer failed"+e.getMessage());

            //
        }



    }
}



