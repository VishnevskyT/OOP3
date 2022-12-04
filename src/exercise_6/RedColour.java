package exercise_6;

public class RedColour extends Printer {

    @Override
    void print(String value) {
        System.out.print("\u001b" + (char)91 + "31" + (char)59 + "1m");
        super.print(value);
    }
}
