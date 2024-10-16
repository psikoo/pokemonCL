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

    // process game tick
    public void gameTick() {
        execAction(action());
        if(app.getCaptureCount() >= 3) { app.setEndString("You WON! you captured 3 pokemons"); } 
        else if(app.getKillCount() >= 5) { app.setEndString("You WON! you killed 5 pokemons"); }
    }

    // option menu
    private int action() {
        Scanner scanner = new Scanner(System.in);
        int actionID = 0;
        while (!actionBool) {
            Util.actionMenu();
            try {
                int action = scanner.nextInt();
                if(action != 0 && action != 1 && action != 2 && action != 3) { action(); } 
                else if(action == 0) {
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
            } catch(Exception e) { action(); }
        }
        return actionID;
    }

    // execute given action
    private void execAction(int action) {
        if(action == 0) {
            Util.battlePopup0();
            battle(0);
        } else if(action == 1) {
            Util.battlePopup1();
            battle(1);
        } else if(action == 2) {
            Util.battlePopup2();
            battle(2);
        } else if(action == 3) {
            Util.pokedex(player.getPokedex());
        }
        actionBool = false;
    }

    // battle menu
    private void battle(int battleID) {
        Scanner scanner = new Scanner(System.in);
        int enemyHP = Pokemon.pokemonHPTable(2, battleID);
        while (!battleBool) {
            String pokemonInfo = player.getPokemonName()+" has "+player.getPokemonHP()+"HP, "+Pokemon.pokemonNameTable(2, battleID)+" has "+enemyHP+"HP";
            Util.battleMenu(player.getPotions(), player.getPokeballs(), pokemonInfo);
            try {
                int action = scanner.nextInt();
                if(action != 0 && action != 1 && action != 2 && action != 3) { battle(battleID); } 
                else if(action == 0) { enemyHP = attack(enemyHP, battleID); }
                else if(action == 1) { heal(); }
                else if(action == 2) { capture(enemyHP, battleID); }
                else if(action == 3) { 
                    Util.scapeMenu();
                    battleBool = true;
                }   
            } catch(Exception e) { battle(battleID); }
        }
        battleBool = false;
    }
    
    // battle options
    private int attack(int enemyHP, int battleID) {
        if(enemyHP > 10) {
            enemyHP -= 10;
            Util.attackMenu0(Pokemon.pokemonNameTable(2, battleID), enemyHP);
            if(battleID == 0) { player.setPokemonHP(player.getPokemonHP()-5); }
            else if(battleID == 1) { player.setPokemonHP(player.getPokemonHP()-3); } 
            else if(battleID == 2) { player.setPokemonHP(player.getPokemonHP()-1); }
            
            if(player.getPokemonHP() > 0) {
                Util.attackMenu1(Pokemon.pokemonNameTable(2, battleID), player.getPokemonHP());
            } else {
                Util.attackMenu2(Pokemon.pokemonNameTable(2, battleID), player.getPokemonName());
                battleBool = true;
                app.setEndString("You LOST! your pokemon died, better luck next time");
            }
        } else {
            Util.attackMenu3(player.getPokemonName(), Pokemon.pokemonNameTable(2, battleID));
            app.setKillCount(app.getKillCount()+1);
            battleBool = true;
        }
        return enemyHP;
    }
    private void heal() {
        if((player.getPokemonMaxHP() >= player.getPokemonHP()+25) && (player.getPotions()>0)) {
            player.setPokemonHP(player.getPokemonHP()+25);
            player.setPotions(player.getPotions()-1);
            Util.healMenu0();
        } else {
            Util.healMenu1();
        }
    }
    private void capture(int enemyHP, int battleID) {
        if((enemyHP <= Pokemon.pokemonHPTable(2, battleID)/2) && (player.getPokeballs()>0)) {
            player.setPokeballs((player.getPokeballs()-1));
            player.setPokedex(2, battleID);
            app.setCaptureCount(app.getCaptureCount()+1);
            Util.captureMenu0();
            battleBool = true;
        } else {
            player.setPokeballs((player.getPokeballs()-1));
            Util.captureMenu1();
        }
    }
}
