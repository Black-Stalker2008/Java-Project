package Lesson6HW;

import lombok.Getter;
import lombok.Setter;

import java.util.Objects;

@Getter
@Setter

public class Notebook {
    private String manufacturer;
    private Double ram;
    private Double hardDisk;
    private String color;
    private Double diagonal;

    public Notebook(String manufacturer, Double ram, Double hardDisk, String color, Double diagonal) {
        this.manufacturer = manufacturer;
        this.ram = ram;
        this.hardDisk = hardDisk;
        this.color = color;
        this.diagonal = diagonal;
    }

    @Override
    public String toString() {
        return "Марка = '" + manufacturer + '\'' +
                ", Оперативная память = " + ram + " MB" +
                ", Жёсткий диск = " + hardDisk + " GB" +
                ", Цвет ='" + color + '\'' +
                ", Диагональ = " + diagonal + "\"";
    }

    public void printNoteBooks() {
        System.out.println(this);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Notebook notebook = (Notebook) o;
        return Objects.equals(manufacturer, notebook.manufacturer)
                && Objects.equals(ram, notebook.ram)
                && Objects.equals(hardDisk, notebook.hardDisk)
                && Objects.equals(color, notebook.color)
                && Objects.equals(diagonal, notebook.diagonal);
    }

    @Override
    public int hashCode() {
        return Objects.hash(manufacturer, ram, hardDisk, color, diagonal);
    }
}


