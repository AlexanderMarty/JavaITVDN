package Lesson1.homeWork_1;

public class Main {
    public static void main(String[] args) {
        Address66 address = new Address66();

        address.setIndex(4201);
        address.setCountry("Brazil");
        address.setCity("Rio");
        address.setStreet("Independent square");
        address.setHouse(13);
        address.setApartment(13);

        System.out.println(address.getIndex());
        System.out.println(address.getCountry());
        System.out.println(address.getCity());
        System.out.println(address.getStreet());
        System.out.println(address.getHouse());
        System.out.println(address.getApartment());



    }
}
