package Lesson1.homeWork_1;

public class Main2 {
    public static void main(String[] args) {
        Address address1 = new Address(4201, "Brazil", "Rio", "Independent square", 13, 1312);

        System.out.println(address1.index);
        System.out.println(address1.country);
        System.out.println(address1.city);
        System.out.println(address1.street);
        System.out.println(address1.house);
        System.out.println(address1.apartment);
    }
}
