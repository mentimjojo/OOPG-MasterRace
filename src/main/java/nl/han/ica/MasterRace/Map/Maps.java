package nl.han.ica.MasterRace.Map;

import nl.han.ica.MasterRace.Map.Levels.Dessert;
import nl.han.ica.MasterRace.Map.Levels.Water;
import nl.han.ica.OOPDProcessingEngineHAN.Tile.TileMap;

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
    private HashMap<String, TileMap> levels = new HashMap<>();

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
        this.levels.put("Water", new Water().getMap());
        // Add dessert map
        this.levels.put("Dessert", new Dessert().getMap());
    }

    /**
     * Get specific map
     * @param levelName name of the level
     * @return TileMap
     */
    public TileMap getSpecificMap(String levelName){
        return this.levels.get(levelName);
    }

    /**
     * Get Random Map
     * @return TileMap
     */
    public TileMap getRandomMap(){
        // New random
        Random nextMap = new Random();
        // Values from maps
        Object[] levels = this.levels.values().toArray();
        // Return next map
        return (TileMap) levels[nextMap.nextInt(this.levels.size())];
    }

}
