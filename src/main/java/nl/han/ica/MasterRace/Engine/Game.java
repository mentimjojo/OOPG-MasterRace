package nl.han.ica.MasterRace.Engine;

import nl.han.ica.MasterRace.Map.Levels.Desert;
import nl.han.ica.MasterRace.Map.Maps;
import nl.han.ica.OOPDProcessingEngineHAN.Engine.GameEngine;
import nl.han.ica.OOPDProcessingEngineHAN.Tile.TileMap;
import nl.han.ica.OOPDProcessingEngineHAN.View.View;

public class Game extends GameEngine {

    // Game static
    private static Game game;

    // View viewport
    private View view;

    /**
     * Constructor engine
     */
    public Game(){
        // Set instance
        game = this;
        // Set settings
        this.settings();
        Maps nextMap = new Maps();
        tileMap = nextMap.getRandomMap();
        // Create view
        this.view = new View(1500, 1500);
        //this.view.setBackground(loadImage("src/main/java/nl/han/ica/MasterRace/Track/background.jpg"));
        setView(this.view);
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

    /**
     * Get instance game
     * @return
     */
    public static Game getInstance(){
        return game;
    }

    @Override
    public void update() {

    }
}
