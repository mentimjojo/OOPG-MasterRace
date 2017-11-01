package nl.han.ica.MasterRace.Map.Powerups;

import nl.han.ica.MasterRace.Game;
import nl.han.ica.MasterRace.Map.Powerups.Core.Powerups;
import nl.han.ica.MasterRace.Players.Cars.Player1;
import nl.han.ica.MasterRace.Players.Cars.Player2;
import nl.han.ica.MasterRace.Players.Core.Car;
import nl.han.ica.OOPDProcessingEngineHAN.Objects.GameObject;

import java.util.List;

/**
 * @author T.Nijborg
 * @version 0.1
 */
public class Speed extends Powerups {

    /**
     * Game instance
     */
    private Game game;

    /**
     * Oil constructor
     */
    public Speed(Game game){
        // Set powerup image
        super("speed.png");
        // Set game instance
        this.game = game;
    }

    /**
     * Update powerup GameObject
     */
    @Override
    public void update() {
    }

    /**
     * Check for collided with GameObject
     * @param collidedGameObjects the object where it collided with
     */
    @Override
    public void gameObjectCollisionOccurred(List<GameObject> collidedGameObjects) {
        for (GameObject object : collidedGameObjects) {
            if (object instanceof Car) {
                // Remove from game
                game.deleteGameObject(this);
                // Check which car
                if(object instanceof Player1) {
                    // Set speed to 3
                    ((Player1) object).speed = 3;
                }
                if(object instanceof Player2){
                    // Set speed to 3
                    ((Player2) object).speed = 3;
                }
            }
        }
    }


}
