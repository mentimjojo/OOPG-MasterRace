package nl.han.ica.MasterRace.Players.Cars;

import nl.han.ica.MasterRace.Game;
import nl.han.ica.MasterRace.Players.Core.Car;

/**
 * Get default blue
 * @author T.Nijborg
 * @version 0.1
 */
public class DefaultOrange extends Car {

    public DefaultOrange(Game game) {
        // Set car
        super(game, "default_orange.png");
        // Set friction
        setFriction(0.05F);
    }

    @Override
    public void keyPressed(int keyCode, char key) {
        final int speed = 3;
        if (key == 'a') {
            setDirectionSpeed(270, speed);
            setCurrentFrameIndex(0);
        }
        if (key == 'w') {
            setDirectionSpeed(0, speed);
        }
        if (key == 'd') {
            System.out.println(getDirection());
            setDirectionSpeed(90, speed);
        }
        if (key == 's') {
            setDirectionSpeed(180, speed);
        }
    }
}
