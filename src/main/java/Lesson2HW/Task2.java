package Lesson2HW;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;

public class Task2 {

    public static void main(String[] args) throws IOException {
        // File note = new File("file.txt");
        // Path note = Path.of("JAVA\java-practic030323\src\main\java\Lesson2HW\Task2.java");
        Path file = Path.of("src/main/java/Lesson2HW/Lesson2HW.txt");
        try {
            Files.createFile(file);
        } catch (IOException e) {
            System.out.println("Файл уже существует!");
        }

        StringBuilder text = new StringBuilder();
        for (int i = 0; i < 100; i++) {
            text.append("TEST ");
        }

        Files.writeString(file, text);
    }

}