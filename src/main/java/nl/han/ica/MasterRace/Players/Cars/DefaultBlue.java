package nl.han.ica.MasterRace.Players.Cars;

import nl.han.ica.MasterRace.Game;
import nl.han.ica.MasterRace.Players.Core.Car;
import nl.han.ica.MasterRace.Players.Core.Keys;

import java.security.Key;

/**
 * Get default blue
 * @author T.Nijborg
 * @version 0.1
 */
public class DefaultBlue extends Car {

    public DefaultBlue(Game game) {
        // Set car
        super(game, "default_blue.png");
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

        // Keys pressed
        final int speed = 2;
        for(Keys pressedKey : this.keysToPress) {
            if (pressedKey.getKeyCode() == 37 && pressedKey.getPressed()) {
                setDirectionSpeed(270, speed);
            }
            if (pressedKey.getKeyCode() == 38 && pressedKey.getPressed()) {
                setDirectionSpeed(0, speed);
            }
            if (pressedKey.getKeyCode() == 39 && pressedKey.getPressed()) {
                setDirectionSpeed(90, speed);
            }
            if (pressedKey.getKeyCode() == 40 && pressedKey.getPressed()) {
                setDirectionSpeed(180, speed);
            }
        }
    }
}
