package com.stackroute.defaultmethods;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotEquals;

public class RectangleTests {

    Rectangle rectangle;

    @BeforeEach
    void setUp() {
        rectangle = new Rectangle("Green",50,60);
    }

    @Test
    void setLengthGetLength() {
        rectangle.setLength(12);
        assertEquals(12, rectangle.getLength());
    }

    @Test
    void setBreadthGetBreadth() {
        rectangle.setLength(40);
        assertEquals(40, rectangle.getLength());
    }

    @Test
    void getArea() {
        assertEquals(3000.0, rectangle.getArea(), 1e-1);
    }

    @Test
    void getPerimeter() {
        assertEquals(220.0, rectangle.getPerimeter(), 1e-1);
    }

    @Test
    void getAreaFail() {
        assertNotEquals(3111.0, rectangle.getArea(), 1e-1);
    }

    @Test
    void getPerimeterFail() {
        assertNotEquals(224.0, rectangle.getArea(), 1e-1);
    }

    @Test
    void toStringTest() {
        Rectangle expected = new Rectangle("Green",50,60);
        assertEquals(expected.toString(), rectangle.toString());
    }

}