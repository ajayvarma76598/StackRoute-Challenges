package com.stackroute.commonjavaclasses;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import java.time.Period;
import static org.junit.jupiter.api.Assertions.*;
/* Write test cases for positive and negative scenarios*/
public class BankDepositTests {
    BankDeposit bankDeposit;
    @BeforeEach
    void setUp() {
        bankDeposit = new BankDeposit();
    }
    @Test
    void getMaturityDate1(){
        assertNotEquals("28-02-2012",bankDeposit.getMaturityDate("28-02-2012", Period.of(0,0, 5)));
    }
    @Test
    void getMaturityDate2(){
        assertEquals("04-03-2012",bankDeposit.getMaturityDate("28-02-2012", Period.ofDays(5)));
    }
    @Test
    void getMaturityDate3(){
        assertNotEquals("04-03-2012",bankDeposit.getMaturityDate("28-02-2012", Period.of(2 , 0, 0)));
    }
    @Test
    void getMaturityDate4(){
        assertEquals("27-02-2013",bankDeposit.getMaturityDate("28-02-2012", Period.ofDays(365)));
    }
    @Test
    void gerMaturityDate5(){
        assertEquals("02-05-2015",bankDeposit.getMaturityDate("04-12-2011", Period.ofDays(1245)));
    }
    @Test
    void getMaturityDate6() {
        String msg = "Please check your data you might have entered negative or null value.";
        assertEquals(msg, bankDeposit.getMaturityDate(null, null));
    }
    @Test
    void getMaturityDate7() {
        String msg = "Please check your data you might have entered negative or null value.";
        assertEquals(msg, bankDeposit.getMaturityDate("04-12-2011", Period.of(-2, -2, -0)));
    }
    @Test
    public void Investment() {
        String expected = bankDeposit.getInvestmentDuration("10-01-2020", "10-02-2020");
        String actual="0,1,0" ;
        assertEquals(expected,actual);
    }
    @Test
    public void Investment1() {
        String expected = bankDeposit.getInvestmentDuration("10-01-2020", "10-02-2020");
        String actual="0,2,0" ;
        assertNotEquals(expected,actual);
    }
    @Test
    public void Investment2(){
        String actual = bankDeposit.getInvestmentDuration("04-12-2011","02-05-2015");
        String expected = "3,4,28";
        assertEquals(expected,actual);
    }
    @Test
    public void Investment3(){
        assertThrows(NullPointerException.class,()->
                bankDeposit.getInvestmentDuration(null,null));
    }
}