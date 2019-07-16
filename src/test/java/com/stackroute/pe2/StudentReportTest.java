package com.stackroute.pe2;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class StudentReportTest {
   private StudentReport studentReport;
    @Before
    public void setUp() throws Exception {
        this.studentReport=new StudentReport();
    }

    @After
    public void tearDown() throws Exception {
        studentReport=null;
    }
    @Test
    public void givenIntegerShouldReturnTheMininumNumber(){
        String actualResult=studentReport.studentDataSender(30);
        assertEquals("minimun number",actualResult);
         /*when we give the value as 30 it gives the message as it is a minimum number*/
    }
    @Test
    public void givenStringShouldReturnTheMaximumNumber(){
        String actualResult=studentReport.studentDataSender(95);
        assertEquals("maximum number",actualResult);
    }
    /*when we give the value as 95 it gives the message as it is a maximum number*/

    @Test
    public void givenStringShouldReturnTheAverage(){
        String actualResult=studentReport.studentDataSender(65);
        assertEquals("Average of the number",actualResult);

    }
    /*when we give the value as 65 it gives the average of the numbers*/

    @Test
    public void givenNegativeNumberShouldReturnError(){
        String actualResult=studentReport.studentDataSender(-45);
        assertEquals("Number should not be negative",actualResult);

    }
    /*when we give the value as -45 it gives the message as number should not be negative*/

    @Test
    public void givenNumberMoreThan100ShouldReturnError(){
        String actualResult=studentReport.studentDataSender(150);
        assertEquals("Number should not be greater than 100",actualResult);

    }
     /*when we give the value as 150 it gives the message as number should not be greater than 100*/

    @Test
    public void givenZeroShouldReturnErrorMessage(){
        String actualResult=studentReport.studentDataSender(0);
        assertEquals("Error",actualResult);
    }
    /*when we give the value as 0 it gives the message as it is a error */

}