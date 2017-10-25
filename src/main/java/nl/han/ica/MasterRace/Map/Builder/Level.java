package nl.han.ica.MasterRace.Map.Builder;

import nl.han.ica.OOPDProcessingEngineHAN.Tile.TileMap;
import nl.han.ica.OOPDProcessingEngineHAN.Tile.TileType;

import java.util.ArrayList;
import java.util.HashMap;

/**
 * Abstract level class, extends tiles
 * @author T.Nijborg
 * @version 0.1
 */
public class Level extends TileBuilder {

    // TileMap map
    protected TileMap map;

    // Position
    private HashMap<String, ArrayList<Float>> playerSpawnPosition = new HashMap<>();

    /**
     * Give Game to level builder
     */
    public Level(){
        // Run TileBuilder
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
    public void setMap(int[][] tileMap){
        // Create new tilemap
        this.map = new TileMap(this.tileSize, this.tiles.toArray(new TileType[tiles.size()]), tileMap);
    }

    /**
     * Set player spawn position
     * @param player the player
     * @param x the x position
     * @param y the y position
     */
    protected void setPlayerSpawnPosition(String player, float x, float y){
        // Array list coordinates
        ArrayList<Float> positions = new ArrayList<>();
        // Add coordinates
        positions.add(x);
        positions.add(y);
        // Add player spawn position
        this.playerSpawnPosition.put(player, positions);
    }


}
