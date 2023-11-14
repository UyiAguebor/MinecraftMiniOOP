package com.sparta.ua.oop;

public class Stone extends Block{

    public Stone(String name, String colour, String material, int durability) {
        super(name, colour, material, durability);
    }


    @Override
    public void define(String Hardness) {
        System.out.println("Stone is a " + Hardness + " Material");
    }
}
