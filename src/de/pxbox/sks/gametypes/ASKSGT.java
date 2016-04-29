package de.pxbox.sks.gametypes;

import de.pxbox.sks.ISKSGame;

/**
 * Created by Yasin on 19.04.2016.
 */

public abstract class ASKSGT {

    String name;
    ConfigOption option;

    /**
     * @param game the game to check validity for
     * @return true if Game is Valid, false if not.
     */
    public final boolean isValid(ISKSGame game) {
        if (isStandardValid(game))
            if (isTypeValid(game))
                return true;
        return false;
    }

    /**
     * Checks game, players or winners for null as well as players.length == 4
     *
     * @param game the game to check general validity for
     * @return
     */
    final boolean isStandardValid(ISKSGame game) {
        if (game == null)
            return false;
        if (game.getPlayers() == null)
            return false;
        if (game.getWinners() == null)
            return false;
        if (game.getWinners().length != 4)
            return false;

        return true;
    }

    /**
     * @param game the game to check type-specific validity for
     * @return true if Game is Valid, false if not.
     */
    protected abstract boolean isTypeValid(ISKSGame game);

    protected abstract ConfigOption getTypeConfig();

    public ConfigOption getConfigOptions() {
        return option;
    }

    /**
     * @return the name of the Gametype
     */
    String getName() {
        return name;
    }


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        ASKSGT asksgt = (ASKSGT) o;

        return name != null ? name.equals(asksgt.name) : asksgt.name == null;

    }

    @Override
    public int hashCode() {
        return name != null ? name.hashCode() : 0;
    }
}
