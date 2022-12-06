package Lesson5.Example1;

import java.util.ArrayList;

public class Example3 {
    public static void main(String[] args) {
        ArrayList<Integer> arrayList = new ArrayList<>();
        for (int i = 0; i < 15; i++){
            arrayList.add(i);
        }
        for(Integer temp : arrayList){
            System.out.println(temp);
        }

//
//        ArrayList<Integer> arrayList = new ArrayList<>();
//
//        arrayList.add(3);
//        arrayList.add(5);
//        arrayList.add(7);
//
//        //с помощью итератора можем реремещаться по списку
//        Iterator<Integer> iterator = arrayList.iterator();
//
//        //спрашиваем, есть ли  следующий элемент в списке. Если true - будет реализовано тело цикла
//        while (iterator.hasNext()){
//            //переходим к следующему элементу в списке и выводим его
//            Integer integer = iterator.next();
//            System.out.println(integer);
//        }
//
//        System.out.println("------------------------");
//
//        //то же самое действие, но  через оптимизированный итератор под списки
//        ListIterator<Integer> listIterator = arrayList.listIterator();
//
//        while (listIterator.hasNext()){
//            Integer integer = listIterator.next();
//            System.out.println(integer);
//        }
    }
}
