package com.pokemon;

public class Pokemon {

    public static String pokemonNameTable(int gender, int pokemon) {
        String name = "";
        if(gender == 0) {
            switch(pokemon) {
                case 0:
                    name = "Bulbasaur";
                    break;
                case 1:
                    name = "Charmander";
                    break;
                case 2:
                    name = "Squirtle";
                    break;
                default:
                    name = "ERROR";
            }     
        } else if(gender == 1) {
            switch(pokemon) {
                case 0:
                    name = "Chikorita";
                    break;
                case 1:
                    name = "Cyndaquil";
                    break;
                case 2:
                    name = "Totodile";
                    break;
                default:
                    name = "ERROR";
            } 
        } else if(gender == 2) {
            switch(pokemon) {
                case 0:
                    name = "Pikachu";
                    break;
                case 1:
                    name = "Clefairy";
                    break;
                case 2:
                    name = "Magikarp";
                    break;
                default:
                    name = "ERROR";
            } 
        }
        return name;
    }

    public static int pokemonHPTable(int gender, int pokemon) {
        int hp = 0;
        if(gender == 0) {
            switch(pokemon) {
                case 0:
                    hp = 100;
                    break;
                case 1:
                    hp = 90;
                    break;
                case 2:
                    hp = 95;
                    break;
                default:
                    hp = 0;
            }     
        } else if(gender == 1) {
            switch(pokemon) {
                case 0:
                    hp = 90;
                    break;
                case 1:
                    hp = 95;
                    break;
                case 2:
                    hp = 100;
                    break;
                default:
                    hp = 0;
            } 
        } else if(gender == 2) {
            switch(pokemon) {
                case 0:
                    hp = 60;
                    break;
                case 1:
                    hp = 50;
                    break;
                case 2:
                    hp = 30;
                    break;
                default:
                    hp = 0;
            } 
        }
        return hp;
    }
}
