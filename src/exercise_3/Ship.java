package exercise_3;

public class Ship extends Vehicle{
    int passengers;
    String port;

    public Ship(int price, double speed, int year, int passengers, String port) {
        super(price, speed, year);
        this.passengers = passengers;
        this.port = port;
    }
    public void vecType () {
        System.out.println("Корабель:");
    }
}

