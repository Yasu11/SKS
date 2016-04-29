package de.pxbox.sks;

import de.pxbox.sks.gametypes.ASKSGT;

import java.util.List;

/**
 * Created by Yasin on 19.04.2016.
 */
public interface ISKSGame<GT extends ASKSGT> {

    boolean isValid();

    /**
     * @return the game type of this round
     */
    GT getGameType();

    /**
     * @return the list of of players in this round
     */
    ISKSPlayer[] getPlayers();

    /**
     * @return the player who called
     */
    ISKSPlayer getCaller();

    /**
     * @return the player who has knocked
     */
    ISKSPlayer getKnocked();

    /**
     * @return true if someone has knocked, else false
     */
    boolean hasKnocked();

    /**
     * @return the players who won this game
     */
    ISKSPlayer[] getWinners();


    /**
     * @param players the list of of players in this round
     */
    void setPlayers(List<ISKSPlayer> players);

    /**
     * @param caller the player who called
     */
    void setCaller(ISKSPlayer caller);

    /**
     * @param knocker the player who has knocked
     */
    void setKnocked(ISKSPlayer knocker);

    /**
     * @param winners the players who won this game
     */
    void setWinners(List<ISKSPlayer> winners);

}
