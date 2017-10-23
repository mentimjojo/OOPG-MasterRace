package nl.han.ica.MasterRace.Maps;


import nl.han.ica.MasterRace.Engine.Game;
import nl.han.ica.OOPDProcessingEngineHAN.Tile.TileMap;

public abstract class Map {

    // Get the engine
    protected Game engine;
    public TileMap map;

    /**
     * Give Game to map builder
     *
     * @param engine
     */
    public Map(Game engine){
        this.engine = engine;
        // Get he tile map
        this.map = engine.getTileMap();
    }

    /**
     * Set MAP
     */
    public abstract void setMap();


}
