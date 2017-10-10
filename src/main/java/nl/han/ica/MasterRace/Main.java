package nl.han.ica.MasterRace;

import nl.han.ica.MasterRace.Engine.Engine;
import processing.core.PApplet;

public class Main {

    /**
     * Constructor main
     *
     * @param args
     */
    public static void main(String[] args){
        // This
        PApplet.main(new String[]{Engine.class.getName()});
        // Create engine
        new Engine();
    }
}
