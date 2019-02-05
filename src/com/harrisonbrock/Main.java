package com.harrisonbrock;

public class Main {

    public static void main(String[] args) {

        System.out.println("Hello World!");

        Customer jane = new Customer("Jane", 45.25);
        Customer bob = new Customer("Bob", 33.14);

        VendingMachine food = new VendingMachine("Food");
        VendingMachine drink = new VendingMachine("Drink");
        VendingMachine office = new VendingMachine("Office");

        Snack chips = new Snack("Chips", 36, 1.75, food.getId());
        Snack chocalateBar = new Snack("ChocolateBar", 36, 1.00, food.getId());
        Snack pretzel = new Snack("Pretzel", 30, 2.00, food.getId());

        Snack soda = new Snack("Soda", 24, 2.50, drink.getId());
        Snack water = new Snack("Water", 20, 2.75, drink.getId());

        jane.buyItems(3, soda);
        System.out.println("Customer 1 buys 3 of snack 4.  Cash on hand: " + jane.getCashOnHand() + " quantity of snack 4: " + soda.getQuantity());
        jane.buyItems(1, pretzel);
        System.out.println("Customer 1 buys 1 of snack 3.  Cash on hand: " + jane.getCashOnHand() +  " quantity of snack 3: " + pretzel.getQuantity());

        bob.buyItems(2, water);
        System.out.println("Customer 2 buys 3 of snack 4.  Cash on hand: " + bob.getCashOnHand() +  " quantity of snack 3: " + water.getQuantity());

        jane.addCash(10.00);
        System.out.println("Customer 1 Cash on hand: " + jane.getCashOnHand());

        jane.buyItems(1, chocalateBar);
        System.out.println("Customer 1 buys 1 of snack 2.  Cash on hand: " + jane.getCashOnHand() +  " quantity of snack 3 " + chocalateBar.getQuantity());

        pretzel.addQuantity(12);
        System.out.println("quantity of snack 3: " + pretzel.getQuantity());

        bob.buyItems(3, pretzel);
        System.out.println("Customer 2 buys 3 of snack 3.  Cash on hand: " + bob.getCashOnHand() +  " quantity of snack 3: " + pretzel.getQuantity());




    }
}
