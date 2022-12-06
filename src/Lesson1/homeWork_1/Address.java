package Lesson1.homeWork_1;

public class Address {
    int index;
    String country;
    String city;
    String street;
    int house;
    int apartment;

    protected Address(int index, String country, String city, String street, int house, int apartment){
        this.index = index;
        this.country = country;
        this.city = city;
        this.street = street;
        this.house = house;
        this.apartment = apartment;
}
}
