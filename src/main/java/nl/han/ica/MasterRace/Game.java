package nl.han.ica.MasterRace;

import nl.han.ica.MasterRace.Map.Builder.Level;
import nl.han.ica.MasterRace.Map.Maps;
import nl.han.ica.MasterRace.Players.Cars.Player1;
import nl.han.ica.MasterRace.Players.Cars.Player2;
import nl.han.ica.MasterRace.Players.Core.Car;
import nl.han.ica.OOPDProcessingEngineHAN.Dashboard.FPSCounter;
import nl.han.ica.OOPDProcessingEngineHAN.Engine.GameEngine;
import nl.han.ica.OOPDProcessingEngineHAN.View.View;
import processing.core.PApplet;

import java.util.HashMap;

/**
 * Main class
 *
 * @author T.Nijborg
 * @version 0.2
 */
public class Game extends GameEngine {

    /**
     * FPS counter
     */
    private FPSCounter fps = new FPSCounter(150, 150);

    /**
     * The map
     */
    private Maps nextMap = new Maps(this);

    /**
     * Selected random map
     */
    public Level selectedMap;

    /**
     * Players
     */
    private HashMap<String, Car> players = new HashMap<>();

    /**
     * Main for processing
     *
     * @param args main args
     */
    public static void main(String[] args) {
        PApplet.main(new String[]{"nl.han.ica.MasterRace.Game"});
    }

    /**
     * Setup game
     */
    @Override
    public void setupGame() {
        //System.out.println("hoi");
        // Set current map
        this.selectedMap = nextMap.getRandomMap();
        // Set settings
        this.settings();
        // Create view
        this.view();
        // Setup players
        this.setupPlayers();
        // Get Map
        this.setupMap();
    }

    /**
     * Create view
     */
    private void view() {
        // Create view
        View view = new View(1400, 700);
        // set view
        setView(view);
        // Background white
        background(541);
        // Set size
        size(1400, 700);
    }

    /**
     * Settings
     */
    private void settings() {
        // Set FTP
        this.setGameSpeed(144);
    }

    /**
     * Setup players
     */
    private void setupPlayers(){
        // Add player 1
        this.players.put("player_1", new Player1(this));
        // Add player 2
        this.players.put("player_2", new Player2(this));
    }

    /**
     * Setup the map
     */
    private void setupMap() {
        if (this.selectedMap != null) {
            // Get the map
            this.tileMap = selectedMap.getMap();
            // Setup player 1
            this.addPlayer1OnMap(this.players.get("player_1"));
            // Setup player 2
            this.addPlayer2OnMap(this.players.get("player_2"));
            // Spawn power ups
            selectedMap.spawnPowerUps();
        }
    }

    /**
     * Go to the next map.
     */
    public void nextMap(){
        // get next level
        this.selectedMap = nextMap.getRandomMap();
        // Delete game objects (clear map)
        this.deleteAllGameOBjects();
        // Run setup map again
        this.setupMap();
    }

    /**
     * Setup player 1
     */
    public void addPlayer1OnMap(Car player1){
        // Reset speed
        player1.speed = 2;
        // Add blue car
        addGameObject(player1, (Float) selectedMap.getPlayerSpawnPosition("player_1").get(0), (Float) selectedMap.getPlayerSpawnPosition("player_1").get(1));
    }

    /**
     * Setup player 2
     */
    public void addPlayer2OnMap(Car player2){
        // Reset speed
        player2.speed = 2;
        // Add orange car
        addGameObject(player2, (Float) selectedMap.getPlayerSpawnPosition("player_2").get(0), (Float) selectedMap.getPlayerSpawnPosition("player_2").get(1));
    }

    /**
     * Update
     */
    @Override
    public void update() {
        fps.draw(this.g);
    }
}
