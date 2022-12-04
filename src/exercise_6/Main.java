package exercise_6;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введіть будь-який текст: _");
        String value = scanner.nextLine();
        Printer printer = new Printer();
        Printer printer1 = new RedColour();
        Printer printer2 = new BlueColour();
        printer.print(value);
        printer1.print(value);
        printer2.print(value);
    }
}
