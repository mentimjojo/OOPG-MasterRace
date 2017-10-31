package nl.han.ica.MasterRace.Map.Builder;

import org.json.JSONArray;
import org.json.JSONObject;

import java.io.File;
import java.io.IOException;
import java.nio.charset.Charset;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.HashMap;

/**
 * Level builder
 *
 * @author T.Nijborg
 * @version 0.1
 */
public class LevelBuilder {

    // Save json level files
    private File[] levelFiles;

    // HashMap with levels
    HashMap<String, Level> levels = new HashMap<>();

    /**
     * Constructor level builder
     */
    public LevelBuilder() {
        // Load json files
        this.getLevelFiles();
        // Create maps from level files
        this.createMapFromLevelFile();
    }

    /**
     * Get level files from /src/levels
     */
    private void getLevelFiles() {
        // Load files
        File folder = new File("src/levels/");
        // Set files to variable
        this.levelFiles = folder.listFiles();
    }

    /**
     * Create map from the level file
     *
     * JSON parsers get's:
     * If map is enabled, if true only then get parsed.
     * - Name
     * - TileMap
     * - Player Spawn Positions
     *
     * TODO: Add power ups to readable
     */
    private void createMapFromLevelFile() {
        // For each level file
        for (File level : this.levelFiles) {
            try {
                // Json object
                JSONObject obj = new JSONObject(this.readFile(level.toString(), Charset.defaultCharset()));
                // Check if map is enabled
                if(obj.getBoolean("enabled")) {
                    // Get level name
                    String levelName = obj.getString("name");
                    // Get map
                    JSONArray tileArray = obj.getJSONArray("tileMap");
                    // Array list tileMap
                    int[][] tileMap = new int[tileArray.length()][];
                    // For each tile array
                    for (int i = 0; i < tileArray.length(); i++) {
                        // Array inside tile array
                        JSONArray array = tileArray.getJSONArray(i);
                        // Int
                        int[] tiles = new int[array.length()];
                        // For each tile
                        for (int t = 0; t < array.length(); t++) {
                            // Get tile
                            tiles[t] = (int) array.get(t);
                        }
                        // Add to array list
                        tileMap[i] = tiles;
                    }
                    // Create new level
                    Level newLevel = new Level();
                    // Set map
                    newLevel.setMap(tileMap);
                    // Get coordinates
                    JSONArray playerSpawns = obj.getJSONArray("playerSpawnPositions");
                    // For each player spawn
                    for (int i = 0; i < playerSpawns.length(); i++) {
                        // Get player pos
                        JSONObject spawn = playerSpawns.getJSONObject(i);
                        // Set player spawn positions
                        newLevel.setPlayerSpawnPosition(spawn.getString("name"), (int) spawn.getJSONArray("positions").get(0), (int) spawn.getJSONArray("positions").get(1));
                    }
                    // Add to HashMap
                    this.levels.put(levelName, newLevel);
                }
            } catch (IOException ex){
                System.out.println(ex.toString());
            }
        }
    }

    /**
     * Get builded leveld
     * @return HashMap with builded levels
     */
    public HashMap getBuildedLevels(){
        return this.levels;
    }

    /**
     * Read json file and return in string
     *
     * @param path to file
     * @param encoding how to encode
     * @return the string from the file
     * @throws IOException error
     */
    private String readFile(String path, Charset encoding)
            throws IOException
    {
        // Read all bytes from path
        byte[] encoded = Files.readAllBytes(Paths.get(path));
        // Return in string format
        return new String(encoded, encoding);
    }

}
