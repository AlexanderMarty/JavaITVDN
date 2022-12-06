package Lesson2.Animal;

public class Main {
    public static void main(String[] args) {
        Cat c = new Cat("Tom", 4);

        c.setName("Tom");
        c.setAge(5);

        System.out.println(c.getAge() + " " + c.getName());
    }
}
