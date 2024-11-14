package org.example.Exceptionpractice;

public enum PaymentStatus {
    SUCCESS("transaction is success ","22"),


    FAILED ("12"," Transaction is Failed "),
    INSUFFICIENT_BALANCE("14"," Transaction is Successfull");

    private String  label;
    private String code;


    PaymentStatus(String label, String code) {
        this.label = label;
        this.code = code;
    }

    public String getLabel() {
        return  label;

    }

    public void  setLabel(String label) {
        this.label = label;
    }

    public String getCode() {
        return  code;
    }
}
