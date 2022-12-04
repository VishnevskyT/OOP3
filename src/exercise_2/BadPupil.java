package exercise_2;

public class BadPupil extends Pupil {

    @Override
    void study() {
        System.out.print("задовільно, ");
    }

    @Override
    void read() {
        System.out.print("задовільно, ");
    }

    @Override
    void write() {
         System.out.print("задовільно, ");
    }

    @Override
    void relax() {
        System.out.print("задовільно, ");
    }
}
