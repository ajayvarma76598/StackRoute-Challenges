package com.stackroute.defaultmethods;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotEquals;

public class RoomServiceTests {

    RoomService roomService;

    @BeforeEach
    void setUp() {
        roomService = new RoomService();
    }

    @Test
    void createSquareTest() {
        Square expected = new Square("Black", 8);
        assertEquals(expected.toString(), roomService.createSquare("Black", 8).toString());
    }

    @Test
    void createRectangleTest() {
        Rectangle expected = new Rectangle("Pink", 12, 50);
        assertEquals(expected.toString(), roomService.createRectangle("Pink", 12, 50).toString());
    }

    @Test
    void compareRoom() {
        assertEquals(-1, RoomService.compareRoomArea(new Square(12), new Rectangle(12,13)));
    }

    @Test
    void getRoomSummarySquare() {
        Room expected = new Square("Yellow",2);
        assertEquals(expected.toString(), RoomService.getRoomSummary(new Square("Yellow", 2)));
    }

    @Test
    void getRoomSummaryRectangle() {
        Room expected = new Rectangle("Pink", 2, 4);
        assertEquals(expected.toString(), RoomService.getRoomSummary(new Rectangle("Pink", 2, 4)));
    }

    @Test
    void compareRoomFail() {
        assertNotEquals(1, RoomService.compareRoomArea(new Square(12), new Square(13)));
    }

    @Test
    void getRoomSummaryRectangleFail() {
        Room unExpected = new Rectangle("Green", 2, 4);
        assertNotEquals(unExpected.toString(), RoomService.getRoomSummary(new Rectangle("Pink", 2, 4)));
    }

    @AfterEach
    void tearDown() {
        //tearDown
    }
}