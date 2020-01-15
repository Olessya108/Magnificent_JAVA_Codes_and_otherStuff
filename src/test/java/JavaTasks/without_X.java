package JavaTasks;

import java.util.Scanner;

public class without_X {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        String word = scan.next();
        if (!("" + word.charAt(2)).equalsIgnoreCase("x")) {
            if (word.substring(0, 2).contains("x")) {
                if (word.substring(0, 2).equalsIgnoreCase("xx")) {
                    System.out.println(word.substring(2, word.length()));
                } else
                    System.out.println(word.replaceFirst("x", ""));

            }
        } else
            System.out.println(word);
    }

}