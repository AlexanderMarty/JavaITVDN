package Lesson5.Example1;

import java.util.ArrayList;

public class Example2 {
    public static void main(String[] args) {
        ArrayList<String> arrayList= new ArrayList<>();

        arrayList.add("name");
        arrayList.add("last name");

        //задаем вместимость списка
        arrayList.ensureCapacity(30);

        //размер списка на текущий момент
        System.out.println(arrayList.size());

        //получение элементта по индексу
        System.out.println(arrayList.get(1));

        //Ошибка indexOutOfBoundException
        //System.out.println(arrayList.get(2));

        //получаем индекс объекта
        System.out.println(arrayList.indexOf("name"));


        System.out.println(arrayList.lastIndexOf("last name"));
    }
}
