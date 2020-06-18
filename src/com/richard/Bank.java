package com.richard;

import java.util.ArrayList;

public class Bank {
    private String Name;
    private ArrayList<Branch>branches;

    public Bank(String name) {
        Name = name;
        this.branches = new ArrayList<Branch>();
    }
    public boolean AddBranch(String branchName){
        if (findBranch(branchName) == null){
            this.branches.add(new Branch(branchName));
            return true;
        }
        return false;
    }
    public boolean addCustomer(String BranchName, String CustomerName, double initialAmount,long AccountNumber, String phoneNumber, String Email, long BVN){
        Branch branch = findBranch(BranchName);
        if(branch!=null){
            return branch.newCustomer(CustomerName, initialAmount, AccountNumber, phoneNumber,Email,BVN);
        }
        return false;
    }
    private Branch findBranch(String BranchName){
        for(int i =0; i<this.branches.size(); i++) {
            Branch checkBranch = this.branches.get(i);
            if (checkBranch.getBranchName().equals(BranchName)) {
                return checkBranch;
            }
        }
        return null;
    }
    public boolean listCustomer(String BranchName, boolean transactionList){
        Branch branch = findBranch(BranchName);
        if(branch != null){
            System.out.println("Customers details for branch" + BranchName);
            ArrayList<Customer> branchCustomers = branch.getCustomers();
            for(int i =0; i<branchCustomers.size(); i++){
                Customer branchCustomer = branchCustomers.get(i);
                System.out.println("Customers:" + branchCustomer.getName() + "[" + (i+1) + "]");
                if(transactionList){
                    System.out.println("Transactions");
                    ArrayList<Double> transactions = branchCustomer.getTransactions();
                    for(int j = 0; j<transactions.size(); j++){
                        System.out.println("[" + (j + 1) + "] Amount" + transactions.get(j));
                    }
                }
            } return true;
        }else{
            return false;
        }
    }
}
