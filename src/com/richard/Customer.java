package com.richard;

import java.util.ArrayList;

public class Customer {
    private String Name;
    private long AccountNumber;
    private String Email;
    private int PhoneNumber;
    private long BVN;
    private ArrayList<Double>Transactions;

    public Customer(String name, double initialAmount,String email, int phoneNumber) {
        this.Name = name;
        this.AccountNumber = AccNumberGenerator();
        this.Email = email;
        this.PhoneNumber = phoneNumber;
        this.BVN = BvnGenerator();
        this.Transactions = new ArrayList<Double>();
        addTransaction(initialAmount);
    }
    public void addTransaction(double amount){
        this.Transactions.add(amount);
    }
    public long BvnGenerator(){
        long first14 = (long) (Math.random() * 100000000000000L);
        long generated = 52000000000000000l + first14;
        return generated;
    }
    public long AccNumberGenerator(){
        long half = (long) (Math.random() * 200000000000L);
        long generate = 1100000L + half;
        return generate;
    }

    public String getName() {
        return Name;
    }

    public long getAccountNumber() {
        return AccountNumber;
    }

    public String getEmail() {
        return Email;
    }

    public int getPhoneNumber() {
        return PhoneNumber;
    }

    public long getBVN() {
        return BVN;
    }

    public ArrayList<Double> getTransactions() {
        return Transactions;
    }
}
