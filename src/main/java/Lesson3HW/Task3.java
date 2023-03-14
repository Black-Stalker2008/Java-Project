package Lesson3HW;

import java.util.*;
import static java.lang.Integer.*;
public class Task3 {
    public static void main(String[] args) {

        List<String> different = List.of("apple", "-2", "apricot", "1", "banana", "-5",
                "fig", "20", "grapefruit", "-163", "grapes", "152", "kiwi", "82", "lime", "-21", "mango", "0");
        List<String> randomList = createRandomList(different);
        System.out.printf("Random list:\n" + randomList + "\n");
        deleteIntegerMethod(randomList);

    }

    private static void deleteIntegerMethod(List<String> str) {
        List <String> result = new ArrayList<>();
        for (int i = 0; i < str.size(); i++) {
            try {
                Integer.parseInt(str.get(i));
            } catch (NumberFormatException e) {
                result.add(str.get(i));
            }
        }
        System.out.printf("Array after deleting integers:\n" + result);
    }

    private static List<String> createRandomList(List<String> str) {
        Scanner in = new Scanner(System.in);
        System.out.println("Input size of array:");
        int size = parseInt(in.nextLine());
        in.close();
        Random random = new Random();
        List<String> stringList = new ArrayList<>();
        for (int i = 0; i < size; i++) {
            String randomElement = str.get(random.nextInt(str.size()));
            stringList.add(randomElement);
        }
        return stringList;
    }
}
