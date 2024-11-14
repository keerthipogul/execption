package org.example.InterfaceAndAbstract;

public class PDFExportAccount implements ExportAccountSummaryService{
    @Override
    public String export(AccountSummary accountSummary) {

        System.out.println("Export to pdf is done");
        return "Data exported to pfd is done";
    }


}
