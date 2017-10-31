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
     * Power up constructor
     * @param powerupPNG the powerup image (sprite)
     */
    public Powerups(String powerupPNG){
        // Run upper class
        super(new Sprite("src/assets/powerups/" + powerupPNG), 1);
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
