package Lesson4HW;

import java.util.LinkedList;
import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {
        stringsRemember();
    }

    private static void stringsRemember() {
        Scanner in = new Scanner(System.in);
        LinkedList<String> wordsList = new LinkedList<>();
        while (true) {
            System.out.println();
            System.out.print("Введите строку: ");
            String inputString = in.nextLine();

            if (inputString.isBlank()) {
                System.out.println("Строка не должна быть пустой");

            } else if (inputString.equalsIgnoreCase("stop")) {
                System.out.println("Программа остановлена");
                break;

            } else if (inputString.equalsIgnoreCase("print")) {
                if (wordsList.isEmpty()) {
                    System.out.println("В списке нет данных для вывода");
                }else {
                    printAllValues(wordsList);
                }

            } else if (inputString.equalsIgnoreCase("revert")) {
                if (wordsList.isEmpty()) {
                    System.out.println("В списке нет данных для удаления");
                } else {
                    deleteLastValue(wordsList);
                }

            } else {
                wordsList.addFirst(inputString);
                printAddMessage(inputString);
            }
        }

    }

    private static void printAllValues(LinkedList<String> list) {
        System.out.println(list);
    }

    private static void printAddMessage(String word) {
        System.out.printf("Слово \"%s\" добавлено %n", word);
    }

    private static void deleteLastValue(LinkedList<String> list) {
        System.out.printf("Удалили слово \"%s\" %n",list.removeFirst());
    }

}

