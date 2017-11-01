package nl.han.ica.MasterRace.Map.Builder;

import nl.han.ica.MasterRace.Game;
import nl.han.ica.MasterRace.Map.Powerups.Core.Powerups;
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

    /**
     * Tile map
     */
    protected TileMap tileMap;

    /**
     * Game instace
     */
    private Game game;

    /**
     * Player spawn positions
     */
    private HashMap<String, ArrayList<Float>> playerSpawnPositions = new HashMap<>();

    /**
     * Power ups
     */
    public ArrayList<Powerups> powerups = new ArrayList<>();

    /**
     * Give Game to level builder
     *
     * @param game game instance
     */
    public Level(Game game){
        // Run TileBuilder
        super();
        // Set game
        this.game = game;
    }

    /**
     * Get tile map
     *
     * @return TileMap
     */
    public TileMap getMap(){
        return tileMap;
    }

    /**
     * Get player spawn position
     * @param player the player
     * @return the x / y position to spawn
     */
    public ArrayList getPlayerSpawnPosition(String player){
        return this.playerSpawnPositions.get(player);
    }

    /**
     * Set MAP
     */
    public void setMap(int[][] tileMap){
        // Create new tilemap
        this.tileMap = new TileMap(this.tileSize, this.tiles.toArray(new TileType[tiles.size()]), tileMap);
    }

    /**
     * Set powerups
     */
    public void spawnPowerUps(){
        for(Powerups powerup : this.powerups){
            // Check if need to spawn
            if(Math.random() < powerup.chance){
                // Add game object (powerup)
                this.game.addGameObject(powerup, powerup.getXCoord(), powerup.getYCoord());
            }
        }
    }

    /**
     * Set player spawn position
     * @param player the player
     * @param x the x position
     * @param y the y position
     */
    public void setPlayerSpawnPosition(String player, float x, float y){
        // Array list coordinates
        ArrayList<Float> positions = new ArrayList<>();
        // Add coordinates
        positions.add(x);
        positions.add(y);
        // Add player spawn position
        this.playerSpawnPositions.put(player, positions);
    }


}
