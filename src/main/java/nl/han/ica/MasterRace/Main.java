package nl.han.ica.MasterRace;

import nl.han.ica.MasterRace.Engine.Game;
import processing.core.PApplet;

public class Main {

    /**
     * Constructor main
     *
     * @param args
     */
    public static void main(String[] args){
        // This
        PApplet.main(new String[]{Game.class.getName()});
        // Create engine
        new Game();
    }
}
