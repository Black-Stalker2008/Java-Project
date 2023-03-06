package lesson1;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
//        inputNameAndPrintHI();
        arrMax();
//
    }

    private static void inputNameAndPrintHI() {
        Scanner in = new Scanner(System.in);
        System.out.println("Введите имя:");
        String name = in.nextLine();
        System.out.printf("Hello, %s!", name);
    }

    private static void arrMax() {
        int[] arr = {1, 1, 1, 1, 0, 1, 0, 1, 1, 0, 1, 1, 1, 1, 1, 1};
        int count = 0;
        int temp = 0;

        for (int num : arr) {
            if (num == 1) {
                temp++;
                if (count < temp) {
                    count = temp;
                }
            } else {
                temp = 0;
            }
        }
        System.out.println(count);
    }
}
