package com.lab11java401d3.songr;

import com.lab11java401d3.songr.controllers.IntroController;
import org.junit.Test;

import static org.junit.Assert.*;

public class IntroControllerTest {

    @Test
    public void getCapitalize() {
        IntroController capitalize = new IntroController();

        String results1 = capitalize.getCapitalize("hey you");
        assertEquals("HEY YOU", results1);

        String results2 = capitalize.getCapitalize("boop");
        assertEquals("BOOP", results2);

        String results3 = capitalize.getCapitalize("flowers");
        assertEquals("FLOWERS", results3);
    }
}