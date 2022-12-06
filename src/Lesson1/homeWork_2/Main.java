package Lesson1.homeWork_2;

import java.util.Scanner;



public class Main{
    public static void main(String[] args) {
        double side1;
        double side2;

        Scanner in1 = new Scanner(System.in);
        System.out.print("Input side1: ");
        side1 = in1.nextInt();

        Scanner in2 = new Scanner(System.in);
        System.out.print("Input side2: ");
        side2 = in2.nextInt();

        System.out.println(areaCalculator(side1, side2));
        System.out.println(perimeterCalculator(side1, side2));

    }


        private static double areaCalculator ( double side1, double side2){
        double area;
        area = side1 * side2;
        return area;
    }

        private static double perimeterCalculator ( double side1, double side2){
        double perimeter;
        perimeter = side1 * 2 + side2 * 2;
        return perimeter;
    }

}