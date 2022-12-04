package exercise_3;

public class Vehicle {
    int price;
    protected double speed;
    private int year;

    public Vehicle() {
    }

    public Vehicle(int price, double speed, int year) {
        this.price = price;
        this.speed = speed;
        this.year = year;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }
}
