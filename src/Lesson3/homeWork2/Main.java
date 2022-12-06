package Lesson3.homeWork2;

public class Main {
    public static void main(String[] args) {
        Vehicle car1 = new Car(25000, 140, 2015);
        Vehicle ship1 = new Ship(1250000, 25, 1999, "Norfolk", 525);
        Vehicle plane1 = new Plane(5899000, 750, 2010, 14000, 4);

        car1.parameters();
        System.out.println("==============================");
        ship1.parameters();
        System.out.println("==============================");
        plane1.parameters();
        System.out.println("==============================");

    }
}
