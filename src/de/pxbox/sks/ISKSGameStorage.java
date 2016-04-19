package de.pxbox.sks;

import java.util.List;

/**
 * Created by Yasin on 19.04.2016.
 */
public interface ISKSGameStorage {

    /**
     * @return a list of all players with a record
     */
    List<ISKSPlayer> getPlayers();

    /**
     * @return a list of all recorded games
     */
    List<ISKSGame> getGames();

    /**
     * Delete everything in storage
     */
    void dropData();

    /**
     * Note: This will influence statistics and records of other players
     *
     * @param player the player to drop all data for
     */
    void dropEntry(ISKSPlayer player);

    /**
     * @param game the game to drop from storage
     */
    void dropEntry(ISKSGame game);

    /**
     * Note: unknown players will be created
     *
     * @param game the game to store
     */
    void putEntry(ISKSGame game);

}
