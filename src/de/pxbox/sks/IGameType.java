package de.pxbox.sks;

/**
 * Created by Yasin on 19.04.2016.
 */

public interface IGameType {

    /**
     * @param game the game to check Validity for.
     * @return true if Game is Valid, false if not.
     */
    boolean isValid(ISKSGame game);

    /**
     * @return the name of the Gametype
     */
    String getName();

}
