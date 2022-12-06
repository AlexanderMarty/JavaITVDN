package Lesson5.Example2;

import java.util.ArrayList;

public class Marathon {
    public String name;

    private ArrayList<Runner> runners = new ArrayList<>();

    public Marathon(String name) {
        this.name = name;
    }

    public String printRunners(){
        StringBuilder sb = new StringBuilder();
        for (Runner r : runners){
           sb.append(r).append("\n");
        }
        return sb.toString();
    }

    public static void main(String[] args) {
        Marathon marathon1 = new Marathon("the first Marathon");

        Runner r1 = new Runner(1, "George", "Windsor");
        Runner r2 = new Runner(2, "George", "Windsor");
        Runner r3 = new Runner(3, "George", "Windsor");
        Runner r4 = new Runner(4, "George", "Windsor");
        Runner r5 = new Runner(5, "George", "Windsor");
        Runner r6 = new Runner(6, "George", "Windsor");

        marathon1.runners.add(r1);
        marathon1.runners.add(r2);
        marathon1.runners.add(r3);
        marathon1.runners.add(r4);
        marathon1.runners.add(r5);
        marathon1.runners.add(r6);

        System.out.println(marathon1.runners.get(0));

        System.out.println(marathon1.printRunners());
    }
}
