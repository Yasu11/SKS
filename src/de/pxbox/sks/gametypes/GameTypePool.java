package de.pxbox.sks.gametypes;

import java.util.HashMap;
import java.util.Set;

/**
 * Created by Yasin Raies on 20.04.2016.
 */
public class GameTypePool {

    private static GameTypePool singlePool = new GameTypePool();

    static {
        GameTypePool.singlePool = new GameTypePool();
        singlePool.putGameType(new SKSGTRuf());
        singlePool.putGameType(new SKSGTHochzeit());
        singlePool.putGameType(new SKSGTKreuz());
        singlePool.putGameType(new SKSGTRamsch());
        singlePool.putGameType(new SKSGTWenz());
        singlePool.putGameType(new SKSGTGeier());
        singlePool.putGameType(new SKSGTSoloHerz());
        singlePool.putGameType(new SKSGTSoloBlatt());
        singlePool.putGameType(new SKSGTSoloSchell());
        singlePool.putGameType(new SKSGTSoloEichel());
    }

    private GameTypePool() {
        this.pool = new HashMap<>();
    }

    private HashMap<String, ASKSGT> pool;

    ASKSGT getGameType(String name) {
        return pool.get(name);
    }

    Set<String> getNames() {
        return pool.keySet();
    }

    void putGameType(ASKSGT gameType) {
        this.pool.put(gameType.getName(), gameType);
    }

}
