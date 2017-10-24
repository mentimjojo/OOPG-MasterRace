package nl.han.ica.MasterRace.Map.Core;

import nl.han.ica.MasterRace.Game;
import nl.han.ica.OOPDProcessingEngineHAN.Tile.TileMap;

/**
 * Abstract level class, extends tiles
 * @author T.Nijborg
 * @version 0.1
 */
public abstract class Level extends Tiles {

    // Get the engine
    protected Game engine;
    protected TileMap map;

    /**
     * Give Game to level builder
     */
    public Level(){
        // Run Tiles
        super();
        // Set engine
        this.engine = Game.getInstance();
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
     * Set MAP
     */
    public abstract void setMap();


}
