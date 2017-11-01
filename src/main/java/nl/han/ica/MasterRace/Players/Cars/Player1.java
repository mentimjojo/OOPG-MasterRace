package nl.han.ica.MasterRace.Players.Cars;

import nl.han.ica.MasterRace.Game;
import nl.han.ica.MasterRace.Players.Core.Car;
import nl.han.ica.MasterRace.Players.Core.Keys;

/**
 * Get default blue player 1
 * @author T.Nijborg
 * @version 0.1
 */
public class Player1 extends Car {

    /**
     * Player 1 constructor
     * @param game instance
     */
    public Player1(Game game) {
        // Set car
        super(game, "default_blue.png");
        // Set friction
        setFriction(0.05F);
    }

    /**
     * On update
     */
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
        System.out.println(this.speed);

        // Keys pressed
        for(Keys pressedKey : this.keysToPress) {
            // Left
            if (pressedKey.getKeyCode() == 37 && pressedKey.getPressed()) {
                setDirectionSpeed(270, speed);
            }
            // Top
            if (pressedKey.getKeyCode() == 38 && pressedKey.getPressed()) {
                setDirectionSpeed(0, speed);
            }
            // Right
            if (pressedKey.getKeyCode() == 39 && pressedKey.getPressed()) {
                setDirectionSpeed(90, speed);
            }
            // bottom
            if (pressedKey.getKeyCode() == 40 && pressedKey.getPressed()) {
                setDirectionSpeed(180, speed);
            }
        }
    }
}
