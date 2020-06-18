package com.richard;

import java.util.ArrayList;

public class Branch {
    private String BranchName;
    private ArrayList<Customer> customers;

    public Branch(String branchName) {
        BranchName = branchName;
        this.customers = new ArrayList<Customer>();
    }

    public String getBranchName() {
        return BranchName;
    }

    public ArrayList<Customer> getCustomers() {
        return customers;
    }

    //creating a newCustomer
    public boolean newCustomer(String customerName,double InitialAmount, int AccountName, String phoneNumber,
                               int Email, int BVN){
        if(findCustomer(customerName) == null){
            this.customers.add(new Customer(customerName,InitialAmount,"n@g.com",1111));
            return true;
        }
        return false;
    }
    public boolean AddCustomerTransaction(String customerName, double initialAmount){
        Customer existingCustomer = findCustomer(customerName);
        if(existingCustomer != null){
            existingCustomer.addTransaction(initialAmount);
            return true;
        }
        return false;
    }
    private Customer findCustomer(String customerName){
        for(int i =0; i<this.customers.size(); i++){
            Customer checkCustomer = this.customers.get(i);
            if(checkCustomer.getName().equals(customerName)){
                return checkCustomer;
            }
        }
        return null;
    }
}
