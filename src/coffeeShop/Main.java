package coffeeShop;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws InterruptedException {
        for (int i = 9770; i < 9800; i++) {
            char b = (char) i;
            System.out.print(b + " ");
            Thread.sleep(300);
        }
        System.out.println();
        Scanner sc = new Scanner(System.in);
        System.out.print("Name:");
        String name = sc.nextLine();
        System.out.print("Surname:");
        String surname = sc.nextLine();

        System.out.println("Welcome to our coffee shop " + name + " " + surname + "!" + " \n" + "Would you like hot or iced coffee?");

        String[] coffee = {"Mocha", "Cappuccino", "Latte", "Espresso", "Americano", "Macchiato", "Turkish coffee"};

        String temp = sc.next();
        if (temp.toLowerCase().equals("hot")) {
            System.out.println("Hot coffee menu:");
        } else if (temp.toLowerCase().equals("iced")) {
            System.out.println("Iced coffee menu:");
        } else {
            System.out.println("Try again!");
        }
        for (int j = 10; j <= 100; j += 10) {
            String process = "\rMenu loading.. " + j + "%";
            System.out.print(process);

            if (j == 100) {
                System.out.println();
                for (int i = 0; i < coffee.length; i++) {
                    System.out.println((i + 1) + " " + coffee[i] + ":" + " " + "$2.65 / $2.95 / $3.35");
                }
            }

            Thread.sleep(500);
        }

        int order = sc.nextInt();

        switch (order) {
            case 1:
                System.out.println("Mocha");
                break;
            case 2:
                System.out.println("Cappuccino");
                break;
            case 3:
                System.out.println("Latte");
                break;
            case 4:
                System.out.println("Espresso");
                break;
            case 5:
                System.out.println("Americano");
                break;
            case 6:
                System.out.println("Macchiato");
                break;
            case 7:
                System.out.println("Turkish coffee");
                break;
            default:
                System.out.println("Try again!");
        }

        for (int j = 10; j <= 100; j += 10) {
            String process = "\rprocessing.. " + j + "%";
            System.out.print(process);

            if (j == 100) {
                System.out.println("\n" + "Your order is ready");
            }

            Thread.sleep(500);
        }
    }
}