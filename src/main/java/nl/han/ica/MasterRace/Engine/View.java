package nl.han.ica.MasterRace.Engine;

import nl.han.ica.OOPDProcessingEngineHAN.Engine.GameEngine;

public class View {

    // Game game
    GameEngine engine;

    // Game View
    nl.han.ica.OOPDProcessingEngineHAN.View.View gameView;

    /**
     * Constructor view
     *
     * @param engine
     */
    public View(GameEngine engine){
        this.engine = engine;
    }


    public void setupViewPort(){
        gameView = new nl.han.ica.OOPDProcessingEngineHAN.View.View(1000, 1000);
        engine.setView(this.gameView);
    }

}
