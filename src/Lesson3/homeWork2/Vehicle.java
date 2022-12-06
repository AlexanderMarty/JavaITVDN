package Lesson3.homeWork2;

public class Vehicle {
    private int price;
    private int speed;
    private int year;

    public Vehicle(int price, int speed, int year) {
        this.price = price;
        this.speed = speed;
        this.year = year;
    }

    public void parameters(){

        System.out.println(price);
        System.out.println(speed);
        System.out.println(year);
    }
}
