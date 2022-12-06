package Lesson3.example3;

public class Main {
    public static void main(String[] args) {
        Derived instance = new Derived(1, 2);

        System.out.println(instance.baseNumber);
        System.out.println(instance.DerivedField);
    }
}
