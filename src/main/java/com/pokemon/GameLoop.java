package com.pokemon;

import java.util.Scanner;

public class GameLoop {

    private App app;
    private Player player;
    
    private boolean actionBool = false;
    private boolean battleBool = false;

    public GameLoop(App app, Player player) {
        this.app = app;
        this.player = player;
    }

    // procees game tick
    public void gameTick() {
        execAction(action());                                                   // player action
        if(app.getCaptureCount() >= 3) {                                        // check for win
            app.setEndString("You WON - you captured 3 pokemons");
            app.setEnd(true);
        } else if(app.getKillCount() >= 5) {
            app.setEndString("You WON - you killed 5 pokemons");
            app.setEnd(true);
        }
    }

    // option menu
    private int action() {
        Scanner scanner = new Scanner(System.in);
        int actionID = 0;
        while (!actionBool) {
            Util.clearCL();
            System.out.println("> What do you want to do:");
            System.out.println("  > 0 - Go to Green Forest");
            System.out.println("  > 1 - Go to Mount Moon");
            System.out.println("  > 2 - Go to Lake of Fury");
            System.out.println("  > 3 - Check pokedex");

            try {
                int action = scanner.nextInt();
                if(action != 0 && action != 1 && action != 2 && action != 3) {
                    Util.clearCL(); 
                    action();
                } else if(action == 0) {
                    actionBool = true;
                    actionID = 0;
                } else if(action == 1) {
                    actionBool = true;
                    actionID = 1;
                }  else if(action == 2) {
                    actionBool = true;
                    actionID = 2;
                }  else if(action == 3) {
                    actionBool = true;
                    actionID = 3;
                }   
            } catch(Exception e) {
            Util.clearCL(); 
            action();
            }
        }
        return actionID;
    }

    // execute given action
    private void execAction(int action) {
        if(action == 0) {
            Util.clearCL();
            System.out.println("> You go toGreen Forest");
            System.out.println("> A wild Pikachu attacks you!");
            Util.waitForEnter();
            battle(0);
        } else if(action == 1) {
            Util.clearCL();
            System.out.println("> You go Mount Moon");
            System.out.println("> A wild Clefairy attacks you!");
            Util.waitForEnter();
            battle(1);
        } else if(action == 2) {
            Util.clearCL();
            System.out.println("> You go to Lake of Fury");
            System.out.println("> A wild Magikarp attacks you!");
            Util.waitForEnter();
            battle(2);
        } else if(action == 3) {
            Util.clearCL();
            System.out.println("> You check your pokedex");
            System.out.println(player.getPokedex());
            Util.waitForEnter();
        }
        actionBool = false;
    }

    // battle menu
    private void battle(int battleID) {
        Scanner scanner = new Scanner(System.in);
        int enemyHP = Pokemon.pokemonHPTable(2, battleID);
        while (!battleBool) {
            Util.clearCL();
            System.out.println("> What do you want to do:");
            System.out.println("  > 0 - Attack");
            System.out.println("  > 1 - Heal - " + player.getPotions());
            System.out.println("  > 2 - Capture - " + player.getPokeballs());
            System.out.println("  > 3 - scape");
            System.out.println("  " + player.getPokemonName() + " has " + player.getPokemonHP() + "HP, " + Pokemon.pokemonNameTable(2, battleID) + " has " + enemyHP +"HP");
            try {
                int action = scanner.nextInt();
                if(action != 0 && action != 1 && action != 2 && action != 3) {
                    Util.clearCL(); 
                    battle(battleID);
                } else if(action == 0) {
                    enemyHP = attack(enemyHP, battleID);
                    Util.waitForEnter();
                } else if(action == 1) {
                    heal();
                    Util.waitForEnter();
                }  else if(action == 2) {
                    capture(enemyHP, battleID);
                    Util.waitForEnter();
                }  else if(action == 3) {
                    System.out.println("> You manage to scape");
                    Util.waitForEnter();
                    battleBool = true;
                }   
            } catch(Exception e) {
                Util.clearCL(); 
                battle(battleID);
            }
        }
        battleBool = false;
    }
    
    // battle options
    private int attack(int enemyHP, int battleID) {
        if(enemyHP > 10) {
            enemyHP -= 10;
            System.out.println("> You damage" + Pokemon.pokemonNameTable(2, battleID) + "for 10HP, it now has " + enemyHP + "HP");
            if(battleID == 0) {
                player.setPokemonHP(player.getPokemonHP()-5);
            } else if(battleID == 1) {
                player.setPokemonHP(player.getPokemonHP()-3);
            } else if(battleID == 2) {
                player.setPokemonHP(player.getPokemonHP()-1);
            }
            if(player.getPokemonHP() >= 0) {
                System.out.println("> " + Pokemon.pokemonNameTable(2, battleID) + " attacks your pokemon, your pokemon now has " + player.getPokemonHP() + "HP");
            } else {
                System.out.println("> Your pokemon died");
                battleBool = true;
                app.setEndString("You LOST - your pokemon died, better luck next time");
                app.setEnd(true);
            }
        } else {
            System.out.println("> You killed " + Pokemon.pokemonNameTable(2, battleID));
            app.setKillCount(app.getKillCount()+1);
            battleBool = true;
        }
        return enemyHP;
    }
    private void heal() {
        if((player.getPokemonMaxHP() >= player.getPokemonHP()+25) && (player.getPotions()>0)) {
            player.setPokemonHP(player.getPokemonHP()+25);
            player.setPotions(player.getPotions()-1);
            System.out.println("> You heal your pokemon for 20HP");
        } else {
            System.out.println("> Your pokemon has to much HP to heal");
        }
    }
    private void capture(int enemyHP, int battleID) {
        if((enemyHP <= Pokemon.pokemonHPTable(2, battleID)/2) && (player.getPokeballs()>0)) {
            player.setPokeballs((player.getPokeballs()-1));
            System.out.println("> You throw a pokeball and capture " + Pokemon.pokemonNameTable(2, battleID));
            player.setPokedex(2, battleID);
            app.setCaptureCount(app.getCaptureCount()+1);
            battleBool = true;
        } else {
            player.setPokeballs((player.getPokeballs()-1));
            System.out.println("> " + Pokemon.pokemonNameTable(2, battleID) + " has too much hp");
        }
    }
}
