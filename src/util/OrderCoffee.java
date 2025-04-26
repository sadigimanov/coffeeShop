package util;

public class OrderCoffee {


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

        Thread.sleep(500);

    }

    public static void coffeeMenu() throws InterruptedException {
        Coffee.showCoffee();

        int order = Input.requiredNumber("Your choice:\n") - 1;

        if (order >= 0 && order < Coffee.coffeeList.size()) {
            Coffee selected = Coffee.coffeeList.get(order);
            System.out.println("You ordered: " + selected.getName());
        } else {
            System.out.println("Invalid selection!");
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

