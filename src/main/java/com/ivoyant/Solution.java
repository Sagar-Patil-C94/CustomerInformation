package com.ivoyant;

import java.util.ArrayList;
import java.util.Objects;

public class Solution {
    public static double findAvgBillByBranc(ArrayList<CustomerInformation> customerInformation, String branchName) {
        double avgBillAmount = 0;
        int numberOfSameBranc = 0;
        for (CustomerInformation i : customerInformation) {
            if (Objects.equals(i.branchName.toLowerCase(), branchName.toLowerCase())) {
                avgBillAmount += i.billAmount;
                numberOfSameBranc++;
            }
        }
        if (avgBillAmount == 0) {
            System.out.println("There are no customer purchase in the branch : " + branchName);
            return 0;
        }
        System.out.println((int) avgBillAmount / numberOfSameBranc);
        return avgBillAmount / numberOfSameBranc;
    }

    public static CustomerInformation discountByBillAmount(ArrayList<CustomerInformation> customerInformation, double amount, String startingLetterOfName) {
        for (CustomerInformation i : customerInformation) {
            if (Character.toLowerCase(i.customerName.charAt(0)) == Character.toLowerCase(startingLetterOfName.charAt(0))) {
                if (i.billAmount >= amount)
                    i.billAmount = i.billAmount - (i.billAmount * (20.0 / 100));
                else
                    i.billAmount = i.billAmount - (i.billAmount * (10.0 / 100));
                System.out.println(i.customerName + ':' + i.billAmount);
                return i;
            }
        }
        return null;
    }
}
