package nl.han.ica.MasterRace.Players.Core;

import nl.han.ica.MasterRace.Game;
import nl.han.ica.MasterRace.Map.Tiles.EnvironmentTile;
import nl.han.ica.OOPDProcessingEngineHAN.Collision.CollidedTile;
import nl.han.ica.OOPDProcessingEngineHAN.Collision.ICollidableWithTiles;
import nl.han.ica.OOPDProcessingEngineHAN.Exceptions.TileNotFoundException;
import nl.han.ica.OOPDProcessingEngineHAN.Objects.AnimatedSpriteObject;
import nl.han.ica.OOPDProcessingEngineHAN.Objects.Sprite;

import java.util.ArrayList;
import java.util.HashMap;
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
     * Car constructor
     * @param instanceGame
     */
    public Car(Game instanceGame, String carPng){
        // Get the default car
        super(new Sprite("src/assets/cars/" + carPng), 1);
        // Set instance game
        this.game = instanceGame;
    }

    /**
     * Update car so don't go out of map
     */
    @Override
    public void update() {
        if (getX()<=0) {
            setxSpeed(0);
            setX(0);
        }
        if (getY()<=0) {
            setySpeed(0);
            setY(0);
        }
        if (getX()>=this.game.getWidth()-size) {
            setxSpeed(0);
            setX(this.game.getWidth() - size);
        }
        if (getY()>=this.game.getHeight()-size) {
            setySpeed(0);
            setY(this.game.getHeight() - size);
        }
    }

    /**
     * Controlling the caar
     * @param keyCode
     * @param key
     */
    @Override
    public abstract void keyPressed(int keyCode, char key);

    /**
     * Test on environment tiles
     * @param collidedTiles
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
