package Lesson3.homeWork2;

public class Ship extends Vehicle{
    private String port;
    private int passengers;

    public Ship(int price, int speed, int year, String port, int passengers) {
        super(price, speed, year);
        this.port = port;
        this.passengers = passengers;
    }

    @Override
    public void parameters() {
        super.parameters();
        System.out.println(port);
        System.out.println(passengers);
    }
}
