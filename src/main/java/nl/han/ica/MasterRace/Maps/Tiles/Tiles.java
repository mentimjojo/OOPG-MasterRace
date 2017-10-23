package nl.han.ica.MasterRace.Maps.Tiles;


import nl.han.ica.OOPDProcessingEngineHAN.Objects.Sprite;
import nl.han.ica.OOPDProcessingEngineHAN.Tile.TileType;

import java.util.ArrayList;
import java.util.HashMap;

public class Tiles {

    // HashMap assets paths
    protected HashMap<String, String> assetsPaths = new HashMap<>();

    // ArrayList tiles
    protected ArrayList<TileType> tiles = new ArrayList<>();

    // Tile size
    protected final int tileSize = 100;

    /**
     * Constructor tiles
     */
    public Tiles(){
        // Setup paths
        this.setupPaths();
        // Setup default track tiles
        this.setupTrack();
    }

    /**
     * Setup assets paths
     * all without a slash
     */
    private void setupPaths(){
        // Track parts
        assetsPaths.put("trackParts", "src/assets/track");
    }

    /**
     * Setup default track
     */
    private void setupTrack(){
        // First setup all default track parts
        Sprite track_full = new Sprite("src/assets/track/track.png");
        Sprite track_straight_left_wall = new Sprite("src/assets/track/track_straight_left.png");
        Sprite track_straight_right_wall = new Sprite("src/assets/track/track_straight_right.png");
        Sprite track_straight_top_wall = new Sprite("src/assets/track/track_straight_top.png");
        Sprite track_straight_bottom_wall = new Sprite("src/assets/track/track_corner_bottom_straight.png");
        Sprite track_corner_bottom_right = new Sprite("src/assets/track/track_corner_bottom_right.png");
        Sprite track_corner_bottom_left = new Sprite("src/assets/track/track_corner_bottom_left.png");

        // Setup tile types
        TileType<BoardsTile> tile_track_full = new TileType<>(BoardsTile.class, track_full);
        TileType<BoardsTile> tile_track_straight_left_wall = new TileType<>(BoardsTile.class, track_straight_left_wall);
        TileType<BoardsTile> tile_track_straight_right_wall = new TileType<>(BoardsTile.class, track_straight_right_wall);
        TileType<BoardsTile> tile_track_straight_top_wall = new TileType<>(BoardsTile.class, track_straight_top_wall);
        TileType<BoardsTile> tile_track_straight_bottom_wall = new TileType<>(BoardsTile.class, track_straight_bottom_wall);
        TileType<BoardsTile> tile_track_corner_bottom_right = new TileType<>(BoardsTile.class, track_corner_bottom_right);
        TileType<BoardsTile> tile_track_corner_bottom_left = new TileType<>(BoardsTile.class, track_corner_bottom_left);

        // Add to tiles ArrayList
        this.tiles.add(tile_track_full);
        this.tiles.add(tile_track_straight_left_wall);
        this.tiles.add(tile_track_straight_right_wall);
        this.tiles.add(tile_track_straight_top_wall);
        this.tiles.add(tile_track_straight_bottom_wall);
        this.tiles.add(tile_track_corner_bottom_right);
        this.tiles.add(tile_track_corner_bottom_left);
    }

}
