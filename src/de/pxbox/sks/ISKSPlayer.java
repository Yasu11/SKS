package de.pxbox.sks;

/**
 * Created by Yasin on 19.04.2016.
 */
public interface ISKSPlayer {

    /**
     * @return the Name of the player
     */
    String getName();

    /**
     * @return the ID of the player
     */
    int getID();

    /**
     * @param name the new name for this player
     */
    void setName(String name);
}
