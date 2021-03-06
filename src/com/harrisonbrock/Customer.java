package com.harrisonbrock;

public class Customer {

    private static int maxId = 0;

    private int id;
    private String name;
    private double cashOnHand;

    public Customer(String name, double cashOnHand) {

        maxId++;

        this.id = maxId;
        this.name = name;
        this.cashOnHand = cashOnHand;
    }

    public static int getMaxId() {
        return maxId;
    }

    public int getId() {
        return id;
    }


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getCashOnHand() {
        return cashOnHand;
    }

    public void setCashOnHand(double cashOnHand) {
        this.cashOnHand = cashOnHand;
    }

    public void buyItems(int quantity, Snack snack) {
        double total = quantity * snack.getCost();

        if ( total <= this.cashOnHand) {
            this.cashOnHand = this.cashOnHand - total;
            snack.buyQuantity(quantity);
        }
    }

    public void addCash(double amount) {
        this.cashOnHand = this.cashOnHand + amount;
    }
}
