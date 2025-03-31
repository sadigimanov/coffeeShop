package coffeeShop;

import java.util.Locale;
import java.util.Random;
import java.util.Scanner;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
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

//        System.out.println("What do you drink?");
//        System.out.println("Menu:");


        //TODO switch ile yaz
        int order = sc.nextInt();
        /*for (int i = 0; i < coffee.length; i++) {
            if (order == i + 1) {
                for (int j = 10; j <= 100; j += 10) {
                    String process = "\rprocessing " + j + "%";
                    System.out.print(process);

                    if(j == 100){
                        System.out.println("\n"+coffee[i] + " is ready");
                    }

                    Thread.sleep(500);
                }
            }
        }*/
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