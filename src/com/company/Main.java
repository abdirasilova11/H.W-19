package com.company;

public class Main {

    public static void main(String[] args) {
        

        Person person  =  new Person("Iskhak",2000);
        Person person1 =  new Person("Aizirek", 1995);
        Person person3 =  new Person("Aizhamal", 1989);
        Person person4 =  new Person("Akmaral", 2007);
        Person person5 =  new Person("Iskender", 1990);
        Person[] family = {person,person1, person3, person4, person5};

    Flat flat =  new Flat(family,"Microraion Vostok-5");
        flat.forGas();
        flat.forWater();
        System.out.println(flat);
        System.out.println("*****************************************");
        Person person0  =  new Person("Iskhak",2000);
        Person person11 =  new Person("Aizirek", 1995);
        Person person33 =  new Person("Aizhamal", 1989);

        Person[] family1 = {person,person0, person33, person11};


        Hotel hotel = new Hotel(family1, "Akhunbaeva 117");
        hotel.rentForHotel();
        System.out.println(hotel);

        System.out.println("*****************************************");
        Dormitory dormitory = new Dormitory();
        dormitory.rentForDormitory();

    }
}

