package de.pxbox.sks;

/**
 * Created by Yasin on 19.04.2016.
 */
public interface ISKSPersistence {

    public boolean putGame(ISKSGame game);

    public int getTotalNumOfGames();

    public boolean save();

    public boolean load();

}
