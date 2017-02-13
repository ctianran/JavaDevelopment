package com.company;

public class Main {

    public static void main(String[] args) {
	    // The purpose of the application is to help a ficticious company called Bills Burgers to manage
        // their process of selling hamburgers.
        // Our application will help Bill to select types of burgers, some of the additional items (additions)
        // to be added to the burgers and pricing.
        // We want to create a base hamburgers, but also two other types of hamburgers that are popular ones in Bills store.
        // The basic hamburger should have the following items.
        // bread roll type, meant and up to 4 additional additions (things like lettuce, tomato, carrot, etc) that
        // the customer can select to be added to the burger.
        // Each one of these items gets charged an additiona price so you need some way to track how many items got added
        // and to calculate the price (for the base burger and all the additions).
        // This burger has a base price and the additions are all seperately priced.
        // Create a Hamburger class to deal with all the above.
        // The constructor should only include the roll type, meat and price.

        Hamburger hamburger = new Hamburger("Basic", "Sausage", 3.56, "White");
        double price = hamburger.itemizeHamburger();

        hamburger.addHamburgerAddition1("Tomato", 0.27);
        hamburger.addHamburgerAddition2("Lettuce", 0.75);
        hamburger.addHamburgerAddition3("Cheese", 1.12);

        System.out.println("Total Burger price is " + hamburger.itemizeHamburger());

        HealthyBurger healthyBurger = new HealthyBurger("Bacon", 5.67);
        healthyBurger.addHamburgerAddition1("Egg", 5.43);
        healthyBurger.itemizeHamburger();
        healthyBurger.addHealthAddition1("Lentils", 3.41);

        System.out.println("Total Healthy Burger price is " + healthyBurger.itemizeHamburger());

        DeluxeBurger db = new DeluxeBurger();
        db.itemizeHamburger();

    }
}
