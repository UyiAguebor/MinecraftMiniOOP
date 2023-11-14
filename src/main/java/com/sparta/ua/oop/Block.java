package com.sparta.ua.oop;

public abstract class Block {
    private String name;
    private String colour;
    private String material;
    private int durability;

    public Block(String name, String colour, String material, int durability) {
        this.name = name;
        this.colour = colour;
        this.material = material;
        this.durability = durability;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getColour() {
        return colour;
    }

    public void setColour(String colour) {
        this.colour = colour;
    }

    public String getMaterial() {
        return material;
    }

    public void setMaterial(String material) {
        this.material = material;
    }

    public int getDurability() {
        return durability;
    }

    public void setDurability(int durability) {
        this.durability = durability;
    }

    public void define(){
        System.out.println("This is a block");
    }

    @Override
    public String toString() {
        return "Block{" +
                "name='" + name + '\'' +
                ", colour='" + colour + '\'' +
                ", material='" + material + '\'' +
                ", durability=" + durability +
                '}';
    }

    public abstract void define(String Hardness);
}
