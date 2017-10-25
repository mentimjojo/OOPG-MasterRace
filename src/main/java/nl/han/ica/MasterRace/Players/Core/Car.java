package nl.han.ica.MasterRace.Players.Core;

import nl.han.ica.MasterRace.Game;
import nl.han.ica.MasterRace.Map.Tiles.EnvironmentTile;
import nl.han.ica.OOPDProcessingEngineHAN.Collision.CollidedTile;
import nl.han.ica.OOPDProcessingEngineHAN.Collision.ICollidableWithTiles;
import nl.han.ica.OOPDProcessingEngineHAN.Exceptions.TileNotFoundException;
import nl.han.ica.OOPDProcessingEngineHAN.Objects.AnimatedSpriteObject;
import nl.han.ica.OOPDProcessingEngineHAN.Objects.Sprite;
import java.util.ArrayList;
import java.util.List;

/**
 * Car class
 * @author T.Nijborg
 * @version 0.1
 *
 * TODO: Add location to spawn car after dead / outside map
 */
public abstract class Car extends AnimatedSpriteObject implements ICollidableWithTiles {


    /**
     * Protected game instance
     */
    protected Game game;

    /**
     * Size from wall
     */
    protected int size = 50;

    /**
     * Keys to press
     */
    protected ArrayList<Keys> keysToPress = new ArrayList<>();

    /**
     * Car constructor
     * @param instanceGame
     */
    public Car(Game instanceGame, String carPng){
        // Get the default car
        super(new Sprite("src/assets/cars/" + carPng), 1);
        // Set instance game
        this.game = instanceGame;
        // Add default press keys
        this.addKeys();
    }

    /**
     * Add keys
     */
    private void addKeys(){
        // Keys on board
        this.keysToPress.add(new Keys('a', 0));
        this.keysToPress.add(new Keys('w', 0));
        this.keysToPress.add(new Keys('s', 0));
        this.keysToPress.add(new Keys('d', 0));

        // Arrows, left, top, right, bottom
        this.keysToPress.add(new Keys('0', 37));
        this.keysToPress.add(new Keys('0', 38));
        this.keysToPress.add(new Keys('0', 39));
        this.keysToPress.add(new Keys('0', 40));
    }

    /**
     * Update car
     */
    @Override
    public abstract void update();

    /**
     * Controlling the car
     * @param keyCode keycode
     * @param key the key
     */
    @Override
    public void keyPressed(int keyCode, char key) {
        for(Keys pressedKey : this.keysToPress){
            if(key == pressedKey.getKey()){
                pressedKey.setPressed(true);
            }
            if(keyCode == pressedKey.getKeyCode()){
                pressedKey.setPressed(true);
            }
        }
    }

    /**
     * Key released
     * @param keyCode the key code
     * @param key the key
     */
    @Override
    public void keyReleased(int keyCode, char key) {
        for(Keys pressedKey : this.keysToPress){
            if(key == pressedKey.getKey()){
                pressedKey.setPressed(false);
            }
            if(keyCode == pressedKey.getKeyCode()){
                pressedKey.setPressed(false);
            }
        }
    }

    /**
     * Test on environment tiles
     * @param collidedTiles the tile that collided
     */
    @Override
    public void tileCollisionOccurred(List<CollidedTile> collidedTiles) {
        for (CollidedTile ct : collidedTiles) {
            if (ct.theTile instanceof EnvironmentTile) {
                try {
                    setxSpeed(0);
                    setX(0);
                    setY(0);
                } catch (TileNotFoundException e) {
                    e.printStackTrace();
                }
            }
        }
    }

}
