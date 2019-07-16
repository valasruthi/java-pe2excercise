package com.stackroute.pe2;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class PowerTest {
    private Power power;
    @Before
    public void setUp() {
        this.power=new Power();
    }

    @After
    public void tearDown(){
        power=null;
    }
    @Test
    public void givenStringShouldReturnTrue(){
        String actualResult=power.fourRootChecker(4);
        assertEquals("256",actualResult);
    }
    @Test
    public void givenStringShouldReturnFalse(){
        String actualResult=power.fourRootChecker(6);
        assertNotEquals("266",actualResult);
    }
    @Test
    public void ShouldRecognizeANegativeNumber(){
        String actualResult=power.fourRootChecker(-16);
        assertEquals("Number should not be negative",actualResult);
    }
    @Test
    public void ShouldRecognizeAndReturnNotANumber(){
        String actualResult=power.fourRootChecker(-1_23);
        assertEquals("not a number",actualResult);
    }
}