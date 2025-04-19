package coffeeShop;

import java.util.Scanner;

import util.Emojis;
import util.Input;
import util.OrderCoffee;
import util.Menu;

public class Main {
    public static void main(String[] args) throws Exception {
        Emojis.loadEmojis();

        String name = Input.requiredText("Enter your name:");
        String surname = Input.requiredText("Enter your surname:");
        OrderCoffee.welcomeMessage(name,surname);


        int menu = 0;
        while (true) {
            menu = Input.requiredNumber("What do you want to do?"
                    + "\n1.Add Amount"
                    + "\n2.Show All Wallet"
                    + "\n3.Order"
                    + "\n4.Exit\n");

            Menu.processMenu(menu);
        }

    }
}