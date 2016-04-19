package de.pxbox.sks;

/**
 * Created by Yasin on 19.04.2016.
 */
public class SKSPlayer implements ISKSPlayer {

    String name;
    final int id;

    public SKSPlayer(int id, String name){
        this.id = id;
        this.name = name;
    }

    /**
     * @return the Name of the player
     */
    @Override
    public String getName() {
        return name;
    }

    /**
     * @return the ID of the player
     */
    @Override
    public int getID() {
        return id;
    }

    /**
     * @param name the new name for this player
     */
    @Override
    public void setName(String name) {
        this.name = name;
    }
}
