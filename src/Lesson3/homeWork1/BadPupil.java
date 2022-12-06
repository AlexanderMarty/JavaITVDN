package Lesson3.homeWork1;

public class BadPupil extends Pupil{
    public BadPupil(String firstName, String lastName, int age) {
        super(firstName, lastName, age);
    }

    public BadPupil(String firstName, String lastName) {
        super(firstName, lastName);
    }

    public BadPupil(String lastName) {
        super(lastName);
    }

    public BadPupil() {
    }

    @Override
    void read() {
        super.read();
        System.out.println("Bad reading skills");
    }

    @Override
    void write() {
        super.write();
        System.out.println("Bad writing skills");
    }

    @Override
    void study() {
        super.study();
        System.out.println("Doesn't like to study");
    }

    @Override
    void relax() {
        super.relax();
        System.out.println("Likes to relax");
    }
}
