package com.app.fruits;

import java.util.Scanner;

public class FruitBasket 
{

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the size of the fruit basket: ");
        int size = sc.nextInt();

        Fruit[] basket = new Fruit[size];
        int counter = 0;
        int choice;

        do {
            System.out.println("0. Exit");
            System.out.println("1. Add Mango");
            System.out.println("2. Add Orange");
            System.out.println("3. Add Apple");
            System.out.println("4. Display names of all fruits in basket");
            System.out.println("5. Display details of all fresh fruits in basket");
            System.out.println("6. Display tastes of all stale fruits in basket");
            System.out.println("7. Mark a fruit as stale (by index)");
            System.out.println("8. Mark all sour fruits stale");
            System.out.print("Enter your choice: ");
            choice = sc.nextInt();

            switch (choice) {
                case 0:
                    System.out.println("Exiting Fruit Basket Application. Goodbye!");
                    break;

                case 1: 
                    if (counter &lt; basket.length) {
                        System.out.print("Enter Mango Name: ");
                        String name = sc.next();
                        System.out.print("Enter Color: ");
                        String color = sc.next();
                        System.out.print("Enter Weight: ");
                        double weight = sc.nextDouble();

                        basket[counter++] = new Mango(name, color, weight);
                        System.out.println("Mango added successfully!");
                    } else {
                        System.out.println("Basket is full! Cannot add more fruits.");
                    }
                    break;

                case 2: // Add Orange
                    if (counter &lt; basket.length) {
                        System.out.print("Enter Orange Name: ");
                        String name = sc.next();
                        System.out.print("Enter Color: ");
                        String color = sc.next();
                        System.out.print("Enter Weight: ");
                        double weight = sc.nextDouble();

                        basket[counter++] = new Orange(name, color, weight);
                        System.out.println("Orange added successfully!");
                    } else {
                        System.out.println("Basket is full! Cannot add more fruits.");
                    }
                    break;

                case 3: // Add Apple
                    if (counter &lt; basket.length) {
                        System.out.print("Enter Apple Name: ");
                        String name = sc.next();
                        System.out.print("Enter Color: ");
                        String color = sc.next();
                        System.out.print("Enter Weight: ");
                        double weight = sc.nextDouble();

                        basket[counter++] = new Apple(name, color, weight);
                        System.out.println("Apple added successfully!");
                    } else {
                        System.out.println("Basket is full! Cannot add more fruits.");
                    }
                    break;

                case 4: // Display names of all fruits
                    System.out.println("\n--- Fruits in Basket ---");
                    for (Fruit f : basket) {
                        if (f != null) {
                            System.out.println("Fruit Name: " + f.getName());
                        }
                    }
                    break;

                case 5: // Display fresh fruits details + taste
                    System.out.println("\n--- Fresh Fruits Details ---");
                    for (Fruit f : basket) {
                        if (f != null &amp;&amp; f.isFresh()) {
                            System.out.println(f.toString() + " | Taste: " + f.taste());
                        }
                    }
                    break;

                case 6: // Display tastes of all stale fruits
                    System.out.println("\n--- Tastes of Stale Fruits ---");
                    for (Fruit f : basket) {
                        if (f != null &amp;&amp; !f.isFresh()) {
                            System.out.println(f.getName() + " -&gt; Taste: " + f.taste());
                        }
                    }
                    break;

                case 7: // Mark fruit as stale by index
                    System.out.print("Enter index (0 to " + (counter - 1) + ") to mark as stale: ");
                    int index = sc.nextInt();

                    if (index &gt;= 0 &amp;&amp; index &lt; counter &amp;&amp; basket[index] != null) {
                        basket[index].setFresh(false);
                        System.out.println(basket[index].getName() + " at index " + index + " marked as stale.");
                    } else {
                        System.out.println("Error: Invalid index!");
                    }
                    break;

                case 8: 
                    int markedCount = 0;
                    for (Fruit f : basket) {
                        if (f != null &amp;&amp; "sour".equalsIgnoreCase(f.taste())) {
                            f.setFresh(false);
                            markedCount++;
                        }
                    }
                    System.out.println("Marked " + markedCount + " sour fruit(s) as stale.");
                    break;

                default:
                    System.out.println("Invalid choice! Please select between 0 and 8.");
            }
        } while (choice != 0);
   
}
    }