package exercise_3;

public class Main {
    public static void main(String[] args) {
        Car car = new Car(15_000, 199.00, 2016);
        car.vecType();
        System.out.println("Ціна = " + car.price + ", швидкість = " + car.speed + ", Рік = " + car.getYear());

        Plane plane = new Plane(3000_000, 700.00, 2018, 3_000, 10);
        plane.vecType();
        System.out.println("Ціна = " + plane.price + ", швидкість = " + plane.speed + ", Рік = " + plane.getYear() + ", висота = " + plane.height + ", кількість пасажирів = " + plane.passengers);

        Ship ship = new Ship(300_000, 78.00, 2010, 30, "Saint-Tropez");
        ship.vecType();
        System.out.println("Ціна = " + ship.price + ", швидкість = " + ship.speed + ", Рік = " + ship.getYear() + ", кількість пасажирів = " + ship.passengers + ", порт = " + ship.port);

    }

}
