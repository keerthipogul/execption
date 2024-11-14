package org.example.abstractdemo;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class SBIAccountDBService {
    public static Map<String, Account> accountMap =new HashMap<>();

    public static Map<String, ArrayList<Beneficiary>> accountBeneficiary=new HashMap<>();

    public static Map<String, Transaction> accountTransaction=new HashMap<>();

}
