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
public class Oil extends Powerups {

    /**
     * Game instance
     */
    private Game game;

    /**
     * Oil constructor
     */
    public Oil(Game game){
        // Set powerup image
        super("oil.png");
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
                // Remove car
                game.deleteGameObject(object);
                // Check which car
                if(object instanceof Player1) {
                    // Add player 1 at start
                    game.addPlayer1OnMap((Car) object);
                }
                if(object instanceof Player2){
                    // Add player 2 at start
                    game.addPlayer2OnMap((Car) object);
                }
            }
        }
    }


}
