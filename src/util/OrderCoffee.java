package util;

public class OrderCoffee {
    private String name;
    private String surname;

    public OrderCoffee(String name, String surname) {
        this.name = name;
        this.surname = surname;
    }

    public static void welcomeMessage(String name, String surname) {
        System.out.println("Welcome to our coffee shop " + name + " " + surname + "!");
    }

    public static void hotOrIced() throws Exception {
        String temp = Input.requiredText("Would you like hot or iced coffee?\n").toLowerCase().trim();

        if (temp.equals("hot")) {
            System.out.println("Hot coffee menu:");
        } else if (temp.equals("iced")) {
            System.out.println("Iced coffee menu:");
        } else {
            System.out.println("Try again!");
            return;
        }

        String[] coffee = {"Mocha", "Cappuccino", "Latte", "Espresso", "Americano", "Macchiato", "Turkish coffee"};
        for (int j = 10; j <= 100; j += 10) {
            System.out.print("\rMenu loading.. " + j + "%");

            if (j == 100) {
                System.out.println();
                for (int i = 0; i < coffee.length; i++) {
                    System.out.println((i + 1) + " " + coffee[i] + ":" + " " + "$2.65 / $2.95 / $3.35");
                }
            }

            Thread.sleep(500);
        }

    }

    public static void coffeeMenu() throws InterruptedException {
        int order = Input.requiredNumber("Your choice:\n");

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
                System.out.println("\n" + "Your order has been confirmed.");
            }

            Thread.sleep(500);
        }
    }

}

