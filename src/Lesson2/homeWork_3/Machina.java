package Lesson2.homeWork_3;

public class Machina {
    public int year;
    public double speed;
    public int weight;
    public String color;

    public Machina(int year) {
        this.year = year;
    }

    public Machina(int year, double speed) {
        this.year = year;
        this.speed = speed;
    }

    public Machina(int year, double speed, int weight) {
        this.year = year;
        this.speed = speed;
        this.weight = weight;
    }

    public Machina(int year, double speed, int weight, String color) {
        this.year = year;
        this.speed = speed;
        this.weight = weight;
        this.color = color;
    }

    public Machina() {
        this(1993, 123.5, 900);
    }
}
