package org.example.InterfaceAndAbstract;

public class ExcelAccountSummary implements ExportAccountSummaryService{


    @Override
    public String export(AccountSummary accountSummary) {

        System.out.println("Export to excel is done");

        return "Data exported to excel is done";

    }
    public void test(){


    }


}