package com.stackroute.defaultmethods;

/*
    Room Interface defines the default methods to be implemented by all classes of type Room
 */
public interface Room {
    default double getPerimeter() {
        return 0.0;
    }
    default double getArea(){
        return 0.0;
    }
}

