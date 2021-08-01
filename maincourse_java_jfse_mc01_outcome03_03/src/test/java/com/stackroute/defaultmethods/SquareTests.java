package com.stackroute.defaultmethods;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotEquals;

public class SquareTests {
    Square square;

    @BeforeEach
    void setUp() {
        square = new Square("Red",5);
    }

    @Test
    void getAreaTest() {
        assertEquals(25.0, square.getArea(), 1e-1);
    }

    @Test
    void getPerimeterTest() {
        assertEquals(20.0, square.getPerimeter(), 1e-1);
    }

    @Test
    void getAreaFail() {
        assertNotEquals(31.0, square.getArea(), 1e-1);
    }

    @Test
    void getPerimeterFail() {
        assertNotEquals(22.0, square.getArea(), 1e-1);
    }

    @Test
    void toStringTest() {
        Square expected = new Square("Red",5);
        assertEquals(expected.toString(), square.toString());
    }
}