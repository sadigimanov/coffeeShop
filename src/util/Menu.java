package util;


public class Menu {
    public static void processMenu(int selectedMenu) throws Exception {
        switch (selectedMenu) {
            case 1:
                ClientUtil.addBalance();
                break;
            case 2:
                ClientUtil.showBalance();
                break;
            case 3:
                OrderCoffee.hotOrIced();
                OrderCoffee.coffeeMenu();
                break;
            case 4:
                System.exit(0);
        }
    }
}
