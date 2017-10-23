package nl.han.ica.MasterRace.Maps;

import nl.han.ica.MasterRace.Engine.Engine;
import nl.han.ica.MasterRace.Maps.Tiles.BoardsTile;
import nl.han.ica.OOPDProcessingEngineHAN.Objects.Sprite;
import nl.han.ica.OOPDProcessingEngineHAN.Tile.TileMap;
import nl.han.ica.OOPDProcessingEngineHAN.Tile.TileType;

public class Map {

    private Engine engine;
    public TileMap kutmap;

    public Map(Engine engine){
        this.engine = engine;
        kutmap = engine.getTileMap();
        this.initializeTileMap();
    }

    /**
     * Initialiseert de tilemap
     */
    private void initializeTileMap() {
        /* TILES */
        Sprite Straight = new Sprite("src/main/java/nl/han/ica/MasterRace/Media/straight.PNG");

        TileType<BoardsTile> StraightTileType = new TileType<>(BoardsTile.class, Straight);

        TileType[] tileTypes = { StraightTileType };
        int tileSize=50;
        int tilesMap[][]={
                {-1,-1,-1,-1,-1,-1,-1,-1,-1,-1},
                {-1,-1,-1,-1,-1,-1,-1,-1,-1,-1},
                {-1,-1,-1,-1,-1,-1,-1,-1,-1,-1},
                {-1,-1,-1,-1,-1,-1,-1,-1,-1,-1},
                {-1,-1,-1,-1,-1,-1,-1,-1,-1,-1},
                {-1,-1,-1,-1,-1,-1,-1,-1,-1,-1},
                {-1,-1,-1,-1,-1,-1,-1,-1,-1,-1},
                {-1,-1,-1,-1,-1,-1,0,-1,-1,-1},
                {-1,-1,-1,-1,-1,-1, 0,-1,-1,-1},
                {-1,-1,-1,-1,-1,-1,-1,-1,-1,-1},
                {-1,-1,-1,-1,-1,-1,-1,-1,-1,-1},
                {-1,-1,-1,-1,-1,-1,-1,-1,-1,-1},
                {-1,-1,-1,-1,-1,-1,-1,-1,-1,-1},
                {-1,-1,-1,-1,-1,-1,-1,-1,-1,-1}
        };
        kutmap = new TileMap(tileSize, tileTypes, tilesMap);
    }


}
