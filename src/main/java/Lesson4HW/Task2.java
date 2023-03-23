package Lesson4HW;

import java.util.Collections;
import java.util.LinkedList;

public class Task2 {
    public static void main(String[] args) {
        LinkedList<String> wordsList = new LinkedList<>();
        Collections.addAll(wordsList, "Charles", "Milton", "Wilfrid", "John", "Henry", "Benedict", "Calvin");
        reversLinkedListMethod(wordsList);
    }

    private static void reversLinkedListMethod(LinkedList<String> list) {
        LinkedList<String> reversedList = new LinkedList<>();
        System.out.printf("Заданный список:%n" + list + "\n");
        for (String word : list) {
            reversedList.push(word);
        }
        System.out.printf("Перевёрнутый список:%n" + reversedList + "\n");
    }
}

