package com.coffman;

public class BankAccount {
    private int accountNumber;
    private int balance;
    private String customerName;
    private String email;
    private int phoneNumber;
    //use Code -> generate ->getters and setters
            //initialize the object you're creating
    public BankAccount(){
        this(56789, 2050, "Default Name", "Default Email", 21476656);
        System.out.println("Empty constructor called");
    }

    public BankAccount(int accountNumber, int balance, String customerName, String email, int phoneNumber){
        System.out.println("Account constructor with parameters called");
        this.accountNumber = accountNumber;
        this.balance = balance;
        this.customerName = customerName;
        this.email=email;
        this.phoneNumber = phoneNumber;
    }

    public BankAccount(String customerName, String email, int phoneNumber) {
        this(99999, 1502, customerName, email, phoneNumber);
        //two parameters are defaulted
    }

    public void deposit(double depositAmount){
        this.balance += depositAmount;
        System.out.println("Deposit of " + depositAmount + "made. You now have " + this.balance);
    }

    public void withdrawal(double withdrawalAmount){
        if(balance - withdrawalAmount < 0){
            System.out.println("Only " + balance + " available. Withdrawal not processed.");
        } else{
            this.balance -= withdrawalAmount;
            System.out.println("Withdrawal Processed. You have " + this.balance + " remaining.");
        }
    }

    public void setAccountNumber(int accountNumber){
        this.accountNumber = accountNumber;
    }

    public int getAccountNumber(){
        return this.accountNumber;
    }

    public void setBalance(int balance){
        this.balance = balance;
    }

    public int getBalance(){
        return this.balance;
    }

    public void setCustomerName(String customerName){
        this.customerName = customerName;
    }

    public String getCustomerName(){
        return this.customerName;
    }

    public void setEmail(String email){
        this.email = email;
    }

    public String getEmail(){
        return this.email;
    }

    public void setPhoneNumber(int phoneNumber){
        this.phoneNumber = phoneNumber;
    }

    public int getPhoneNumber(){
        return this.phoneNumber;
    }


}
