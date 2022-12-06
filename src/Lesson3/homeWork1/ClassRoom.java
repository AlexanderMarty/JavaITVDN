package Lesson3.homeWork1;

public class ClassRoom {
    public static void main(String[] args) {
        Pupil pupil1 = new ExcelentPupil("Mark", "johnson");
        Pupil pupil2 = new GoodPupil("Smith");
        Pupil pupil3 = new BadPupil("Ivan", "Petrenko", 15);
        Pupil pupil4 = new BadPupil("Jack", "Johnson", 13);

        Pupil[] classroom = {pupil1, pupil2, pupil3, pupil4};


        pupil1.read();
        pupil1.write();
        pupil1.study();
        pupil1.relax();
        System.out.println("----------------");

        pupil2.read();
        pupil2.write();
        pupil2.study();
        pupil2.relax();
        System.out.println("----------------");

        pupil3.read();
        pupil3.write();
        pupil3.study();
        pupil3.relax();
        System.out.println("----------------");

        pupil4.read();
        pupil4.write();
        pupil4.study();
        pupil4.relax();
        System.out.println("----------------");

    }
}
