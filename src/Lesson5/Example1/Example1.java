package Lesson5.Example1;

import java.util.ArrayList;

public class Example1 {
    public static void main(String[] args) {
        ArrayList<String> arrayList = new ArrayList<>();

        arrayList.add("Hello");
        arrayList.add("student");
        arrayList.add("would you");

        System.out.println(arrayList);

        //добавление по индексу

        arrayList.add(0, "teacher");

        //удаление по индексу

        arrayList.remove(1);

        //удаление по значению

        arrayList.remove("would you");

        System.out.println(arrayList);
    }
}
