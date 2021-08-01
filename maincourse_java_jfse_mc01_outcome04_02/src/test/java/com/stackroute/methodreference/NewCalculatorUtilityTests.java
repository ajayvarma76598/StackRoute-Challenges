package com.stackroute.methodreference;


import org.junit.Before;
import org.junit.jupiter.api.Test;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotEquals;

/* Write test cases for positive and negative scenarios*/
public class NewCalculatorUtilityTests {
private NewCalculatorUtility newCalculatorUtility = new NewCalculatorUtility();

    @Before
    public void setup() throws Exception{
        System.out.println("start testing");
    }

    @Test
    public void product() {
        assertEquals(12.0,newCalculatorUtility.getProductResult(3,4),1e-1);
        assertEquals(-42.0,newCalculatorUtility.getProductResult(-7,6),1e-1);
        assertEquals(0.0,newCalculatorUtility.getProductResult(12,0),1e-1);
        assertEquals(54.0,newCalculatorUtility.getProductResult(-9,-6),1e-1);
    }

    @Test
    void power() {
        assertEquals(81.0,newCalculatorUtility.getPowerResult(3,4),1e-1);
        assertEquals(-8.0,newCalculatorUtility.getPowerResult(-2,3),1e-1);
        assertEquals(0.0625,newCalculatorUtility.getPowerResult(2,-4),1e-1);
        assertEquals(-0.008,newCalculatorUtility.getPowerResult(-5,-3),1e-1);
    }
}
