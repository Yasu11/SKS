package de.pxbox.sks.gametypes;

import de.pxbox.sks.ISKSGame;

/**
 * Created by Yasin Raies on 11.05.2016.
 */
public class SKSGTGeier extends ASKSGT {
    @Override
    protected boolean isTypeValid(ISKSGame game) {
        return false;
    }

    @Override
    protected ConfigOption getTypeConfig() {
        return null;
    }
}
