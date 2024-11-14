package org.example.Exceptionpractice;

public class ExceptionTest {

    public void  calucatewithfinally(int numberOfTicket) throws Exception{

        String status =null;

        try{

            System.out.println("Available"+ PaymentService.seats);

            PaymentService.seats= PaymentService.seats- numberOfTicket;
            System.out.println("Available"+PaymentService.seats);

            PaymentService paymentService=new PaymentService();
            status=paymentService.payment(numberOfTicket);

        }finally {
            if (! "SUCCESS".equals(status)){
                PaymentService.seats=PaymentService.seats+numberOfTicket;

            }
            System.out.println("post payment Available"+PaymentService.seats);
            System.out.println("from finally calucatewithfinally 22222");
            System.out.println("from finally calucatewithfinally 3333");

        }
        System.out.println("post finally block");
    }
}
