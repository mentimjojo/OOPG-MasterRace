package nl.han.ica.MasterRace.Map.Levels;

import nl.han.ica.MasterRace.Map.Core.Level;
import nl.han.ica.OOPDProcessingEngineHAN.Tile.TileMap;
import nl.han.ica.OOPDProcessingEngineHAN.Tile.TileType;

/**
 * Dessert map
 * @author N.Holtus
 * @version 0.2
 */
public class Dessert extends Level {

    public Dessert(){
        // Load parent class
        super();
        // Set map
        this.setMap();
        // Set positions p1
        this.setPlayerSpawnPosition("p1", 50, 50);
        // Set positions p2
        this.setPlayerSpawnPosition("p2", 100, 50);
    }

    /**
     * Set map
     */
    public void setMap(){
        // Tile map
        int tilesMap[][]={
                {0,0,10,10,10,0,0,0,0,0,0,10,10,10,10,10,10,10,10,10},
                {0,0,10,10,10,0,0,0,0,0,0,10,10,10,10,10,10,10,10,10},
                {0,0,10,10,10,0,0,10,10,0,0,10,10,0,0,0,0,0,10,10},
                {0,0,10,10,10,0,0,10,10,0,0,10,10,0,0,0,0,0,10,10},
                {0,0,10,10,10,0,0,10,10,0,0,0,0,0,0,10,0,0,10,10},
                {0,0,10,10,0,0,0,10,10,0,0,0,0,0,0,10,0,0,10,10},
                {0,0,10,10,0,0,0,10,10,10,10,10,10,10,10,10,0,0,10,10},
                {0,0,10,10,0,0,10,10,10,10,10,10,10,10,10,10,0,0,10,10},
                {0,0,0,0,0,0,10,10,10,10,10,10,10,10,10,10,0,0,0,0},
                {0,0,0,0,0,0,10,10,10,10,10,10,10,10,10,10,0,0,0,0}
        };
        // Set map
        this.map = new TileMap(tileSize, tiles.toArray(new TileType[tiles.size()]), tilesMap);
    }


}
