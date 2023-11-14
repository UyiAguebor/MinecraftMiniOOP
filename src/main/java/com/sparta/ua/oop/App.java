package com.sparta.ua.oop;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args ) {
        Obsidian blackObsidian = new Obsidian("Black Obsidian", "Black", "Obsidian",1000);
        Grass dryGrass = new Grass("Dry Grass", "Dark Green", "Dirt",1000);
        Stone cobbleStone = new Stone("Cobble Stone", "Grey", "Stone",1000);

        blackObsidian.define("Hard");
        dryGrass.define("Soft");
        cobbleStone.define("Hard");
    }
}
