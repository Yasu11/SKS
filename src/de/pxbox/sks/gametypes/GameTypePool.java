package de.pxbox.sks.gametypes;

import java.util.HashMap;

/**
 * Created by Yasin Raies on 20.04.2016.
 */
public class GameTypePool {

    private static GameTypePool singlePool = new GameTypePool();

    static {
    }

    private GameTypePool() {
        this.pool = new HashMap<>();
    }

    private HashMap<String, ASKSGT> pool;

    ASKSGT getGameType(String name) {
        return pool.get(name);
    }

    void putGameType(ASKSGT gameType) {
        this.pool.put(gameType.getName(), gameType);
    }

}
