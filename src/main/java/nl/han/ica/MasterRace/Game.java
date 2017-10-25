package nl.han.ica.MasterRace;

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
        // Set settings
        this.settings();
        // Map
        Maps nextMap = new Maps();
        // Get a random map
        tileMap = nextMap.getRandomMap();
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
        //addGameObject(cars, 100, 100);
        addGameObject(new DefaultBlue(this), 50, 50);
        addGameObject(new DefaultOrange(this), 100, 100);
    }

    /**
     * Update
     */
    @Override
    public void update() {
        fps.draw(this.g);
    }
}
