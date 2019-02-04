package com.harrisonbrock;

public class Main {

    public static void main(String[] args) {

        System.out.println("Hello World!");

        Customer jane = new Customer("Jane", 45.25);
        Customer bob = new Customer("Bob", 33.14);

        VendingMachine food = new VendingMachine("Food");
        VendingMachine drink = new VendingMachine("Drink");
        VendingMachine office = new VendingMachine("Office");

    }
}
