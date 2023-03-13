package Lesson1HW;

import java.util.Arrays;
import java.time.LocalDateTime;
import java.util.Calendar;
import java.util.GregorianCalendar;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        //arrayMaxAndMin(); //1. Задать одномерный массив и найти в нем минимальный и максимальный элементы
        //arrangeArrayVal(); //2. Если в массиве есть числа, равные заданному, нужно перенести эти элементы в конец массива
          greetingUser(); //3. В консоли запросить имя пользователя. В зависимости от текущего времени
    }

    private static void greetingUser() {
        LocalDateTime now = LocalDateTime.now();
        Calendar calendar = new GregorianCalendar();
        System.out.println(calendar);
        System.out.println(now);
        System.out.println("Введите имя:");
        Scanner in = new Scanner(System.in);
        String name = in.nextLine();
        in.close();
        if (Calendar.getInstance().get(Calendar.HOUR_OF_DAY) >= 5
                && Calendar.getInstance().get(Calendar.HOUR_OF_DAY) < 12) {
            System.out.println("Доброе утро, " + name + "!");
        } else if (Calendar.getInstance().get(Calendar.HOUR_OF_DAY) >= 12
                && Calendar.getInstance().get(Calendar.HOUR_OF_DAY) < 18) {
            System.out.println("Добрый день, " + name + "!");
        } else if (Calendar.getInstance().get(Calendar.HOUR_OF_DAY) >= 18
                && Calendar.getInstance().get(Calendar.HOUR_OF_DAY) < 23) {
            System.out.println("Добрый вечер, " + name + "!");
        } else if (Calendar.getInstance().get(Calendar.HOUR_OF_DAY) >= 23
                && Calendar.getInstance().get(Calendar.HOUR_OF_DAY) < 5) {
            System.out.println("Доброй ночи, " + name + "!");
        }

    }

    private static void arrangeArrayVal() {
        int[] nums = {3, 2, 2, 3};
        int start = 0;
        int val = 3;
        for (int i : nums) {
            if (i != val) {
                nums[start++] = i;
            }
        }
        for (int i = start; i < nums.length; i++) {
            nums[i] = val;
        }
        System.out.println(Arrays.toString(nums));
    }

    private static void arrayMaxAndMin() {
        int[] arr = {1, 10, 5, -4, 7, 2, -4, 0};
        int max = arr[0];
        int min = arr[0];
        for (int i : arr) {
            if (i > max) {
                max = i;
            } else if (i < min) {
                min = i;
            }
        }
        System.out.println(max + " " + min);
    }
}
