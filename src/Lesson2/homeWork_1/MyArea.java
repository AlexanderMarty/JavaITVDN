package Lesson2.homeWork_1;

public class MyArea {
    static final double PI = 3.14;

    public MyArea(double radius) {
        this.radius = radius;
    }


    public void setRadius(double radius) {
        this.radius = radius;
    }

    double radius;

    public static double areaOfCircle(double radius){
        double area = PI *(radius * radius);

        return area;

    }
}
