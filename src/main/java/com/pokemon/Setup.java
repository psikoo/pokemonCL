package com.pokemon;

import java.util.Scanner;

public class Setup {

    private int cGender = 0;
    private boolean genderBool = false; 
    private int cPokemon = 0;
    private boolean pokemonBool = false;

    public Setup(App app) {
        Util.splashScreen();

        chooseGender();
        choosePokemon(cGender);
        app.setPlayer(new Player(cGender, cPokemon));

        Util.characterFinish("You choose " + app.getPlayer().getPokemonName() + ", it has " + app.getPlayer().getPokemonMaxHP() + " HP");
    }

    // Select gender
    private void chooseGender() {
        Scanner scanner = new Scanner(System.in);
        while (!genderBool) {
            Util.chooseGender();
            try {
                int gender = scanner.nextInt();
                if(gender != 0 && gender != 1) { chooseGender(); } 
                else if(gender == 0) {
                    genderBool = true;
                    cGender = 0;
                } else if(gender == 1) {
                    genderBool = true;
                    cGender = 1;
                }        
            } catch(Exception e) { chooseGender(); } 
        }
    }

    // Select pokemon
    private void choosePokemon(int gender) {
        Scanner scanner = new Scanner(System.in);
        while (!pokemonBool) {
            if(gender == 0) { Util.choosePokemonMale(); } 
            else if(gender == 1) { Util.choosePokemonFemale(); }
            try {
                int pokemon = scanner.nextInt();
                if(pokemon != 0 && pokemon != 1 && pokemon != 2) { choosePokemon(gender); } 
                else if(pokemon == 0) {
                    pokemonBool = true;
                    cPokemon = 0;
                } else if(pokemon == 1) {
                    pokemonBool = true;
                    cPokemon = 1;
                } else if(pokemon == 2) {
                    pokemonBool = true;
                    cPokemon = 2;
                }        
            } catch(Exception e) { choosePokemon(gender); }  
        }
    }
}
