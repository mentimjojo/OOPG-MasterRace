package nl.han.ica.MasterRace.Engine;

import nl.han.ica.MasterRace.Maps.Desert;
import nl.han.ica.OOPDProcessingEngineHAN.Engine.GameEngine;
import nl.han.ica.OOPDProcessingEngineHAN.Tile.TileMap;
import nl.han.ica.OOPDProcessingEngineHAN.View.View;

public class Game extends GameEngine {

    // View viewport
    private View view;
    private Desert map;

    /**
     * Constructor engine
     */
    public Game(){
        // Set settings
        this.settings();
        map = new Desert(this);
        tileMap = map.map;
        // Create view
        this.view = new View(1500, 1500);
        //this.view.setBackground(loadImage("src/main/java/nl/han/ica/MasterRace/Media/background.jpg"));
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

    public TileMap getTileMap(){
        return tileMap;
    }

    @Override
    public void update() {

    }
}
