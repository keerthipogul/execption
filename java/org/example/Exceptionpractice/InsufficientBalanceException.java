package org.example.Exceptionpractice;

public class InsufficientBalanceException extends Exception {

    private String code;

    public InsufficientBalanceException(String message) {
        super(message);
    }

    public InsufficientBalanceException(String message, String code) {
        super(message);
        this.code = code;
    }


}
