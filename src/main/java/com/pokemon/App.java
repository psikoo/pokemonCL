package com.pokemon;

import java.util.Scanner;

public class App {
    private static Player player;

    private static boolean end = false;
    private static String endString = "";
    private static int captureCount = 0;
    private static int killCount = 0;

    private static int cGender = 0;
    private static int cPokemon = 0;
    private static int cAction = 0;
    private static boolean genderBool = false;
    private static boolean pokemonBool = false;
    private static boolean actionBool = false;
    private static boolean battleBool = false;


    // TODO add splash screen
    // TODO make preatty
    // TODO split up
    // TODO readme
    // TODO inmplement build sys to a file with a bat

    // Main function
    public App() {
        startMenu();
        player = new Player(cGender, cPokemon);
        while (!end) { // Game loop
            execAction(action());
            if(captureCount >= 3) { 
                endString = "You WON - you captured 3 pokemons";
                end = true;
            } else if(killCount >= 5) {
                endString = "You WON - you killed 5 pokemons";
                end = true;
            }
        }
        System.out.print("\033[H\033[2J");
        System.out.println("> " + endString);
    }

    // Select gender and pokemon
    private static void startMenu() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("\033[H\033[2J");
        System.out.println("> Welcome to this incredible Pokemon adventure.");
        System.out.println("> Press enter to start ...");
        scanner.nextLine();

        chooseGender();
        choosePokemon(cGender);

        System.out.print("\033[H\033[2J");
        System.out.println("> You choose " + Pokemon.pokemonNameTable(cGender, cPokemon) + ", it has " + Pokemon.pokemonHPTable(cGender, cPokemon) + " hp");
        System.out.println("> Press enter to continue ...");
        scanner.nextLine();
    }

    // Select gender
    private static int chooseGender() {
        Scanner scanner = new Scanner(System.in);
        while (!genderBool) {
            System.out.print("\033[H\033[2J");
            System.out.println("> First lets start choosing your gender:");
            System.out.println("  > 0 - Male");
            System.out.println("  > 1 - Female");
        
            try {
                int gender = scanner.nextInt();
                if(gender != 0 && gender != 1) {
                    System.out.print("\033[H\033[2J"); 
                    chooseGender();
                } else if(gender == 0) {
                    genderBool = true;
                    cGender = 0;
                } else if(gender == 1) {
                    genderBool = true;
                    cGender = 1;
                }        
            } catch(Exception e) {
            System.out.print("\033[H\033[2J"); 
            chooseGender();
            } 
        }
        return cGender;
    }

    // Select pokemon
    private static int choosePokemon(int gender) {
        Scanner scanner = new Scanner(System.in);
        while (!pokemonBool) {
            System.out.print("\033[H\033[2J"); 
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
                    System.out.print("\033[H\033[2J"); 
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
                System.out.print("\033[H\033[2J"); 
                choosePokemon(gender);
            }  
        }
        return cPokemon;
    }

    // Execute an action depending on the given input
    private void execAction(int action) {
        Scanner scanner = new Scanner(System.in);
        if(action == 0) {
            System.out.print("\033[H\033[2J");
            System.out.println("> You go toGreen Forest");
            System.out.println("> A wild Pikachu attacks you!");
            System.out.println("> Press enter to continue ...");
            scanner.nextLine();
            battle(0);
        } else if(action == 1) {
            System.out.print("\033[H\033[2J");
            System.out.println("> You go Mount Moon");
            System.out.println("> A wild Clefairy attacks you!");
            System.out.println("> Press enter to continue ...");
            scanner.nextLine();
            battle(1);
        } else if(action == 2) {
            System.out.print("\033[H\033[2J");
            System.out.println("> You go to Lake of Fury");
            System.out.println("> A wild Magikarp attacks you!");
            System.out.println("> Press enter to continue ...");
            scanner.nextLine();
            battle(2);
        } else if(action == 3) {
            System.out.print("\033[H\033[2J");
            System.out.println("> You check your pokedex");
            System.out.println(Player.getPokedex());
            System.out.println("> Press enter to continue ...");
            scanner.nextLine();
        }
        actionBool = false;
    }

    // get the action to execute
    private static int action() {
        Scanner scanner = new Scanner(System.in);
        while (!actionBool) {
            System.out.print("\033[H\033[2J");
            System.out.println("> What do you want to do:");
            System.out.println("  > 0 - Go to Green Forest");
            System.out.println("  > 1 - Go to Mount Moon");
            System.out.println("  > 2 - Go to Lake of Fury");
            System.out.println("  > 3 - Check pokedex");

            try {
                int action = scanner.nextInt();
                if(action != 0 && action != 1 && action != 2 && action != 3) {
                    System.out.print("\033[H\033[2J"); 
                    action();
                } else if(action == 0) {
                    actionBool = true;
                    cAction = 0;
                } else if(action == 1) {
                    actionBool = true;
                    cAction = 1;
                }  else if(action == 2) {
                    actionBool = true;
                    cAction = 2;
                }  else if(action == 3) {
                    actionBool = true;
                    cAction = 3;
                }   
            } catch(Exception e) {
            System.out.print("\033[H\033[2J"); 
            action();
            }
        }
        return cAction;
    }

    // battle an enemy depending on the battleID
    private static void battle(int battleID) {
        Scanner scanner = new Scanner(System.in);
        Scanner scanner1 = new Scanner(System.in);
        int enemyHP = Pokemon.pokemonHPTable(2, battleID);
        while (!battleBool) {
            System.out.print("\033[H\033[2J");
            System.out.println("> What do you want to do:");
            System.out.println("  > 0 - Attack");
            System.out.println("  > 1 - Heal - " + player.potions);
            System.out.println("  > 2 - Capture - " + player.pokeballs);
            System.out.println("  > 3 - scape");
            System.out.println("  " + Pokemon.pokemonNameTable(player.gender, player.pokemon) + " has " + player.pokemonHP + "HP, " + Pokemon.pokemonNameTable(2, battleID) + " has " + enemyHP +"HP");
            try {
                int action = scanner.nextInt();
                if(action != 0 && action != 1 && action != 2 && action != 3) {
                    System.out.print("\033[H\033[2J"); 
                    battle(battleID);
                } else if(action == 0) {
                    enemyHP = attack(enemyHP, battleID);
                    System.out.println("> Press enter to continue ...");
                    scanner1.nextLine();
                } else if(action == 1) {
                    heal();
                    System.out.println("> Press enter to continue ...");
                    scanner1.nextLine();
                }  else if(action == 2) {
                    capture(enemyHP, battleID);
                    System.out.println("> Press enter to continue ...");
                    scanner1.nextLine();
                }  else if(action == 3) {
                    System.out.println("> You manage to scape");
                    System.out.println("> Press enter to continue ...");
                    scanner1.nextLine();
                    battleBool = true;
                }   
            } catch(Exception e) {
                System.out.print("\033[H\033[2J"); 
                battle(battleID);
            }
        }
        battleBool = false;
    }
    
    // battle options
    private static int attack(int enemyHP, int battleID) {
        if(enemyHP > 10) {
            enemyHP -= 10;
            System.out.println("> You damage" + Pokemon.pokemonNameTable(2, battleID) + "for 10HP, it now has " + enemyHP + "HP");
            if(battleID == 0) {
                player.pokemonHP -= 5;
            } else if(battleID == 1) {
                player.pokemonHP -= 3;
            } else if(battleID == 2) {
                player.pokemonHP -= 1;
            }
            if(player.pokemonHP >= 0) {
                System.out.println("> " + Pokemon.pokemonNameTable(2, battleID) + " attacks your pokemon, your pokemon now has " + player.pokemonHP + "HP");
            } else {
                System.out.println("> Your pokemon died");
                battleBool = true;
                endString = "You LOST - your pokemon died, better luck next time";
                end = true;
            }
        } else {
            System.out.println("> You killed " + Pokemon.pokemonNameTable(2, battleID));
            killCount++;
            battleBool = true;
        }
        return enemyHP;
    }
    private static void heal() {
        if((Pokemon.pokemonHPTable(player.gender, player.pokemon) >= player.pokemonHP+25) && (player.potions>0)) {
            player.pokemonHP += 25;
            player.potions -= 1;
            System.out.println("> You heal your pokemon for 20HP");
        } else {
            System.out.println("> Your pokemon has to much HP to heal");
        }
    }
    private static void capture(int enemyHP, int battleID) {
        if((enemyHP <= Pokemon.pokemonHPTable(2, battleID)/2) && (player.pokeballs>0)) {
            player.pokeballs -= 1;
            System.out.println("> You throw a pokeball and capture " + Pokemon.pokemonNameTable(2, battleID));
            player.addToPokedex(2, battleID);
            captureCount++;
            battleBool = true;
        } else {
            player.pokeballs -= 1;
            System.out.println("> " + Pokemon.pokemonNameTable(2, battleID) + " has too much hp");
        }
    }
}
