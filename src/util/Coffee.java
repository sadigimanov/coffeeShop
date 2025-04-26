package util;

import java.util.ArrayList;
import java.util.Scanner;

public class Coffee {
    private String name;
    private double price;

    public static ArrayList<Coffee> coffeeList = new ArrayList<>();

    public Coffee(String name, double price) {
        this.name = name;
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public double getPrice() {
        return price;
    }

    @Override
    public String toString() {
        return String.format("%-15s $%.2f", name, price);
    }

    public static void showCoffee() {
//        System.out.println("Available coffees:");
        System.out.println("-----------------------------");

        for (int i = 0; i < coffeeList.size(); i++) {
            Coffee coffee = coffeeList.get(i);
            System.out.printf("%-1d. %-15s $%.2f\n", (i + 1), coffee.getName(), coffee.getPrice());
        }

        System.out.println("-----------------------------");
    }

    public static void createNewCoffee() {
        String name = Input.requiredText("New coffee name:");
        double price = Input.requiredDouble("New coffee price:");

        Coffee newCoffee = new Coffee(name, price);
        coffeeList.add(newCoffee);
        System.out.println("New coffee added: " + newCoffee);
    }
}
