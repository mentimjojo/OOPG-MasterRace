package nl.han.ica.MasterRace.Map.Tiles;

import nl.han.ica.OOPDProcessingEngineHAN.Objects.Sprite;
import nl.han.ica.OOPDProcessingEngineHAN.Tile.Tile;

/**
 * Environment tile
 * @author T.Nijborg
 * @version 0.1
 */
public class EnvironmentTile extends Tile {
    /**
     * @param sprite The image which will be drawn whenever the draw method of the Tile is called.
     */
    public EnvironmentTile(Sprite sprite) {
        super(sprite);
    }
}
