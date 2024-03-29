package nl.han.ica.MasterRace.Players.Core;

import nl.han.ica.MasterRace.Game;
import nl.han.ica.MasterRace.Map.Tiles.EnvironmentTile;
import nl.han.ica.MasterRace.Map.Tiles.FinishTile;
import nl.han.ica.MasterRace.Players.Cars.Player1;
import nl.han.ica.MasterRace.Players.Cars.Player2;
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
     * Speed from the cars
     */
    public int speed = 2;

    /**
     * Car constructor
     * @param instanceGame the instance of the game
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
        // Check on key char
        for(Keys pressedKey : this.keysToPress){
            if(key == pressedKey.getKey()){
                pressedKey.setPressed(true);
            }
            // Check on keycode
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
        // Check on key char
        for(Keys pressedKey : this.keysToPress){
            if(key == pressedKey.getKey()){
                pressedKey.setPressed(false);
            }
            // Check on keycode
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
        // Check for environment tiles
        for (CollidedTile ct : collidedTiles) {
            if (ct.theTile instanceof EnvironmentTile) {
                try {
                    // Start again
                    setxSpeed(0);
                    // Remove object
                    this.game.deleteGameObject(this);
                    // Check player
                    if(this instanceof Player1){
                        // Add player 1 at start
                        game.addPlayer1OnMap(this);
                    }
                    if(this instanceof Player2){
                        // Add player 2 at start
                        game.addPlayer2OnMap(this);
                    }
                } catch (TileNotFoundException e) {
                    // Print error
                    e.printStackTrace();
                }
            }
            // Check for finish line
            if (ct.theTile instanceof FinishTile) {
                try {
                    // Go to next map
                    this.game.nextMap();
                } catch (TileNotFoundException e) {
                    // Print error
                    e.printStackTrace();
                }
            }
        }
    }

}
