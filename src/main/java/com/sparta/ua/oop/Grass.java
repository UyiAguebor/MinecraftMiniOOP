package com.sparta.ua.oop;

public class Grass extends Block {

    public Grass(String name, String colour, String material, int durability) {
        super(name, colour, material, durability);
    }

    @Override
    public void define(String Hardness) {
        System.out.println("Dirt is a " + Hardness + " Material");
    }
}
