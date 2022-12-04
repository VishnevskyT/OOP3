package exercise_6;

public class BlueColour extends Printer {
    @Override
    void print(String value) {
        System.out.print("\u001b" + (char)91 + "34" + (char)59 + "1m");
        super.print(value);

    }
}
