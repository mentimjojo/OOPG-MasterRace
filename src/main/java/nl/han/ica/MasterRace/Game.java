package nl.han.ica.MasterRace;

import nl.han.ica.MasterRace.Map.Builder.Level;
import nl.han.ica.MasterRace.Map.Maps;
import nl.han.ica.MasterRace.Players.Cars.DefaultBlue;
import nl.han.ica.MasterRace.Players.Cars.DefaultOrange;
import nl.han.ica.OOPDProcessingEngineHAN.Dashboard.FPSCounter;
import nl.han.ica.OOPDProcessingEngineHAN.Engine.GameEngine;
import nl.han.ica.OOPDProcessingEngineHAN.View.View;
import processing.core.PApplet;

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
    FPSCounter fps = new FPSCounter(150, 150);

    /**
     * The map
     */
    private Maps nextMap = new Maps();
    private Level selectedMap = nextMap.getRandomMap();

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
        // Set settings
        this.settings();
        // Create view
        this.view();
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

    // Setup MAP
    private void setupMap() {
        if (this.selectedMap != null) {
            // Get the map
            this.tileMap = selectedMap.getMap();
            // Create cars
            this.setupCars();
        } else {
            // TODO implement dashboard error
        }
    }

    /**
     * Create cars
     */
    private void setupCars() {
        addGameObject(new DefaultBlue(this), (Float) selectedMap.getPlayerSpawnPosition("player_1").get(0), (Float) selectedMap.getPlayerSpawnPosition("player_1").get(1));
        addGameObject(new DefaultOrange(this), (Float) selectedMap.getPlayerSpawnPosition("player_2").get(0), (Float) selectedMap.getPlayerSpawnPosition("player_2").get(1));
    }

    /**
     * Update
     */
    @Override
    public void update() {
        fps.draw(this.g);
    }
}
