package nl.han.ica.MasterRace.Engine;

import nl.han.ica.MasterRace.Maps.Map;
import nl.han.ica.OOPDProcessingEngineHAN.Engine.GameEngine;
import nl.han.ica.OOPDProcessingEngineHAN.Tile.TileMap;
import nl.han.ica.OOPDProcessingEngineHAN.View.View;

public class Engine extends GameEngine {

    // View viewport
    private View view;
    private Map map;

    /**
     * Constructor engine
     */
    public Engine(){
        // Set settings
        this.settings();
        map = new Map(this);
        tileMap = map.kutmap;
        // Create view
        this.view = new View(1204, 903);
        this.view.setBackground(loadImage("src/main/java/nl/han/ica/MasterRace/Media/background.jpg"));
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
        size(1204, 903);
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
