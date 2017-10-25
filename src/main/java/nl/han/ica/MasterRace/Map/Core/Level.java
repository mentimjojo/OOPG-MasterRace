package nl.han.ica.MasterRace.Map.Core;

import nl.han.ica.OOPDProcessingEngineHAN.Tile.TileMap;

import java.util.ArrayList;
import java.util.HashMap;

/**
 * Abstract level class, extends tiles
 * @author T.Nijborg
 * @version 0.1
 */
public abstract class Level extends Tiles {

    // TileMap map
    protected TileMap map;

    // Position
    private HashMap<String, ArrayList<Float>> playerSpawnPosition = new HashMap<>();

    /**
     * Give Game to level builder
     */
    public Level(){
        // Run Tiles
        super();
    }

    /**
     * Get tile map
     *
     * @return TileMap
     */
    public TileMap getMap(){
        return map;
    }

    /**
     * Get player spawn position
     * @param player the player
     * @return the x / y position to spawn
     */
    public ArrayList getPlayerSpawnPosition(String player){
        return this.playerSpawnPosition.get(player);
    }

    /**
     * Set MAP
     */
    public abstract void setMap();

    /**
     * Set player spawn position
     * @param player the player
     * @param x the x position
     * @param y the y position
     */
    protected void setPlayerSpawnPosition(String player, float x, float y){
        // Array list coords
        ArrayList<Float> positions = new ArrayList<>();
        // Add coords
        positions.add(x);
        positions.add(y);
        // Add player spawn position
        this.playerSpawnPosition.put(player, positions);
    }


}
