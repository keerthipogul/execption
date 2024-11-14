package org.example.Exceptionpractice;

public class ExceptionDemoTest {

    public  static void main(String[]args){


        try{
            ExceptionTest test=new ExceptionTest();
            test.calucatewithfinally(6);

            System.out.println("Ticket booking is done");
        } catch (Exception e) {

            System.out.println(e+e.getMessage());

        }
        System.out.println("i am done with the calculation");
    }
}
