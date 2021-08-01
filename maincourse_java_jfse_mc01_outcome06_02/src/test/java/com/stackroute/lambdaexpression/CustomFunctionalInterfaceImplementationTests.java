package com.stackroute.lambdaexpression;
import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;
public class CustomFunctionalInterfaceImplementationTests {
private CustomFunctionalInterfaceImplementation customFunctionalInterfaceImplementation = new CustomFunctionalInterfaceImplementation();

    @Before
    public void setUp() throws Exception{
        System.out.println("Start Testing");
    }

    @Test
    public void cube1() {
        long result = customFunctionalInterfaceImplementation.cube.doJob(2);
          assertEquals(8,result);
    }

    @Test
    public void cube2() {
        long result = customFunctionalInterfaceImplementation.cube.doJob(0);
        assertEquals(0,result);
    }

    @Test
    public void cube3() {
        long result = customFunctionalInterfaceImplementation.cube.doJob(-2);
        assertEquals(-8,result);
    }

    @Test
    public void cube4() {
        long result = customFunctionalInterfaceImplementation.cube.doJob(1);
        assertEquals(1,result);
    }

    @Test
    public void changecase1() {
        String result = customFunctionalInterfaceImplementation.changecase.doJob("hello world");
        assertEquals("HELLO WORLD",result);
    }

    @Test
    public void changecase2() {
        String result = customFunctionalInterfaceImplementation.changecase.doJob(null);
        assertEquals(null,result);
    }

    @Test
    public void changecase3(){
        String result = customFunctionalInterfaceImplementation.changecase.doJob("");
        assertEquals("",result);
    }

    @Test
    public void changecase4() {
        String result = customFunctionalInterfaceImplementation.changecase.doJob("HeLlO wOrLd");
        assertEquals("hElLo WoRlD",result);
    }
}
