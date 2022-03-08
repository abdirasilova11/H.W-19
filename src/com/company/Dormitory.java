package com.company;

import java.util.Arrays;

public class Dormitory implements Rent {
private String [] family;
 private String address;

    public Dormitory(String[] family, String address) {
        this.family = family;
        this.address = address;
    }
    public Dormitory(){
    }

    public String[] getFamily() {
        return family;
    }

    public void setFamily(String[] family) {
        this.family = family;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    @Override
    public void rentForDormitory() {
        System.out.println("Общежитиеде жашагандар айына ... сом толошот.");
    }

    @Override
    public String toString() {
        return "Dormitory{" +
                "family=" + Arrays.toString(family) +
                ", address='" + address + '\'' +
                '}';
    }
}