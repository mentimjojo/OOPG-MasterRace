package nl.han.ica.MasterRace.Maps;

import nl.han.ica.MasterRace.Engine.Game;
import nl.han.ica.MasterRace.Maps.Tiles.Tiles;
import nl.han.ica.OOPDProcessingEngineHAN.Tile.TileMap;

public abstract class Map extends Tiles {

    // Get the engine
    protected Game engine;
    public TileMap map;

    /**
     * Give Game to map builder
     *
     * @param engine
     */
    public Map(Game engine){
        // Run Tiles
        super();
        // Set engine
        this.engine = engine;
        // Get he tile map
        this.map = engine.getTileMap();
    }

    /**
     * Set MAP
     */
    public abstract void setMap();


}
