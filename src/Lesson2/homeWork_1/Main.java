package Lesson2.homeWork_1;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {


        Scanner in = new Scanner(System.in);
        System.out.print("Input a radius of the circle: ");
        double rad = in.nextDouble();

        MyArea circle = new MyArea(rad);

        System.out.println(circle.areaOfCircle(rad));
    }
}
