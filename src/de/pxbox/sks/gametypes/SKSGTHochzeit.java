package de.pxbox.sks.gametypes;

import de.pxbox.sks.ISKSGame;

/**
 * Created by Yasin Raies on 09.05.2016.
 */
public class SKSGTHochzeit extends ASKSGT{
    @Override
    protected boolean isTypeValid(ISKSGame game) {
        //TODO
        return false;
    }

    @Override
    protected ConfigOption getTypeConfig() {
        return new ConfigOption(new int[]{2}, 1);
    }
}
