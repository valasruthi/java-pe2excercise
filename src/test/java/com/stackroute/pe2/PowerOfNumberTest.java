package com.stackroute.pe2;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class PowerOfNumberTest {
    private PowerOfNumberTest powerOfNumberTest;
    @Before
    public void setUp() {
        this.powerOfNumberTest=new PowerOfNumberTest();
    }

    @After
    public void tearDown(){
        powerOfNumberTest=null;
    }
    @Test
    public void givenStringShouldReturnTrue(){
        String actualResult=powerOfNumberTest.fourRootChecker(256);
        assertEquals("this is a power of 4",actualResult);
        /*the given string will give the message as the number is the power of 4*/
    }
    @Test
    public void givenStringShouldReturnFalse(){
        String actualResult=powerOfNumberTest.fourRootChecker(223);
        assertNotEquals("number is not the power of 4",actualResult);
        /*given string will return false message because it is not the power of 4*/
    }
    @Test
    public void ShouldRecognizeANegativeNumber(){
        String actualResult=powerOfNumberTest.fourRootChecker(-16);
        assertEquals("Number should not be negative",actualResult);
    }
    /*Given string will give a message as number should not be negative*/
    @Test
    public void ShouldRecognizeAndReturnNotANumber(){
        String actualResult=powerOfNumberTest.fourRootChecker(-1_23);
        assertEquals("not a number",actualResult);
    }
     /*Given string will give a message as not anumber because it cannot take -1_23 value*/
}