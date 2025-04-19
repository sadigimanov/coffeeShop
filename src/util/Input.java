package util;

import java.util.Scanner;

public class Input {
    public static String requiredText(String title) {
        Scanner sc = new Scanner(System.in);
        System.out.print(title);
        String text = sc.nextLine();
        return text;
    }

    public static int requiredNumber(String title) {
        Scanner sc = new Scanner(System.in);
        System.out.print(title);
        int num = sc.nextInt();
        return num;
    }
}
