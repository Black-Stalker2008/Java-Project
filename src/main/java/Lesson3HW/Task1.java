package Lesson3HW;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Random;

public class Task1 {
    public static void main(String[] args) {
        ArrayList<Integer> random_lst = new ArrayList<>();
        Random f = new Random();
        for (int i = 0; i < 10; i++) {
            random_lst.add(f.nextInt(101));
        }
        System.out.println(random_lst.toString());


        for (Iterator<Integer> iterator = random_lst.iterator(); iterator.hasNext(); ) {
            Integer number = iterator.next();
            if (number % 2 == 0) {
                iterator.remove();
            }
        }
        System.out.println(random_lst.toString());
    }
}
