package util;

public class Emojis {
    public static void loadEmojis() throws Exception {
        for (int i = 9770; i < 9800; i++) {
            char b = (char) i;
            System.out.print(b + " ");
            Thread.sleep(300);
        }
        System.out.println();
    }
}
