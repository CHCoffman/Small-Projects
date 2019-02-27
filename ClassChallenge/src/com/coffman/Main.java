package com.coffman;

public class Main {

    public static void main(String[] args) {
    BankAccount bobsAccount = new BankAccount();//255415521, 5000, "Bob Belcher", "bob@bobsburgers", 2147445412);
        System.out.println(bobsAccount.getAccountNumber());
        System.out.println(bobsAccount.getCustomerName());

    bobsAccount.deposit(50.0);
    bobsAccount.withdrawal(100.0);

    bobsAccount.deposit(51);
    bobsAccount.withdrawal(100);
    BankAccount timsAccount = new BankAccount("tim", "Tim@email.com", 48415);
        System.out.println(timsAccount.getAccountNumber() + " name " + timsAccount.getCustomerName());
        VipPerson person1 = new VipPerson();
        System.out.println(person1.getName());

        VipPerson person2 = new VipPerson("Bob", 250000.00);
        System.out.println(person2.getName());

        VipPerson person3 = new VipPerson("Tim", 100.00, "tim@gmail.com");
        System.out.println(person3.getName());
        System.out.println(person3.getEmailAddress());
        }
}
