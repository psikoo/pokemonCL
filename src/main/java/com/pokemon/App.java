package com.pokemon;

public class App {
    private Player player;
    private GameLoop gameLoop;
    private String endString = "";
    private int captureCount = 0;
    private int killCount = 0;

    public Player getPlayer() { return player; }
    public int getCaptureCount() { return captureCount; }
    public int getKillCount() { return killCount; }
    public void setPlayer(Player player) { this.player = player; }
    public void setEndString(String endString) { this.endString = endString; }
    public void setCaptureCount(int captureCount) { this.captureCount = captureCount; }
    public void setKillCount(int killCount) { this.killCount = killCount; }
    
    public App() {
        new Setup(this);                                    // Get player gender and pokemon
        
        gameLoop = new GameLoop(this, player);              // Initialize gameLoop
        while (endString.equals("")) { gameLoop.gameTick(); }    // Step game 1 tick

        Util.endScreen(endString);                          // Show end screen
    }
}
