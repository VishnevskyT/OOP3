package exercise_3;

public class Plane extends Vehicle {
    int height;
    int passengers;

    public Plane(int price, double speed, int year, int height, int passengers) {
        super(price, speed, year);
        this.height = height;
        this.passengers = passengers;
    }
    public void vecType () {
        System.out.println("Літак:");
    }
}
