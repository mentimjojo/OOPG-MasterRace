package nl.han.ica.MasterRace.Maps;

import nl.han.ica.MasterRace.Engine.Game;
import nl.han.ica.OOPDProcessingEngineHAN.Tile.TileMap;
import nl.han.ica.OOPDProcessingEngineHAN.Tile.TileType;

public class Desert extends Map {

    /**
     * Constructor
     *
     * @param engine
     */
    public Desert(Game engine){
        // Load parent class
        super(engine);
        // Set map
        this.setMap();
    }

    /**
     * Set map
     */
    public void setMap(){
        // Tile map
        int tilesMap[][]={
                {1,2,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1},
                {1,2,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1},
                {1,2,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,1,2},
                {1,2,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,1,2},
                {1,2,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,1,2},
                {1,2,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,1,2},
                {1,2,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,1,2},
                {1,2,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,1,2},
                {1,2,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,1,2},
                {1,2,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,1,2},
                {1,2,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,1,2},
                {1,2,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,1,2},
                {1,2,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,1,2},
                {1,0,3,3,3,3,3,3,3,3,3,3,3,0,2},
                {5,4,4,4,4,4,4,4,4,4,4,4,4,4,6}
        };
        // Set map
        this.map = new TileMap(tileSize, tiles.toArray(new TileType[tiles.size()]), tilesMap);
    }


}
