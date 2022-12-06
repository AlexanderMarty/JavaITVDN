package Lesson3.animal;

public class Main {
    public static void main(String[] args) {
        Cat cat1 = new Cat(5, "Marcel", 6, "Sphynx");
        Cat cat2 = new Cat(3, "Barsik", 6, "Maine-Coon");

        System.out.println(cat1.age + " " + cat1.name + " " + cat1.getWeight() + " " + cat1.getBrade());
        System.out.println(cat2.age + " " + cat2.name + " " + cat2.getWeight() + " " + cat2.getBrade());
    }
}
