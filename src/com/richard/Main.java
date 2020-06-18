package com.richard;

public class Main {

    public static void main(String[] args) {
	// write your code here
        Customer customer = new Customer("Richard",200000,"nchu@g.com",1233);
        long BVNChecking = customer.BvnGenerator();
        long AccountChecker = customer.AccNumberGenerator();

        Bank bank = new Bank("GtBank");
        bank.AddBranch("PresidentRd");
        bank.addCustomer("PresidentRd","Richard",2000.56,AccountChecker,
                20201,"n@g.com",BVNChecking);
    }
}
