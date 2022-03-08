package com.company;

public class Person {
     String name;
     int year;


    public Person(String name, int year) {
        this.name = name;
        this.year = year;
    }

    public Person(){
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", year=" + year +
                '}';
    }
}
