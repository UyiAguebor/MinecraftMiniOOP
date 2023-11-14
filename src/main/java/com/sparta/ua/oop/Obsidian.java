package com.sparta.ua.oop;

public class Obsidian extends Block{

    public Obsidian(String name, String colour, String material, int durability) {
        super(name, colour, material, durability);
    }

    @Override
    public void define(String Hardness) {
        System.out.println("Obsidian This is a " + Hardness + " Material");
    }
}
