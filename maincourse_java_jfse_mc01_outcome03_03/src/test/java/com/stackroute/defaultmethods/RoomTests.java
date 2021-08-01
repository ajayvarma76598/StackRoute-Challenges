package com.stackroute.defaultmethods;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotEquals;

public class RoomTests {

    Room room;

    @BeforeEach
    void setUp() {
        room = new Square(2);
    }

    @Test
    void getArea() {
        assertEquals(4.0, room.getArea(), 1e-1);
    }

    @Test
    void getPerimeter() {
        assertEquals(4.0, room.getArea(), 1e-1);
    }
}