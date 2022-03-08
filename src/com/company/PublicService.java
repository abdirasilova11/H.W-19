package com.company;

public interface PublicService{


     default void forGas(){
        System.out.println("Газ учун айына ... сом төлөшөт.");
    }


    default void forWater(){
        System.out.println("Жылуу суу жана муздак суу учун ... сом толошот");
    }


}
