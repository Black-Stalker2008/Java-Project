package Lesson5HW;

import java.util.*;

public class Task1 {
    public static Map<String, List<String>> phoneBook = new HashMap<>();
    public static void addPerson() {
        phoneBook.put("Михаил", List.of("+7 (935) 744-71-49", "+7 (996) 769-40-82"));
        phoneBook.put("Дмитрий", List.of("+7 (967) 503-56-48", "+7 (922) 770-16-70"));
        phoneBook.put("Анастасия", List.of("+7 (952) 705-69-16"));
        phoneBook.put("Ксения", List.of("+7 (951) 752-95-76", "+7 (928) 368-32-69"));
        phoneBook.put("Егор", List.of("+7 (924) 674-84-97", "+7 (960) 712-94-33"));

    }
    public static void main(String[] args) {
        addPerson();
        Scanner sc = new Scanner(System.in);
        System.out.print("Имя: ");
        String str = sc.nextLine();
        sc.close();
        findPerson(str);
    }

    public static void findPerson(String surname) {
        System.out.printf("%s: %s", surname, phoneBook.get(surname));
    }
}
