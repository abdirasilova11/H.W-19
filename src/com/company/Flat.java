package com.company;

public class Flat extends  Dormitory implements PublicService {
    public Flat(String[] family, String address) {
        super(family, address);
    }

    public Flat() {

    }

    public Flat(Person[] family, String address) {
    }


    @Override
    public void forGas() {
        System.out.println("Газ учун айына ... сом толошот.");
    }

    @Override
    public void forWater() {
        System.out.println("Муздак жана жылуу суу учун айына сом ... толошот.");

    }
    @Override
    public String toString(){
        return  "address:" + this.getAddress() + " " + getFamily();
    }

}
