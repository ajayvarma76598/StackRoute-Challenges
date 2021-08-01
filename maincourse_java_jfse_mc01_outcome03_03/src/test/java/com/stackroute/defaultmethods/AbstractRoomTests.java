package com.stackroute.defaultmethods;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class AbstractRoomTests {


    AbstractRoom abstractRoom;

    @BeforeEach
    void setUp() {
        abstractRoom = new Square("Yellow");
    }

    @Test
    public void setColourGetColour() {
        assertEquals("Yellow", abstractRoom.getColour());
    }


    @Test
    public void setColourGetColourFail() {
        assertNotEquals("Blue", abstractRoom.getColour());
    }

    @Test
    public void setColourWithSpecialCharAndNumericValueGetColourFail() {
        abstractRoom.setColour("Y5h%6jk");
        assertNotEquals("Blue", abstractRoom.getColour());
    }
}