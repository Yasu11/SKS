package de.pxbox.sks.gametypes;

import java.util.Arrays;

/**
 * Created by Yasin Raies on 29.04.2016.
 */
public final class ConfigOption {

    private final int playerOptions;
    private final int[] winnerOptions;

    public ConfigOption(int[] winnerOptions, int playerOptions) throws IllegalArgumentException {
        if (winnerOptions == null)
            throw new IllegalArgumentException("winner and player options may not be null!");

        this.winnerOptions = winnerOptions;
        this.playerOptions = playerOptions;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        ConfigOption that = (ConfigOption) o;

        if (playerOptions != that.playerOptions) return false;
        return Arrays.equals(winnerOptions, that.winnerOptions);

    }

    @Override
    public int hashCode() {
        int result = playerOptions;
        result = 31 * result + Arrays.hashCode(winnerOptions);
        return result;
    }

    public int getPlayerOptions() {
        return playerOptions;
    }

    public int[] getWinnerOptions() {
        return winnerOptions;
    }
}
