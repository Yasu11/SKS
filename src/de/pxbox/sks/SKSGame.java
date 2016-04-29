package de.pxbox.sks;

import de.pxbox.sks.gametypes.ASKSGT;

import java.util.List;

/**
 * Created by Yasin Raies on 20.04.2016.
 */
public class SKSGame<GT extends ASKSGT> implements ISKSGame<GT> {
    @Override
    public boolean isValid() {
        return false;
    }

    @Override
    public GT getGameType() {
        return null;
    }

    @Override
    public ISKSPlayer[] getPlayers() {
        return new ISKSPlayer[0];
    }

    @Override
    public ISKSPlayer getCaller() {
        return null;
    }

    @Override
    public ISKSPlayer getKnocked() {
        return null;
    }

    @Override
    public boolean hasKnocked() {
        return false;
    }

    @Override
    public ISKSPlayer[] getWinners() {
        return new ISKSPlayer[0];
    }

    @Override
    public void setPlayers(List<ISKSPlayer> players) {

    }

    @Override
    public void setCaller(ISKSPlayer caller) {

    }

    @Override
    public void setKnocked(ISKSPlayer knocker) {

    }

    @Override
    public void setWinners(List<ISKSPlayer> winners) {

    }
}
