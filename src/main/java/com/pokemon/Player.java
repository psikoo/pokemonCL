package com.pokemon;

public class Player {

    private int gender;
    private int pokemon;
    private int pokemonHP;
    private int pokeballs = 20;
    private int potions = 5;
    private int pokedexLength = 4;
    private String[] pokedex = new String[pokedexLength];

    public int getGender() { return gender; }
    public int getPokemon() { return pokemon; }
    public int getPokemonHP() { return pokemonHP; }
    public int getPokeballs() { return pokeballs; }
    public int getPotions() { return potions; }

    public String getPokemonName() { return Pokemon.pokemonNameTable(getGender(), getPokemon()); }
    public int getPokemonMaxHP() { return Pokemon.pokemonHPTable(getGender(), getPokemon()); }

    public void setPokemonHP(int pokemonHP) { this.pokemonHP = pokemonHP; }
    public void setPokeballs(int pokeballs) { this.pokeballs = pokeballs; }
    public void setPotions(int potions) { this.potions = potions; }

    public String getPokedex() { // Returns a formatted string containing all entires of pokedex[]
        String pokedexString = "";
        String newLine = "";
        for(int i = 0; i < pokedexLength; i++) {
            if(i == 1) { newLine = "\n"; }
            if(pokedex[i] == null) { pokedexString += newLine + "          > ? - ????"; } 
            else { pokedexString += newLine + "          > " + pokedex[i]; }
        }
        return pokedexString;
    }

    public void setPokedex(int cGender, int cPokemon) { // Adds an entry to the first empty spot of pokedex[]
        boolean found = false;
        for(int i = 0; (i < pokedexLength) && !found; i++) {
            if(pokedex[i] == null) {
                pokedex[i] = i+" - " + Pokemon.pokemonNameTable(cGender, cPokemon);
                found = true;
            }
        }
    }

    public Player() {
        this(0, 0);
    } public Player(int gender, int pokemon) {
        this.gender = gender;
        this.pokemon = pokemon;
        pokemonHP = Pokemon.pokemonHPTable(gender, pokemon);
        pokedex[0] = "0 - " + Pokemon.pokemonNameTable(gender, pokemon);
    }
}
