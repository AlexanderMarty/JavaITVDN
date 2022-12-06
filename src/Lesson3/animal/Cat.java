package Lesson3.animal;

public class Cat extends Animal{
    int age;
    String name;

    public Cat(int age, String name, int weight, String brade){
        super(weight, brade);
        this.age = age;
        this.name = name;
    }
}
