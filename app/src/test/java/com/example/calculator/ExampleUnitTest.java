package com.example.calculator;

import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Example local unit test, which will execute on the development machine (host).
 *
 * @see <a href="http://d.android.com/tools/testing">Testing documentation</a>
 */
public class ExampleUnitTest {
    @Test
    public void addition_isCorrect() {
        assertEquals(4, 2 + 2);
    }

    @Test
    public void Test_Result(){
        MainActivity ma = new MainActivity(); //Declaring what Activity to test
        Double equa = ma.computeAnother("2/2"); //Assuming equation was "2/2" sent to function computeAnother in MainActivity
        assertEquals("not real answer",1,equa,0.0); //checking if answer expected matched actual answer returned by function
    }

}