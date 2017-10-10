package nl.han.ica.MasterRace.Engine;

import nl.han.ica.OOPDProcessingEngineHAN.Engine.GameEngine;
import processing.core.PApplet;

public class Engine extends GameEngine {

    // View viewport
    View view;

    /**
     * Constructor engine
     */
    public Engine(){
        // Set settings
        this.settings();
        // Create view
        this.view = new View(this);
    }

    /**
     * Settings
     */
    private void settings(){
        // Set FTP
        this.setGameSpeed(144);
    }

    @Override
    public void setupGame() {
        // Setup
        size(1000, 700);
        // Set view
        //view.setupViewPort();
    }

    @Override
    public void update() {

    }
}
