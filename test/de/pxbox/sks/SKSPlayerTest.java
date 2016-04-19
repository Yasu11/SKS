package de.pxbox.sks;

import junit.framework.TestCase;

/**
 * Created by Yasin on 19.04.2016.
 */
public class SKSPlayerTest extends TestCase {
    public void testGetName() throws Exception {
        SKSPlayer p = new SKSPlayer(1876,"RandomGuy");
        assertEquals("RandomGuy", p.getName());
    }

    public void testGetID() throws Exception {
        SKSPlayer p = new SKSPlayer(1876,"RandomGuy");
        assertEquals(1876, p.getID());
    }

    public void testSetName() throws Exception {
        SKSPlayer p = new SKSPlayer(1876,"RandomGuy");
        assertEquals("RandomGuy", p.getName());
        p.setName("RandomGuy2");
        assertEquals("RandomGuy2", p.getName());
        p.setName(null);
        assertNotNull(p.getName());
    }
}