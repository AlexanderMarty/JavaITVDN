package Lesson5.Example1;

import java.util.Arrays;

public class Example {
    public static void main(String[] args) {
        int [] arr = {2, 12, 3, 465, 166, 377};
        int [] arr2 = {56, 78, 33};

        Arrays.sort(arr);
        System.out.println(arr);

        System.out.println(Arrays.toString(arr));

        System.out.println(Arrays.binarySearch(arr, 12));

        System.out.println(Arrays.equals(arr, arr2));

        Arrays.fill(arr, 12);

        System.out.println(Arrays.toString(arr));
    }
}
