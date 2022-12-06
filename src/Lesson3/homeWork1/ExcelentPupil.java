package Lesson3.homeWork1;

public class ExcelentPupil extends Pupil{
    public ExcelentPupil(String firstName, String lastName, int age) {
        super(firstName, lastName, age);
    }

    public ExcelentPupil(String firstName, String lastName) {
        super(firstName, lastName);
    }

    public ExcelentPupil(String lastName) {
        super(lastName);
    }

    public ExcelentPupil() {
    }

    @Override
    void read() {
        super.read();
        System.out.println("Excellent reading skills");
    }

    @Override
    void write() {
        super.write();
        System.out.println("Excellent writing skills");
    }

    @Override
    void study() {
        super.study();
        System.out.println("Good studying skills");
    }

    @Override
    void relax() {
        super.relax();
        System.out.println("Doesn't like to relax");
    }
}
