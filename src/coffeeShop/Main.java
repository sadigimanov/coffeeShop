package coffeeShop;

import util.*;


import static util.Coffee.coffeeList;

public class Main {

    public static void main(String[] args) throws Exception {
        Emojis.loadEmojis();
        coffeeList.add(new Coffee("Latte",3.50));
        coffeeList.add(new Coffee("Espresso", 2.25));
        coffeeList.add(new Coffee("Cappuccino", 3.00));
        coffeeList.add(new Coffee("Americano", 2.75));
        coffeeList.add(new Coffee("Macchiato", 3.20));

        String name = Input.requiredText("Enter your name:");
        String surname = Input.requiredText("Enter your surname:");
        OrderCoffee.welcomeMessage(name,surname);


        int menu = 0;
        while (true) {
            menu = Input.requiredNumber("What do you want to do?"
                    + "\n1.Add Amount"
                    + "\n2.Show All Wallet"
                    + "\n3.Order"
                    + "\n4.Show Coffee"
                    + "\n5.Create New Coffee"
                    + "\n6.Exit\n");

            Menu.processMenu(menu);
        }

    }
}
//TODO
/*
Taskınız

1) Kofe şop proyektiniz üçün kofe class'ı yaradırsınız. Onun özünə özəl özəllikləri olsun. Məsələn name,price və s.

*Proqram run olunarkən avtomatik 5 dənə kofe obyekti yaradılsın. Və array'ə əlavə edilsin.

*User kofelər'i göstər seçiminə basanda bu siyahıdakı obyektlərin info'ları fetch edilsin və user'ə göstərilsin.

*Proqramda kofe yarat seçimi olsun. Buna basdıqdan sonra user lazım olan infoları verdikdən sonra yeni kofe obyekti yaradılmalı və ümumi kofelərin olduğu siyahıya əlavə edilməli.

*Bundan sonra user kofeləri göstərə klik etdikdə yeni kofedə göstərilməli.
* */