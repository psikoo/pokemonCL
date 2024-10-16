package com.pokemon;

import java.util.Scanner;

public class Util {

    public static void clearCL() {
        System.out.print("\033c\033[2J");
        System.out.flush();
    }

    public static void waitForEnter() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("║                                                                                         ║");
        System.out.println("║   > Press enter to continue ...                                                         ║");
        System.out.println("║                                                                                         ║");
        System.out.println("╚═════════════════════════════════════════════════════════════════════════════════════════╝");
        scanner.nextLine();
    }

    public static void input() {
        System.out.println("║                                                                                         ║");
        System.out.println("║   > Select one to continue ...                                                          ║");
        System.out.println("║                                                                                         ║");
        System.out.println("╚═════════════════════════════════════════════════════════════════════════════════════════╝");
    }

    public static void banner() {
        Util.clearCL();
        System.out.println("╔═════════════════════════════════════════════════════════════════════════════════════════╗");
        System.out.println("║                                                                                         ║");
        System.out.println("║   ██████╗  ██████╗ ██╗  ██╗███████╗███╗   ███╗ ██████╗ ███╗   ██╗     ██████╗██╗        ║"); 
        System.out.println("║   ██╔══██╗██╔═══██╗██║ ██╔╝██╔════╝████╗ ████║██╔═══██╗████╗  ██║    ██╔════╝██║        ║"); 
        System.out.println("║   ██████╔╝██║   ██║█████╔╝ █████╗  ██╔████╔██║██║   ██║██╔██╗ ██║    ██║     ██║        ║"); 
        System.out.println("║   ██╔═══╝ ██║   ██║██╔═██╗ ██╔══╝  ██║╚██╔╝██║██║   ██║██║╚██╗██║    ██║     ██║        ║"); 
        System.out.println("║   ██║     ╚██████╔╝██║  ██╗███████╗██║ ╚═╝ ██║╚██████╔╝██║ ╚████║    ╚██████╗███████╗   ║"); 
        System.out.println("║   ╚═╝      ╚═════╝ ╚═╝  ╚═╝╚══════╝╚═╝     ╚═╝ ╚═════╝ ╚═╝  ╚═══╝     ╚═════╝╚══════╝   ║"); 
        System.out.println("║                                                                                  v1.0   ║");
        System.out.println("║                                                                                         ║");
    }

    public static void bannerAlt() {
        Util.clearCL();
        System.out.println("╔═════════════════════════════════════════════════════════════════════════════════════════╗");
        System.out.println("║                                                                                         ║");
        System.out.println("║   ██████╗  ██████╗ ██╗  ██╗███████╗███╗   ███╗ ██████╗ ███╗   ██╗     ██████╗██╗        ║"); 
        System.out.println("║   ██╔══██╗██╔═══██╗██║ ██╔╝██╔════╝████╗ ████║██╔═══██╗████╗  ██║    ██╔════╝██║        ║"); 
        System.out.println("║   ██████╔╝██║   ██║█████╔╝ █████╗  ██╔████╔██║██║   ██║██╔██╗ ██║    ██║     ██║        ║"); 
        System.out.println("║   ██╔═══╝ ██║   ██║██╔═██╗ ██╔══╝  ██║╚██╔╝██║██║   ██║██║╚██╗██║    ██║     ██║        ║"); 
        System.out.println("║   ██║     ╚██████╔╝██║  ██╗███████╗██║ ╚═╝ ██║╚██████╔╝██║ ╚████║    ╚██████╗███████╗   ║"); 
        System.out.println("║   ╚═╝      ╚═════╝ ╚═╝  ╚═╝╚══════╝╚═╝     ╚═╝ ╚═════╝ ╚═╝  ╚═══╝     ╚═════╝╚══════╝   ║"); 
        System.out.println("║                                                                                  v1.0   ║");
        System.out.println("╚                                                                                         ╝");
    }

    public static void splashScreen() {
        Util.banner();
        System.out.println("║   >──────────────────────[ Welcome to Pokemon Command & Line ]──────────────────────<   ║");
        System.out.println("║                                                                                         ║");
        System.out.println("║         This project is a small command line recreation of pokemon game formula         ║");
        System.out.println("║                                                                                         ║");
        System.out.println("║         What can you do in this game?                                                   ║");
        System.out.println("║          1. Choose your gender and starter pokemon                                      ║");
        System.out.println("║          2. Battle 3 different pokemons and have the chance to capture them             ║");
        System.out.println("║          3. Check your pokedex                                                          ║");
        Util.waitForEnter();
    }

    public static void chooseGender() {
        Util.banner();
        System.out.println("║   >─────────────────────────────[ Character  Creation ]─────────────────────────────<   ║");
        System.out.println("║                                                                                         ║");
        System.out.println("║         First start by selecting your gender (input 0 or 1)                             ║");
        System.out.println("║                                                                                         ║");
        System.out.println("║           > 0 - Male                                                                    ║");
        System.out.println("║           > 1 - Female                                                                  ║");
        System.out.println("║                                                                                         ║");
        System.out.println("║                                                                                         ║");
        Util.input();
    }

    public static void choosePokemonMale() {
        Util.banner();
        System.out.println("║   >─────────────────────────────[ Character  Creation ]─────────────────────────────<   ║");
        System.out.println("║                                                                                         ║");
        System.out.println("║         Now select your starter Pokemon (input 0, 1 or 2)                               ║");
        System.out.println("║                                                                                         ║");
        System.out.println("║           > 0 - Bulbasaur                                                               ║");
        System.out.println("║           > 1 - Charmander                                                              ║");
        System.out.println("║           > 2 - Squirtle                                                                ║");
        System.out.println("║                                                                                         ║");
        Util.input();
    }

    public static void choosePokemonFemale() {
        Util.banner();
        System.out.println("║   >─────────────────────────────[ Character  Creation ]─────────────────────────────<   ║");
        System.out.println("║                                                                                         ║");
        System.out.println("║         Now select your starter Pokemon (input 0, 1 or 2)                               ║");
        System.out.println("║                                                                                         ║");
        System.out.println("║           > 0 - Chikorita                                                               ║");
        System.out.println("║           > 1 - Cyndaquil                                                               ║");
        System.out.println("║           > 2 - Totodile                                                                ║");
        System.out.println("║                                                                                         ║");
        Util.input();
    }

    public static void characterFinish(String pokemonInfo) {
        Util.banner();
        System.out.println("║   >─────────────────────────────[ Character  Creation ]─────────────────────────────<   ║");
        System.out.println("║                                                                                         ║");
        System.out.println("╚                                                                                         ╝");
        System.out.println("          "+pokemonInfo);
        System.out.println("╔                                                                                         ╗");
        System.out.println("║                                                                                         ║");
        System.out.println("║                                                                                         ║");
        System.out.println("║                                                                                         ║");
        Util.waitForEnter();
    }

    public static void actionMenu() {
        Util.banner();
        System.out.println("║   >─────────────────────────────────[ Action Menu ]─────────────────────────────────<   ║");
        System.out.println("║                                                                                         ║");
        System.out.println("║         What do you want to do now (input 0, 1, 2 or 3)                                 ║");
        System.out.println("║           > 0 - Go to Green Forest                                                      ║");
        System.out.println("║           > 1 - Go to Mount Moon                                                        ║");
        System.out.println("║           > 2 - Go to Lake of Fury                                                      ║");
        System.out.println("║           > 3 - Check Pokedex                                                           ║");
        System.out.println("║                                                                                         ║");
        Util.input();
    }

    public static void battlePopup0() {
        Util.banner();
        System.out.println("║   >─────────────────────────────────[ Battle Menu ]─────────────────────────────────<   ║");
        System.out.println("║                                                                                         ║");
        System.out.println("║         You go to Green Forest                                                          ║");
        System.out.println("║         A wild Pikachu attacks you!                                                     ║");
        System.out.println("║                                                                                         ║");
        System.out.println("║                                                                                         ║");
        System.out.println("║                                                                                         ║");
        System.out.println("║                                                                                         ║");
        Util.waitForEnter();
    }

    public static void battlePopup1() {
        Util.banner();
        System.out.println("║   >─────────────────────────────────[ Battle Menu ]─────────────────────────────────<   ║");
        System.out.println("║                                                                                         ║");
        System.out.println("║         You go to Mount Moon                                                            ║");
        System.out.println("║         A wild Clefairy attacks you!                                                    ║");
        System.out.println("║                                                                                         ║");
        System.out.println("║                                                                                         ║");
        System.out.println("║                                                                                         ║");
        System.out.println("║                                                                                         ║");
        Util.waitForEnter();
    }
    
    public static void battlePopup2() {
        Util.banner();
        System.out.println("║   >─────────────────────────────────[ Battle Menu ]─────────────────────────────────<   ║");
        System.out.println("║                                                                                         ║");
        System.out.println("║         You go to Lake of Fury                                                          ║");
        System.out.println("║         A wild Magikarp attacks you!                                                    ║");
        System.out.println("║                                                                                         ║");
        System.out.println("║                                                                                         ║");
        System.out.println("║                                                                                         ║");
        System.out.println("║                                                                                         ║");
        Util.waitForEnter();
    }

    public static void pokedex(String pokedexInfo) {
        Util.banner();
        System.out.println("║   >───────────────────────────────────[ Pokedex ]───────────────────────────────────<   ║");
        System.out.println("║         You check your Pokedex                                                          ║");
        System.out.println("╚                                                                                         ╝");
        System.out.println(pokedexInfo);
        System.out.println("╔                                                                                         ╗");
        Util.waitForEnter();
    }

    public static void battleMenu(int potions, int pokeballs, String pokemonInfo) {
        Util.bannerAlt();
        System.out.println("    >─────[ Battle Menu ]──────────<   "+pokemonInfo);
        System.out.println("╔                                                                                         ╗");
        System.out.println("║         What do you want to do (input 0, 1, 2 or 3)                                     ║");
        System.out.println("║           > 0 - Attack                                                                  ║");
        System.out.println("║           > 1 - Heal -"+potions+"                                                                 ║");
        System.out.println("║           > 2 - Capture -"+pokeballs+"                                                             ║");
        System.out.println("║           > 3 - Scape                                                                   ║");
        System.out.println("║                                                                                         ║");
        Util.input();
    }
        
    public static void attackMenu0(String enemyName, int enemyHP) {
        Util.banner();
        System.out.println("║   >─────────────────────────────────[ 0 -  Attack ]─────────────────────────────────<   ║");
        System.out.println("║                                                                                         ║");
        System.out.println("╚                                                                                         ╝");
        System.out.println("          You damage "+enemyName+" for 10HP, it now has "+enemyHP+"HP");
    }

    public static void attackMenu1(String enemyName, int playerHP) {
        System.out.println("          "+enemyName+" attacks your pokemon, your pokemon now has "+playerHP+"HP");
        System.out.println("╔                                                                                         ╗");
        System.out.println("║                                                                                         ║");
        System.out.println("║                                                                                         ║");
        Util.waitForEnter();
    }

    public static void attackMenu2(String enemyName, String playerName) {
        System.out.println("          "+enemyName+" killed your "+playerName);
        System.out.println("╔                                                                                         ╗");
        System.out.println("║                                                                                         ║");
        System.out.println("║                                                                                         ║");
        System.out.println("║                                                                                         ║");
        System.out.println("║                                                                                         ║");
        System.out.println("║                                                                                         ║");
        System.out.println("║                                                                                         ║");
        Util.waitForEnter();
    }

    public static void attackMenu3(String playerName, String enemyName) {
        Util.bannerAlt();
        System.out.println("          "+playerName+" killed "+enemyName);
        System.out.println("╔                                                                                         ╗");
        System.out.println("║                                                                                         ║");
        System.out.println("║                                                                                         ║");
        System.out.println("║                                                                                         ║");
        System.out.println("║                                                                                         ║");
        System.out.println("║                                                                                         ║");
        System.out.println("║                                                                                         ║");
        Util.waitForEnter();
    }

    public static void healMenu0() {
        Util.banner();
        System.out.println("║   >──────────────────────────────────[ 1 -  Heal ]──────────────────────────────────<   ║");
        System.out.println("║                                                                                         ║");
        System.out.println("║         You heal your pokemon for 25HP                                                  ║");
        System.out.println("║                                                                                         ║");
        System.out.println("║                                                                                         ║");
        System.out.println("║                                                                                         ║");
        System.out.println("║                                                                                         ║");
        System.out.println("║                                                                                         ║");
        Util.waitForEnter();
    }

    public static void healMenu1() {
        Util.banner();
        System.out.println("║   >──────────────────────────────────[ 1 -  Heal ]──────────────────────────────────<   ║");
        System.out.println("║                                                                                         ║");
        System.out.println("║         Your pokemon has to much HP to heal                                             ║");
        System.out.println("║                                                                                         ║");
        System.out.println("║                                                                                         ║");
        System.out.println("║                                                                                         ║");
        System.out.println("║                                                                                         ║");
        System.out.println("║                                                                                         ║");
        Util.waitForEnter();
    }

    public static void captureMenu0() {
        Util.banner();
        System.out.println("║   >─────────────────────────────────[ 2 - Capture ]─────────────────────────────────<   ║");
        System.out.println("║                                                                                         ║");
        System.out.println("║         You throw a pokeball and capture the Pokemon                                    ║");
        System.out.println("║                                                                                         ║");
        System.out.println("║                                                                                         ║");
        System.out.println("║                                                                                         ║");
        System.out.println("║                                                                                         ║");
        System.out.println("║                                                                                         ║");
        Util.waitForEnter();
    }

    public static void captureMenu1() {
        Util.banner();
        System.out.println("║   >─────────────────────────────────[ 2 - Capture ]─────────────────────────────────<   ║");
        System.out.println("║                                                                                         ║");
        System.out.println("║         You throw a pokeball but the Pokemon scapes (it has too much HP)                ║");
        System.out.println("║                                                                                         ║");
        System.out.println("║                                                                                         ║");
        System.out.println("║                                                                                         ║");
        System.out.println("║                                                                                         ║");
        System.out.println("║                                                                                         ║");
        Util.waitForEnter();
    }

    public static void scapeMenu() {
        Util.banner();
        System.out.println("║   >──────────────────────────────────[ 3 - Scape ]──────────────────────────────────<   ║");
        System.out.println("║                                                                                         ║");
        System.out.println("║         You manage to scape                                                             ║");
        System.out.println("║                                                                                         ║");
        System.out.println("║                                                                                         ║");
        System.out.println("║                                                                                         ║");
        System.out.println("║                                                                                         ║");
        System.out.println("║                                                                                         ║");
        Util.waitForEnter();
    }

    public static void endScreen(String reason) {
        Scanner scanner = new Scanner(System.in);
        Util.banner();
        System.out.println("║   >─────────────────────────────────────[ End ]─────────────────────────────────────<   ║");
        System.out.println("║                                                                                         ║");
        System.out.println("╚                                                                                         ╝");
        System.out.println("          "+reason);
        System.out.println("╔                                                                                         ╗");
        System.out.println("║                                                                                         ║");
        System.out.println("║                                                                                         ║");
        System.out.println("║                                                                                         ║");
        System.out.println("║                                                                                         ║");
        System.out.println("║   > Press enter to close the program ...                                                ║");
        System.out.println("║                                                                                         ║");
        System.out.println("╚═════════════════════════════════════════════════════════════════════════════════════════╝");
        scanner.nextLine();
    }
}
