package Lesson3.example2;

public class Example {
    {
        System.out.println("In block 1");
    }

    static{
        System.out.println("In static block 1");
    }

    Example(){
        System.out.println("in constructor Example");
    }

    {
        System.out.println("In block 2");
    }

    public static void main(String[] args) {
        Example example = new Example();
        Example example1 = new Example();
    }
}
