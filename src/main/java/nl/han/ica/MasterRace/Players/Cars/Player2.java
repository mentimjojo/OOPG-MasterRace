package nl.han.ica.MasterRace.Players.Cars;

import nl.han.ica.MasterRace.Game;
import nl.han.ica.MasterRace.Players.Core.Car;
import nl.han.ica.MasterRace.Players.Core.Keys;

/**
 * Get default orange player 2
 * @author T.Nijborg
 * @version 0.1
 */
public class Player2 extends Car {

    public Player2(Game game) {
        // Set car
        super(game, "default_orange.png");
        // Set friction
        setFriction(0.05F);
    }

    @Override
    public void update() {
        // Car not out of bound(walls)
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

        // Pressed key
        for(Keys pressedKey : this.keysToPress) {
            // Left
            if (pressedKey.getKey() == 'a' && pressedKey.getPressed()) {
                setDirectionSpeed(270, speed);
            }
            // Top
            if (pressedKey.getKey() == 'w' && pressedKey.getPressed()) {
                setDirectionSpeed(0, speed);
            }
            // Right
            if (pressedKey.getKey() == 'd' && pressedKey.getPressed()) {
                setDirectionSpeed(90, speed);
            }
            // Bottom
            if (pressedKey.getKey() == 's' && pressedKey.getPressed()) {
                setDirectionSpeed(180, speed);
            }
        }
    }
}
