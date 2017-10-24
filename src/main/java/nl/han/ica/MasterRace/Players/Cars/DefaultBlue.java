package nl.han.ica.MasterRace.Players.Cars;

import nl.han.ica.MasterRace.Game;
import nl.han.ica.MasterRace.Players.Core.Car;

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
    public void keyPressed(int keyCode, char key) {
        final int speed = 3;
        if (keyCode == this.game.LEFT) {
            setDirectionSpeed(270, speed);
            setCurrentFrameIndex(0);
        }
        if (keyCode == this.game.UP) {
            setDirectionSpeed(0, speed);
        }
        if (keyCode == this.game.RIGHT) {
            System.out.println(getDirection());
            setDirectionSpeed(90, speed);
        }
        if (keyCode == this.game.DOWN) {
            setDirectionSpeed(180, speed);
        }
    }
}
