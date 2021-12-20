package com.example.calculatorapp;

import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Example local unit test, which will execute on the development machine (host).
 *
 * @see <a href="http://d.android.com/tools/testing">Testing documentation</a>
 */
public class ExampleUnitTest {
    @Test
    public void Test01GetResult() {
        String inputString = "3+3";
        double expectedValue = 6;
        double actualValue = MainActivity.getResult(inputString);

        assertEquals(expectedValue,actualValue, 0);
    }
    @Test(expected = NullPointerException.class)
    public void Test02GetResult() {
        String inputString = null;
        double expectedValue = -1;
        double actualValue = MainActivity.getResult(inputString);

        assertEquals(expectedValue,actualValue, 0);
    }
    @Test
    public void Test03GetResult() {
        String inputString = "";
        String expectedValue = "NaN";
        String actualValue = String.valueOf(MainActivity.getResult(inputString));

        assertEquals(expectedValue,actualValue);
    }
    @Test
    public void Test04GetResult() {
        String inputString = "              ";
        String expectedValue = "NaN";
        String actualValue = String.valueOf(MainActivity.getResult(inputString));

        assertEquals(expectedValue,actualValue);
    }
    @Test
    public void Test05GetResult() {
        String inputString = "asd";
        String expectedValue = "NaN";
        String actualValue = String.valueOf(MainActivity.getResult(inputString));

        assertEquals(expectedValue,actualValue);
    }
    @Test
    public void Test06GetResult() {
        String inputString = "$%#^";
        String expectedValue = "NaN";
        String actualValue = String.valueOf(MainActivity.getResult(inputString));

        assertEquals(expectedValue,actualValue);
    }
    @Test
    public void Test07GetResult() {
        String inputString = "3/0";
        String expectedValue = "NaN";
        String actualValue = String.valueOf(MainActivity.getResult(inputString));

        assertEquals(expectedValue,actualValue);
    }
}