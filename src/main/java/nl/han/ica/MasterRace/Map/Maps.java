package nl.han.ica.MasterRace.Map;

import nl.han.ica.MasterRace.Map.Builder.Level;
import nl.han.ica.MasterRace.Map.Builder.LevelBuilder;
import java.util.HashMap;
import java.util.Random;

/**
 * The Maps builder
 * @author T.Nijborg
 * @version 0.1
 */
public class Maps {

    /**
     * OldLevel builder
     */
    private LevelBuilder builder = new LevelBuilder();

    /**
     * All Maps saved
     */
    private HashMap<String, Level> levels;

    /**
     * Constructor Maps
     */
    public Maps(){
        // Get builded levels
        this.levels = builder.getBuildedLevels();
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
