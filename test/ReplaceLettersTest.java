package com.stackroute;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class ReplaceLettersTest {

    ReplaceLetters obj;
    @Before
    public void setUp() throws Exception {
        ReplaceLetters obj = new ReplaceLetters();
    }

    @After
    public void tearDown() throws Exception {
        obj = null;
    }

    @Test
    public void replaceLtr() {
        assertEquals("fatly fry",obj.replaceLtr("daily dry"));
        assertEquals("fff tttt",obj.replaceLtr("dfd itit"));
        assertEquals("",obj.replaceLtr(""));
        assertNotEquals("ftd",obj.replaceLtr("dfd"));
        assertEquals("ftff",obj.replaceLtr("difd"));
    }
}
