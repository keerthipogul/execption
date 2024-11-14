package org.example.abstractdemo.polymorphismWithAbstract;

import java.util.Date;

public class Payment {
    
    private String transaction;
    
    private String uter;
    
    private String status;
    
    private Date transactionDate;
    
    private  Double amount;

    public String getTransaction() {
        return transaction;
    }

    public void setTransaction(String transaction) {
        this.transaction = transaction;
    }

    public String getUter() {
        return uter;
    }

    public void setUter(String uter) {
        this.uter = uter;
    }

    public String getStatus(String label) {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public Date getTransactionDate() {
        return transactionDate;
    }

    public void setTransactionDate(Date transactionDate) {
        this.transactionDate = transactionDate;
    }

    public Double getAmount() {
        return amount;
    }

    public void setAmount(Double amount) {
        this.amount = amount;
    }

    public static String getStatus() {
        return "";
    }
}
