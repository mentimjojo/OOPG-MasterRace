package nl.han.ica.MasterRace.Map.Builder;

import nl.han.ica.MasterRace.Map.Tiles.EnvironmentTile;
import nl.han.ica.MasterRace.Map.Tiles.FinishTile;
import nl.han.ica.MasterRace.Map.Tiles.TrackTile;
import nl.han.ica.OOPDProcessingEngineHAN.Objects.Sprite;
import nl.han.ica.OOPDProcessingEngineHAN.Tile.TileType;

import java.util.ArrayList;
import java.util.HashMap;

/**
 * The default tiles
 * @author T.Nijborg
 * @version 0.1
 */
public class TileBuilder {

    // HashMap assets paths
    private HashMap<String, String> assetsPaths = new HashMap<>();

    // ArrayList tiles
    protected ArrayList<TileType> tiles = new ArrayList<>();

    // Tile size
    protected final int tileSize = 70;

    /**
     * Constructor tiles
     */
    public TileBuilder(){
        // Setup paths
        this.setupPaths();
        // Setup default track tiles
        this.setupTrack();
        // Setup default environment
        this.setupEnvironment();
    }

    /**
     * Setup assets paths
     * all without a slash
     */
    private void setupPaths(){
        // Track parts
        assetsPaths.put("trackParts", "src/assets/track");
        // Environment
        assetsPaths.put("environment", "src/assets/environment");
        // power ups
        assetsPaths.put("powerups", "src/assets/powerups");
    }

    /**
     * Setup default track
     */
    private void setupTrack(){
        // First setup all default track parts
        Sprite track_full = new Sprite(this.assetsPaths.get("trackParts") + "/track.png");
        Sprite track_straight_left_wall = new Sprite(this.assetsPaths.get("trackParts") + "/track_straight_left.png");
        Sprite track_straight_right_wall = new Sprite(this.assetsPaths.get("trackParts") + "/track_straight_right.png");
        Sprite track_straight_top_wall = new Sprite(this.assetsPaths.get("trackParts") + "/track_straight_top.png");
        Sprite track_straight_bottom_wall = new Sprite(this.assetsPaths.get("trackParts") + "/track_corner_bottom_straight.png");
        Sprite track_corner_bottom_right = new Sprite(this.assetsPaths.get("trackParts") + "/track_corner_bottom_right.png");
        Sprite track_corner_bottom_left = new Sprite(this.assetsPaths.get("trackParts") + "/track_corner_bottom_left.png");
        Sprite track_corner_top_left = new Sprite(this.assetsPaths.get("trackParts") + "/track_corner_top_left.png");
        Sprite track_corner_top_right = new Sprite(this.assetsPaths.get("trackParts") + "/track_corner_top_right.png");
        Sprite track_finish = new Sprite(this.assetsPaths.get("trackParts") + "/track_finish.png");

        // Setup tile types
        TileType<TrackTile> tile_track_full = new TileType<>(TrackTile.class, track_full);
        TileType<TrackTile> tile_track_straight_left_wall = new TileType<>(TrackTile.class, track_straight_left_wall);
        TileType<TrackTile> tile_track_straight_right_wall = new TileType<>(TrackTile.class, track_straight_right_wall);
        TileType<TrackTile> tile_track_straight_top_wall = new TileType<>(TrackTile.class, track_straight_top_wall);
        TileType<TrackTile> tile_track_straight_bottom_wall = new TileType<>(TrackTile.class, track_straight_bottom_wall);
        TileType<TrackTile> tile_track_corner_bottom_right = new TileType<>(TrackTile.class, track_corner_bottom_right);
        TileType<TrackTile> tile_track_corner_bottom_left = new TileType<>(TrackTile.class, track_corner_bottom_left);
        TileType<TrackTile> tile_track_corner_top_left = new TileType<>(TrackTile.class, track_corner_top_left);
        TileType<TrackTile> tile_track_corner_top_right = new TileType<>(TrackTile.class, track_corner_top_right);
        TileType<FinishTile> tile_track_finish = new TileType<>(FinishTile.class, track_finish);

        // Add to tiles ArrayList
        this.tiles.add(tile_track_full);
        this.tiles.add(tile_track_straight_left_wall);
        this.tiles.add(tile_track_straight_right_wall);
        this.tiles.add(tile_track_straight_top_wall);
        this.tiles.add(tile_track_straight_bottom_wall);
        this.tiles.add(tile_track_corner_bottom_right);
        this.tiles.add(tile_track_corner_bottom_left);
        this.tiles.add(tile_track_corner_top_left);
        this.tiles.add(tile_track_corner_top_right);
        this.tiles.add(tile_track_finish);
    }

    /**
     * Setup environment
     */
    private void setupEnvironment(){
        // First setup all default environment parts
        Sprite water_full = new Sprite(this.assetsPaths.get("environment") + "/water_full.png");
        Sprite desert_full = new Sprite(this.assetsPaths.get("environment") + "/sand_full.png");
        Sprite dirt_full = new Sprite(this.assetsPaths.get("environment") + "/dirt_full.png");
        Sprite grass_full = new Sprite(this.assetsPaths.get("environment") + "/grass_full.png");

        // Setup tile types
        TileType<EnvironmentTile> tile_water_full = new TileType<>(EnvironmentTile.class, water_full);
        TileType<EnvironmentTile> tile_desert_full = new TileType<>(EnvironmentTile.class, desert_full);
        TileType<EnvironmentTile> tile_dirt_full = new TileType<>(EnvironmentTile.class, dirt_full);
        TileType<EnvironmentTile> tile_grass_full = new TileType<>(EnvironmentTile.class, grass_full);

        // Add to tiles ArrayList
        this.tiles.add(tile_water_full);
        this.tiles.add(tile_desert_full);
        this.tiles.add(tile_dirt_full);
        this.tiles.add(tile_grass_full);
    }

}
