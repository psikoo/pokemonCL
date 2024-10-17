package com.pokemon;

public class Pokemon { // Utility class to retrieve pokemon information

    public static String pokemonNameTable(int gender, int pokemon) {
        //                      Male                                    Female                                 Enemy
        String nameArray[][] = {{"Bulbasaur", "Charmander", "Squirtle"},{"Chikorita", "Cyndaquil", "Totodile"},{"Pikachu", "Clefairy", "Magikarp"}};
        return nameArray[gender][pokemon];
    }

    public static int pokemonHPTable(int gender, int pokemon) {
        //                 Male          Female        Enemy
        int hpArray[][] = {{100, 90, 95},{90, 95, 100},{60, 50, 30}};
        return hpArray[gender][pokemon];
    }
}
