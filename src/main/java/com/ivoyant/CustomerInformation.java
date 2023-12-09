package com.ivoyant;

public class CustomerInformation {
    int customerId;
    String customerName;
    double billAmount;
    int noOflterms;
    String branchName;

    public int getCustomerId() {
        return customerId;
    }

    public void setCustomerId(int customerId) {
        this.customerId = customerId;
    }

    public String getCustomerName() {
        return customerName;
    }

    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }

    public double getBillAmount() {
        return billAmount;
    }

    public void setBillAmount(double billAmount) {
        this.billAmount = billAmount;
    }

    public int getNoOflterms() {
        return noOflterms;
    }

    public CustomerInformation(int customerId, String customerName, double billAmount, int noOflterms, String branchName) {
        this.customerId = customerId;
        this.customerName = customerName;
        this.billAmount = billAmount;
        this.noOflterms = noOflterms;
        this.branchName = branchName;
    }

    public void setNoOflterms(int noOflterms) {
        this.noOflterms = noOflterms;
    }

    public String getBranchName() {
        return branchName;
    }

    public void setBranchName(String branchName) {
        this.branchName = branchName;
    }
}
