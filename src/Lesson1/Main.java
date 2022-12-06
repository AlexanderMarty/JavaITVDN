package Lesson1;

public class Main {
    private int anInt = 4;

    public Main() {
        anInt = 5;
    }

    public static void main(String[] args) {
        Main m = new Main();
        int anInt = 6;
        m.print(anInt);
    }

    public void print(int anInt) {
        System.out.println(anInt);
    }
}