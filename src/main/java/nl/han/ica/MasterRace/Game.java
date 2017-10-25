package nl.han.ica.MasterRace;

import nl.han.ica.MasterRace.Map.Core.Level;
import nl.han.ica.MasterRace.Map.Maps;
import nl.han.ica.MasterRace.Players.Cars.DefaultBlue;
import nl.han.ica.MasterRace.Players.Cars.DefaultOrange;
import nl.han.ica.OOPDProcessingEngineHAN.Dashboard.FPSCounter;
import nl.han.ica.OOPDProcessingEngineHAN.Engine.GameEngine;
import nl.han.ica.OOPDProcessingEngineHAN.View.View;
import processing.core.PApplet;

/**
 * Main class
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
        System.out.println("Test");
        // Set settings
        this.settings();
        // Get a random map
        tileMap = selectedMap.getMap();
        // Create view
        this.view();
        // Get cars
        this.createCars();
    }

    /**
     * Create view
     */
    private void view(){
        // Create view
        View view = new View(1400, 700);
        // set view
        setView(view);
        // Set size
        size(1400, 700);
    }

    /**
     * Settings
     */
    private void settings(){
        // Set FTP
        this.setGameSpeed(144);
    }

    /**
     * Create cars
     */
    private void createCars(){
        addGameObject(new DefaultBlue(this), (Float) selectedMap.getPlayerSpawnPosition("p1").get(0), (Float) selectedMap.getPlayerSpawnPosition("p1").get(1));
        addGameObject(new DefaultOrange(this), (Float) selectedMap.getPlayerSpawnPosition("p2").get(0), (Float) selectedMap.getPlayerSpawnPosition("p2").get(1));
    }

    /**
     * Update
     */
    @Override
    public void update() {
        fps.draw(this.g);
    }
}
