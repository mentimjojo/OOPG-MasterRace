package nl.han.ica.MasterRace.Map.Powerups.Core;


import nl.han.ica.OOPDProcessingEngineHAN.Collision.ICollidableWithGameObjects;
import nl.han.ica.OOPDProcessingEngineHAN.Objects.AnimatedSpriteObject;
import nl.han.ica.OOPDProcessingEngineHAN.Objects.GameObject;
import nl.han.ica.OOPDProcessingEngineHAN.Objects.Sprite;

import java.util.List;

/**
 * The powerup abstract class
 * @author T.Nijborg
 * @version 0.1
 */
public abstract class Powerups extends AnimatedSpriteObject implements ICollidableWithGameObjects {

    /**
     * Chance to spawn
     */
    public double chance = 0;

    /**
     * X coordinates
     */
    private int xCoord = 0;

    /**
     * Y coordinates
     */
    private int yCoord = 0;

    /**
     * Power up constructor
     * @param powerupPNG the powerup image (sprite)
     */
    public Powerups(String powerupPNG){
        // Run upper class
        super(new Sprite("src/assets/powerups/" + powerupPNG), 1);
    }

    /**
     * Set chance
     */
    public void setChance(double chance){
        // Set chance
        this.chance = chance;
    }

    /**
     * Set X coordinates
     */
    public void setXcoord(int x){
        // Set x
        this.xCoord = x;
    }

    /**
     * Get x coord
     * @return get x coord
     */
    public int getXCoord(){
        // Get x
        return this.xCoord;
    }

    /**
     * Set Y coordinates
     */
    public void setYcoord(int y){
        // Set y
        this.yCoord = y;
    }

    /**
     * Get y coord
     * @return the y coord
     */
    public int getYCoord(){
        // Get y
        return this.yCoord;
    }

    /**
     * Update for GameObject
     */
    @Override
    public abstract void update();

    /**
     * What happens when a GameObject collided with it
     * @param collidedGameObjects the object where it collided with
     */
    @Override
    public abstract void gameObjectCollisionOccurred(List<GameObject> collidedGameObjects);
}
