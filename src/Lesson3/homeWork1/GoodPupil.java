package Lesson3.homeWork1;

public class GoodPupil extends Pupil{
    public GoodPupil(String firstName, String lastName, int age) {
        super(firstName, lastName, age);
    }

    public GoodPupil(String firstName, String lastName) {
        super(firstName, lastName);
    }

    public GoodPupil(String lastName) {
        super(lastName);
    }

    public GoodPupil() {
    }

    @Override
    void read() {
        super.read();
        System.out.println("Average reading skills");
    }

    @Override
    void write() {
        super.write();
        System.out.println("Average writing skills");
    }

    @Override
    void study() {
        super.study();
        System.out.println("No the sharpest tool in the box");
    }

    @Override
    void relax() {
        super.relax();
        System.out.println("Likes to relax");
    }
}
