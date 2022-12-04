package exercise_2;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        ExcellentPupil excellentPupil = new ExcellentPupil();
        GoodPupil goodPupil = new GoodPupil();
        BadPupil badPupil = new BadPupil();

        ClassRoom classRoom1 = new ClassRoom(badPupil, goodPupil,excellentPupil);
        ClassRoom classRoom2 = new ClassRoom(goodPupil,excellentPupil);
        ClassRoom classRoom3 = new ClassRoom(excellentPupil,excellentPupil,goodPupil,badPupil);


        Scanner scanner = new Scanner(System.in);
        System.out.print("Введіть номер класу (1, 2, або 3): _");
        int classNumber = scanner.nextInt();

        switch (classNumber) {
            case 1 -> {
                System.out.print("У 1-му класі успішність дітей наступна:");
               classRoom1.pupilSuccess();
            }
            case 2 -> {
                System.out.print("У 2-му класі успішність дітей наступна:");
                classRoom2.pupilSuccess();
            }
            case 3 -> {
                System.out.print("У 3-му класі успішність дітей наступна:");
                classRoom3.pupilSuccess();
            }
            default ->
                    System.out.print("Такого класу в школі немає. Виберить один з трьох (1, 2, або 3) наявних класів.");
        }


    }
}
