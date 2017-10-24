package nl.han.ica.MasterRace.Players.Core;

/**
 * @author T.Nijborg
 * @version 0.1
 */
public class Keys {

    /**
     * The pressed key
     */
    private char key;

    /**
     * The key code
     */
    private int keyCode;

    /**
     * Boolean pressed
     */
    private boolean pressed;

    /**
     * Construct key
     * @param key key pressed
     */
    public Keys(char key, int keyCode){
        // This key
        this.key = key;
        // Key code
        this.keyCode = keyCode;
    }

    /**
     * Get key
     * @return get key
     */
    public char getKey(){
        return this.key;
    }

    /**
     * Get key code
     * @return keyCode
     */
    public int getKeyCode() { return this.keyCode; }

    /**
     * Set pressed
     * @param pressed boolean pressed
     */
    public void setPressed(boolean pressed){
        this.pressed = pressed;
    }

    /**
     * Get pressed
     * @return boolean pressed
     */
    public boolean getPressed(){
        return this.pressed;
    }

}
