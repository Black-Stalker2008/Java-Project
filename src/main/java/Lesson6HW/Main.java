package Lesson6HW;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

import static Lesson6HW.Methods.*;

public class Main {
    public static void main(String[] args) {
        Notebook nB1 = new Notebook("Apple", 4000.0, 500.0, "black", 17.0);
        Notebook nB2 = new Notebook("Samsung", 8000.0, 500.0, "red", 17.0);
        Notebook nB3 = new Notebook("Lenovo", 4000.0, 1000.0, "silver", 19.0);
        Notebook nB4 = new Notebook("Huawei", 8000.0, 500.0, "white", 17.0);
        Notebook nB5 = new Notebook("Acer", 8000.0, 1000.0, "black", 21.0);
        Notebook nB6 = new Notebook("HP", 4000.0, 1000.0, "red", 19.0);
        Notebook nB7 = new Notebook("Acer", 4000.0, 500.0, "black", 21.0);
        Notebook nB8 = new Notebook("Apple", 8000.0, 1000.0, "white", 17.0);

        ArrayList<Notebook> NoteBooks = new ArrayList<Notebook>();
        Collections.addAll(NoteBooks, nB1, nB2, nB3, nB4, nB5, nB6, nB7, nB8);
        startSystem(NoteBooks);

    }

    private static void startSystem(ArrayList<Notebook> book) {
        Scanner in = new Scanner(System.in);

        while (true) {
            System.out.println();
            System.out.print("""
                    Выберите характеристику ноутбука, нажав соотвествующую цифру:
                    "1" -> Марка
                    "2" -> Оперативная память
                    "3" -> Жёсткий диск
                    "4" -> Цвет
                    "5" -> Диагональ экрана
                    "6" -> Заполнить все характеристики
                    "7" -> Вывести список доступных ноутбуков
                    "0" -> Остановить программу
                    """);

            String inputString = in.nextLine();

            if (inputString.isBlank()) {
                System.out.println("Строка не должна быть пустой. Попробуйте ещё раз!\n");
                continue;
            }

            if (inputString.equals("0")) {
                System.out.println("Работа программы завершена.\n");
                break;
            }

            if (inputString.equals("1")) {
                manufacturerFind(book);
                continue;
            }

            if (inputString.equals("2")) {
                ramFind(book);
                continue;
            }

            if (inputString.equals("3")) {
                hardDiskFind(book);
                continue;
            }

            if (inputString.equals("4")) {
                colorFind(book);
                continue;
            }

            if (inputString.equals("5")) {
                diagonalFind(book);
                continue;
            }

            if (inputString.equals("7")) {
                printAllNoteBooks(book);
                continue;
            }

            if (inputString.equals("6")) {
                allParametersFind(book);

            } else {
                System.out.println("Ошибка ввода команды. Попробуйте ещё раз!\n");
            }
        }
    }
}
