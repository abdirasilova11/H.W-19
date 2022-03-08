package com.company;

public class Hotel extends  Dormitory implements Rent{
    public Hotel(String[] family, String address) {
        super(family, address);
    }

    public Hotel() {
    }

    public Hotel(Person[] family, String address) {
    }

    @Override
    public void rentForHotel() {
        System.out.println("Гостиницада жашагандар суткасына ... сом толошот.");
    }

}
