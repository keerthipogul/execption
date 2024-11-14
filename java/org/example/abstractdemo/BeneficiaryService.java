package org.example.abstractdemo;

import java.util.ArrayList;

public class BeneficiaryService {


        Beneficiary addBeneficary(Account account, Beneficiary beneficary) {
            ArrayList<Beneficiary> beneficiaryArrayList = SBIAccountDBService.accountBeneficiary.get(account.getAccount());
            if (beneficiaryArrayList != null) {
                beneficiaryArrayList.add(beneficary);
            } else {
                beneficiaryArrayList = new ArrayList<Beneficiary>();
                beneficiaryArrayList.add(beneficary);
                SBIAccountDBService.accountBeneficiary.put(account.getAccount(), beneficiaryArrayList);
            }

            return beneficary;
        }

    }

