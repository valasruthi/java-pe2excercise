package com.stackroute.pe2;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class WordFrequencyTest {
  private WordFrequency wordFrequency;
    @Before
    public void setUp() throws Exception {
        this.wordFrequency=new WordFrequency();
    }

    @After
    public void tearDown() throws Exception {
        wordFrequency=null;
    }

    @Test
    public void givenFileShouldReturnWordFrequency() {
      String actualResult=wordFrequency.frequencyReader("file.txt");
      assertEquals("Content of the file",actualResult);

    }
    /*we will give the file with extension this should return the content which is present inside the file*/
}