package com.ivoyant;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 * Hello world!
 */
public class App {
    public static void main(String[] args) {
        ArrayList<CustomerInformation> arrayListCustomerInformation = new ArrayList<CustomerInformation>();
        Scanner scanner = new Scanner(System.in);
        for (int i = 0; i < 4; i++) {
//            System.out.println("Enter Customer Information:" + i);
//            System.out.println("Enter Customer ID : ");
            int customerId = scanner.nextInt();
            scanner.nextLine();
//            System.out.println("Enter Customer Name : ");
            String customerName = scanner.nextLine();
//            System.out.println("Enter Bill Amount : ");
            double billAmount = scanner.nextDouble();
//            System.out.println("Enter No Of Terms : ");
            int noOflterms = scanner.nextInt();
            scanner.nextLine();
//            System.out.println("Enter Branch Name : ");
            String branchName = scanner.nextLine();
            if (i != 0) {
                for (CustomerInformation j : arrayListCustomerInformation) {
                    if (Character.toLowerCase(j.customerName.charAt(0)) == Character.toLowerCase(customerName.charAt(0))) {
                        System.out.println("Customer Name Starting With Same Letter Already Exists\nCustomer Ignored");
                        break;
                    }
                }
            } else {
                CustomerInformation customer = new CustomerInformation(customerId, customerName, billAmount, noOflterms, branchName);
                arrayListCustomerInformation.add(customer);
            }
        }
        System.out.print("Enter Branch Name : ");
        String branchName = scanner.nextLine();
        System.out.print("Enter Bill Amount : ");
        double billAmount = scanner.nextDouble();
        scanner.nextLine();
        System.out.print("Enter Starting letter of name : ");
        String startingLetterOfName = scanner.nextLine();
        Solution.findAvgBillByBranc(arrayListCustomerInformation, branchName);
        Solution.discountByBillAmount(arrayListCustomerInformation, billAmount, startingLetterOfName);
    }
}
