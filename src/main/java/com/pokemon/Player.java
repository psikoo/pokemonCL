package com.pokemon;

public class Player {

    public int gender;
    public int pokemon;
    public int pokemonHP;
    public int pokeballs = 20;
    public int potions = 5;
    
    private static int pokedexLength = 4;
    private static String[] pokedex = new String[pokedexLength];

    public Player() {
        this(0, 0);
    } public Player(int cGender, int cPokemon) {
        gender = cGender;
        pokemon = cPokemon;
        pokemonHP = Pokemon.pokemonHPTable(gender, pokemon);
        pokedex[0] = "0 - " + Pokemon.pokemonNameTable(gender, pokemon);
    }

    public void addToPokedex(int cGender, int cPokemon) {
        boolean found = false;
        for(int i = 0; (i < pokedexLength) && !found; i++) {
            if(pokedex[i] == null) {
                pokedex[i] = i+" - " + Pokemon.pokemonNameTable(cGender, cPokemon);
                found = true;
            }
        }
    }

    public static String getPokedex() {
        String pokedexString = "";
        for(int i = 0; i < pokedexLength; i++) {
            if(pokedex[i] == null) {
                pokedexString += "  > ? - ????\n";
            } else {
                pokedexString += "  > " + pokedex[i] + "\n";
            }
        }
        return pokedexString;
    }
}
