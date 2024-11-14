package org.example.Exceptionpractice;

public class PaymentService {

    static int seats=15;

    public String payment(int numberOfTicket) throws InsufficientBalanceException{

        try{

            if (numberOfTicket>5){

                throw new InsufficientBalanceException(PaymentStatus.INSUFFICIENT_BALANCE.getCode(),PaymentStatus.INSUFFICIENT_BALANCE.getLabel());

            }

        }catch (InsufficientBalanceException e){

            System.out.println("Exception InsufficientBalanceException occured"+e);
            throw  e;

        }catch (Exception e){
            System.out.println("Exception occured"+e);
            throw e;

        }
        return "SUCCESS";

    }
}
