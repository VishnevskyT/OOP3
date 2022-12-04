package exercise_2;

/**
 * Завдання 2
 * Використовуючи IntelliJ IDEA, створіть проект. Потрібно:
 * Створити клас, який представляє навчальний клас ClassRoom. Створіть клас учень Pupil. У тілі класу створіть
 * методи void study(), void read(), void write(), void relax(). Створіть 3 похідні класу ExcelentPupil,
 * GoodPupil, BadPupil від класу базового класу Pupil і перевизначте кожен із методів, залежно від успішності учня.
 * Конструктор класу ClassRoom приймає аргументи типу Pupil, клас має складатися із 4 учнів. Передбачте можливість,
 * що користувач може передати 2 або 3 аргументи. Виведіть інформацію про те, як усі учні екземпляра класу ClassRoom
 * вміють навчатися, читати, писати, відпочивати.
 */

public class ClassRoom {

 Pupil pupil1, pupil2, pupil3, pupil4;

    public ClassRoom(Pupil pupil1, Pupil pupil2) {
        this.pupil1 = pupil1;
        this.pupil2 = pupil2;
    }
    public ClassRoom(Pupil pupil1, Pupil pupil2, Pupil pupil3) {
        this.pupil1 = pupil1;
        this.pupil2 = pupil2;
        this.pupil3 = pupil3;
    }
    public ClassRoom(Pupil pupil1, Pupil pupil2, Pupil pupil3, Pupil pupil4) {
        this.pupil1 = pupil1;
        this.pupil2 = pupil2;
        this.pupil3 = pupil3;
        this.pupil4 = pupil4;
    }
    Pupil ability = new Pupil();

    public void pupilSuccess() {
        ability.study();
        pupil1.study();
        pupil2.study();
        if (pupil3 != null)
            pupil3.study();
        if (pupil4 != null)
            pupil4.study();

        ability.read();
        pupil1.read();
        pupil2.read();
        if (pupil3 != null)
            pupil3.read();
        if (pupil4 != null)
            pupil4.read();

        ability.write();
        pupil1.write();
        pupil2.write();
        if (pupil3 != null)
            pupil3.write();
        if (pupil4 != null)
            pupil4.write();

        ability.relax();
        pupil1.relax();
        pupil2.relax();
        if (pupil3 != null)
            pupil3.relax();
        if (pupil4 != null)
            pupil4.relax();
    }

}
