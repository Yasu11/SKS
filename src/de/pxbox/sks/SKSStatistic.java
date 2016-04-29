package de.pxbox.sks;

import de.pxbox.sks.gametypes.ASKSGT;

/**
 * Created by Yasin Raies on 29.04.2016.
 */
public class SKSStatistic implements ISKSStatistic {
    ISKSPersistence persistence;

    @Override
    public void setPersistence(ISKSPersistence persistence) {
        this.persistence = persistence;
    }

    @Override
    public ISKSPersistence getPersistence() {
        return this.persistence;
    }

    @Override
    public int getGames() {
        return persistence.getTotalNumOfGames();
    }

    @Override
    public int getGamesForPlayer(ISKSPlayer player) {
        //TODO
        return 0;
    }

    @Override
    public int getGamesOfType(ASKSGT type) {
        //TODO
        return 0;
    }

    @Override
    public int getGamesOfTypeForPlayer(ASKSGT type, ISKSPlayer player) {
        //TODO
        return 0;
    }

    @Override
    public int getWonGamesForPlayer(ISKSPlayer player) {
        //TODO
        return 0;
    }

    @Override
    public int getWonGamesOfTypeForPlayer(ASKSGT type, ISKSPlayer player) {
        //TODO
        return 0;
    }
}
