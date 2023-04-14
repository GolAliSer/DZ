package DZ;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.print("Введите первую строку: ");
        String s1 = in.nextLine();

        System.out.print("Введите вторую строку: ");
        String s2 = in.nextLine();

        int count = Match.countmatches(s1, s2);

        System.out.println("Результат: " + count);
    }
}


