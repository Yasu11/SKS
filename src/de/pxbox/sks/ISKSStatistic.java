package de.pxbox.sks;

/**
 * Created by Yasin on 19.04.2016.
 */
public interface ISKSStatistic<P extends ISKSPersistence>{

    /**
     * @return the number of recorded games.
     */
    int getGames();

    /**
     * @param player the player to get the total games for
     * @return the total games played by player
     */
    int getGamesForPlayer(ISKSPlayer player);

    /**
     * @param type the type to count the total games for
     * @return the total games played of a certain type
     */
    int getGamesOfType(IGameType type);

    /**
     * @param type   the type to count the games for
     * @param player the player to count the games for
     * @return the number of games played of a certain type by a certain player
     */
    int getGamesOfTypeForPlayer(IGameType type, ISKSPlayer player);

    /**
     * @param player the player to get the won games for
     * @return the won games played by player
     */
    int getWonGamesForPlayer(ISKSPlayer player);

    /**
     * @param type   the type to count the won games for
     * @param player the player to count the won games for
     * @return the number of games played of a certain type by a certain player
     */
    int getWonGamesOfTypeForPlayer(IGameType type, ISKSPlayer player);
}
