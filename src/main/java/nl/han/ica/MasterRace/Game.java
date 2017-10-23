package nl.han.ica.MasterRace;

import nl.han.ica.MasterRace.Car.Cars;
import nl.han.ica.MasterRace.Map.Maps;
import nl.han.ica.OOPDProcessingEngineHAN.Dashboard.FPSCounter;
import nl.han.ica.OOPDProcessingEngineHAN.Engine.GameEngine;
import nl.han.ica.OOPDProcessingEngineHAN.View.View;
import processing.core.PApplet;

public class Game extends GameEngine {

    // Game static
    private static Game game;


    Cars cars = new Cars(this);
    FPSCounter fps = new FPSCounter(150, 150);

    /**
     * Main for processing
     * @param args
     */
    public static void main(String[] args) {
        PApplet.main(new String[]{"nl.han.ica.MasterRace.Game"});
    }

    /**
     * Setup game
     */
    @Override
    public void setupGame() {
        // Set instance
        game = this;
        // Set settings
        this.settings();
        // Map
        Maps nextMap = new Maps();
        tileMap = nextMap.getRandomMap();
        // Create view
        View view = new View(1400, 700);
        setView(view);
        // Setup
        size(1400, 700);
        this.createCars();
    }

    /**
     * Settings
     */
    private void settings(){
        // Set FTP
        this.setGameSpeed(144);
    }

    private void createCars(){
        addGameObject(cars, 100, 100);
    }

    /**
     * Update
     */
    @Override
    public void update() {
        fps.draw(this.g);
    }

    /**
     * Get instance game
     * @return
     */
    public static Game getInstance(){
        return game;
    }
}
