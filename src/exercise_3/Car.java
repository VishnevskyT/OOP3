package exercise_3;

/**
 * Завдання 3
 * Використовуючи IntelliJ IDEA, створіть проект. Потрібно: Створити клас Vehicle. У тілі класу створіть поля:
 * координати та параметри суден (ціна, швидкість, рік випуску). Створіть 3 похідних класи Plane, Саг та Ship.
 * Для класу Plane має бути визначена висота та кількість пасажирів. Для класу Ship – кількість пасажирів та порт
 * приписки. Написати програму, яка виводить на екран інформацію про кожен засіб пересування.
 */

public class Car extends Vehicle{
    public Car(int price, double speed, int year) {
        super(price, speed, year);
    }
    public void vecType () {
        System.out.println("Автомобіль:");
    }
}
