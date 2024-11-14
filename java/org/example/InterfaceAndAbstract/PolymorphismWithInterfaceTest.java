package org.example.InterfaceAndAbstract;

public class PolymorphismWithInterfaceTest {

    public static void main (String[] args){

        ExportAccountSummaryService excelAccountSummary=new ExcelAccountSummary();
        excelAccountSummary.export(new AccountSummary());

        ExportAccountSummaryService pdfExportAccountSummary=new PDFExportAccount();
        pdfExportAccountSummary.export(new AccountSummary());



    }
}
