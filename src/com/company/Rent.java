package com.company;

public interface Rent {


    default void rentForHotel(){
        System.out.println("Гостиницада жашагандар суткасына ... сом толошот.");
    }


   default   void rentForDormitory(){

     }


}
