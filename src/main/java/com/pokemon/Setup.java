package com.pokemon;

import java.util.Scanner;

public class Setup {
    public Setup(App app) {
        Util.banner();

        int cGender = chooseGender();
        int cPokemon = choosePokemon(cGender);
        app.setPlayer(new Player(cGender, cPokemon));

        Util.clearCL();
        System.out.println("> You choose " + app.getPlayer().getPokemonName() + ", it has " + app.getPlayer().getPokemonMaxHP() + " hp");
        Util.waitForEnter();
    }

    // Select gender
    private int chooseGender() {
        Scanner scanner = new Scanner(System.in);
        int cGender = 0;
        boolean genderBool = false;
        while (!genderBool) {
            Util.clearCL();
            System.out.println("> First lets start choosing your gender:");
            System.out.println("  > 0 - Male");
            System.out.println("  > 1 - Female");
        
            try {
                int gender = scanner.nextInt();
                if(gender != 0 && gender != 1) {
                    Util.clearCL(); 
                    chooseGender();
                } else if(gender == 0) {
                    genderBool = true;
                    cGender = 0;
                } else if(gender == 1) {
                    genderBool = true;
                    cGender = 1;
                }        
            } catch(Exception e) {
            Util.clearCL(); 
            chooseGender();
            } 
        }
        return cGender;
    }

    // Select pokemon
    private int choosePokemon(int gender) {
        Scanner scanner = new Scanner(System.in);
        int cPokemon = 0;
        boolean pokemonBool = false;
        while (!pokemonBool) {
            Util.clearCL(); 
            System.out.println("> Now you need to choose your first pokemon:");

            if(gender == 0) {
                System.out.println("  > 0 - Bulbasaur");
                System.out.println("  > 1 - Charmander");
                System.out.println("  > 2 - Squirtle");
            } else if(gender == 1) {
                System.out.println("  > 0 - Chikorita");
                System.out.println("  > 1 - Cyndaquil ");
                System.out.println("  > 2 - Totodile");
            }

            try {
                int pokemon = scanner.nextInt();
                if(pokemon != 0 && pokemon != 1 && pokemon != 2) {
                    Util.clearCL(); 
                    choosePokemon(gender);
                } else if(pokemon == 0) {
                    pokemonBool = true;
                    cPokemon = 0;
                } else if(pokemon == 1) {
                    pokemonBool = true;
                    cPokemon = 1;
                } else if(pokemon == 2) {
                    pokemonBool = true;
                    cPokemon = 2;
                }        
            } catch(Exception e) {
                Util.clearCL(); 
                choosePokemon(gender);
            }  
        }
        return cPokemon;
    }
}
