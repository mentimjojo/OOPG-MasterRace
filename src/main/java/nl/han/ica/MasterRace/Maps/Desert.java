package nl.han.ica.MasterRace.Maps;

import nl.han.ica.MasterRace.Engine.Game;
import nl.han.ica.MasterRace.Maps.Tiles.BoardsTile;
import nl.han.ica.OOPDProcessingEngineHAN.Objects.Sprite;
import nl.han.ica.OOPDProcessingEngineHAN.Tile.TileMap;
import nl.han.ica.OOPDProcessingEngineHAN.Tile.TileType;

public class Desert extends Map {


    public Desert(Game engine){
        super(engine);
        this.setMap();
    }

    public void setMap(){
        Sprite track = new Sprite("src/main/java/nl/han/ica/MasterRace/Media/track.png");
        Sprite straightLeft = new Sprite("src/main/java/nl/han/ica/MasterRace/Media/track_straight_left.png");
        Sprite StraightRight = new Sprite("src/main/java/nl/han/ica/MasterRace/Media/track_straight_right.png");
        Sprite CornerBottomRight = new Sprite("src/main/java/nl/han/ica/MasterRace/Media/track_corner_bottom_right.png");
        Sprite CornerBottomLeft = new Sprite("src/main/java/nl/han/ica/MasterRace/Media/track_corner_bottom_left.png");
        Sprite CornerBottomStraight = new Sprite("src/main/java/nl/han/ica/MasterRace/Media/track_corner_bottom_straight.png");
        Sprite CornerTopStraight = new Sprite("src/main/java/nl/han/ica/MasterRace/Media/track_corner_top_straight.png");

        TileType<BoardsTile> TrackTileType = new TileType<>(BoardsTile.class, track);
        TileType<BoardsTile> StraightLeftTileType = new TileType<>(BoardsTile.class, straightLeft);
        TileType<BoardsTile> StraightRightTileType = new TileType<>(BoardsTile.class, StraightRight);
        TileType<BoardsTile> CornerBottomRightTileType = new TileType<>(BoardsTile.class, CornerBottomRight);
        TileType<BoardsTile> CornerBottomLeftTileType = new TileType<>(BoardsTile.class, CornerBottomLeft);
        TileType<BoardsTile> CornerBottomStraightTileType = new TileType<>(BoardsTile.class, CornerBottomStraight);
        TileType<BoardsTile> CornerTopStraightTileType = new TileType<>(BoardsTile.class, CornerTopStraight);

        TileType[] tileTypes = { TrackTileType, StraightLeftTileType,StraightRightTileType, CornerBottomRightTileType, CornerBottomStraightTileType, CornerTopStraightTileType, CornerBottomLeftTileType };
        int tileSize=100;
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
                {1,0,5,5,5,5,5,5,5,5,5,5,5,0,2},
                {3,4,4,4,4,4,4,4,4,4,4,4,4,4,6}
        };
        this.map = new TileMap(tileSize, tileTypes, tilesMap);
    }


}
