package util;

public class ClientUtil {
    private static int balance = 0;

    public static void addBalance(){
        int amount = Input.requiredNumber("The amount you will add:");
        balance += amount;
        System.out.println(amount + " manats added." + "\n" + "balance" + ":" + balance + " " + "manats");
    }

    public static void showBalance(){
        System.out.println("Your current balance: " + balance + " manats");
    }

}
