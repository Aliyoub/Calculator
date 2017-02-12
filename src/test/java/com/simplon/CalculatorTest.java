package com.simplon;

/**
 * Created by aliyou on 12/02/17.
 */

import org.junit.*;

public class CalculatorTest {
    Calculator calculator = new Calculator();

    @Test
    public void testAddition() {
        Assert.assertEquals(calculator.addition(1,1), 2,0);
    }

    @Test
    public void testSubstraction() {
        Assert.assertEquals(calculator.substraction(2,1), 1,0);
    }

    @Test
    public void testDivide()  {
        Assert.assertEquals(calculator.divide(5,5), 1,0);
    }

    @Test (expected = IllegalArgumentException.class)
    public void testDividebyZero()  {
        calculator.divide(5,0);
    }
}
