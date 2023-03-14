package Lesson3HW;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Random;

public class Task2 {
    public static void main(String[] args) {
        ArrayList<Integer> random_lst = new ArrayList<>();
        Random arr = new Random();
        for (int i = 0; i < 10; i++) {
            random_lst.add(arr.nextInt(101));
        }
        System.out.println(random_lst.toString());

        System.out.println("Max: " + Collections.max(random_lst));
        System.out.println("Min: " +Collections.min(random_lst));

        int summ = 0;
        for (int number : random_lst){
            summ += number;
        }

        int average = summ/random_lst.size();
        System.out.println("Arithmetic mean: " +average);

    }
}

