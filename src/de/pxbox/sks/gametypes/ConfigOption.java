package de.pxbox.sks.gametypes;

import java.util.Arrays;

/**
 * Created by Yasin Raies on 29.04.2016.
 */
public final class ConfigOption {

    private final boolean knockable;
    private final boolean callable;
    private final int[] playerOptions;
    private final int[] winnerOptions;

    public ConfigOption(int[] winnerOptions, int[] playerOptions, boolean callable, boolean knockable) throws IllegalArgumentException {
        if (winnerOptions == null || playerOptions == null)
            throw new IllegalArgumentException("winner and player options may not be null!");

        this.winnerOptions = winnerOptions;
        this.playerOptions = playerOptions;
        this.callable = callable;
        this.knockable = knockable;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        ConfigOption that = (ConfigOption) o;

        if (knockable != that.knockable) return false;
        if (callable != that.callable) return false;
        if (!Arrays.equals(playerOptions, that.playerOptions)) return false;
        return Arrays.equals(winnerOptions, that.winnerOptions);

    }

    @Override
    public int hashCode() {
        int result = (knockable ? 1 : 0);
        result = 31 * result + (callable ? 1 : 0);
        result = 31 * result + Arrays.hashCode(playerOptions);
        result = 31 * result + Arrays.hashCode(winnerOptions);
        return result;
    }

    public boolean isKnockable() {
        return knockable;
    }

    public boolean isCallable() {
        return callable;
    }

    public int[] getPlayerOptions() {
        return playerOptions;
    }

    public int[] getWinnerOptions() {
        return winnerOptions;
    }
}
