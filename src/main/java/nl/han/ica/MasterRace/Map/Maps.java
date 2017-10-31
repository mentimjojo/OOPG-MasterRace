package nl.han.ica.MasterRace.Map;

import nl.han.ica.MasterRace.Game;
import nl.han.ica.MasterRace.Map.Builder.Level;
import nl.han.ica.MasterRace.Map.Builder.LevelBuilder;
import java.util.HashMap;
import java.util.Random;

/**
 * The Maps builder
 * @author T.Nijborg
 * @version 0.2
 */
public class Maps {

    /**
     * OldLevel builder
     */
    private LevelBuilder builder;

    /**
     * All Maps saved
     */
    private HashMap<String, Level> levels;

    /**
     * Constructor Maps
     */
    public Maps(Game game){
        // Get level builder
        this.builder = new LevelBuilder(game);
        // Get builded levels
        this.levels = builder.getBuildedLevels();
    }

    /**
     * Get Random Map
     * @return TileMap
     */
    public Level getRandomMap(){
        // Check if map exists
        if(!this.levels.isEmpty()) {
            // New random
            Random nextMap = new Random();
            // Values from maps
            Object[] levels = this.levels.values().toArray();
            // Return next map
            return (Level) levels[nextMap.nextInt(this.levels.size())];
        } else {
            return null;
        }
    }

}
