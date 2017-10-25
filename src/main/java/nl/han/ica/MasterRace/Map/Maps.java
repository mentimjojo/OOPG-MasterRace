package nl.han.ica.MasterRace.Map;

import nl.han.ica.MasterRace.Map.Core.Level;
import nl.han.ica.MasterRace.Map.Levels.Dessert;
import nl.han.ica.MasterRace.Map.Levels.Water;
import nl.han.ica.OOPDProcessingEngineHAN.Tile.TileMap;

import javax.sound.sampled.LineEvent;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Random;

/**
 * The Maps builder
 * @author T.Nijborg
 * @version 0.1
 */
public class Maps {

    /**
     * All Maps saved
     */
    private HashMap<String, Level> levels = new HashMap<>();

    /**
     * Constructor Maps
     */
    public Maps(){
        // Setup maps
        this.setupMaps();
    }

    /**
     * Setup maps
     */
    private void setupMaps(){
        // Add Water
        this.levels.put("Water", new Water());
        // Add dessert map
        this.levels.put("Dessert", new Dessert());
    }

    /**
     * Get specific map
     * @param levelName name of the level
     * @return TileMap
     */
    public Level getSpecificMap(String levelName){
        return this.levels.get(levelName);
    }

    /**
     * Get Random Map
     * @return TileMap
     */
    public Level getRandomMap(){
        // New random
        Random nextMap = new Random();
        // Values from maps
        Object[] levels = this.levels.values().toArray();
        // Return next map
        return (Level) levels[nextMap.nextInt(this.levels.size())];
    }

}
