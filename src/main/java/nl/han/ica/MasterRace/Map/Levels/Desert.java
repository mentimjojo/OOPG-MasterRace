package nl.han.ica.MasterRace.Map.Levels;

import nl.han.ica.MasterRace.Engine.Game;
import nl.han.ica.MasterRace.Map.Core.Level;
import nl.han.ica.OOPDProcessingEngineHAN.Tile.TileMap;
import nl.han.ica.OOPDProcessingEngineHAN.Tile.TileType;

public class Desert extends Level {

    /**
     * Constructor
     */
    public Desert(){
        // Load parent class
        super();
        // Set map
        this.setMap();
    }

    /**
     * Set map
     */
    public void setMap(){
        // Tile map
        int tilesMap[][]={
                {7,3,3,3,3,3,3,3,3,3,3,3,3,3,8},
                {1,0,4,4,4,4,4,4,4,4,4,4,4,0,2},
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
                {6,4,4,4,4,4,4,4,4,4,4,4,4,4,5}
        };
        // Set map
        this.map = new TileMap(tileSize, tiles.toArray(new TileType[tiles.size()]), tilesMap);
    }


}
