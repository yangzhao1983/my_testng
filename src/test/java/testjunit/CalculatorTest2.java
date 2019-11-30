package testjunit;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * Created by kaiser_zhao on 2019/10/15.
 */
public class CalculatorTest2 {

    @Test
    public void evaluatesExpression22() {
        Calculator calculator = new Calculator();
        int sum = calculator.evaluate("1+2+3");
        assertEquals(6, sum);
    }
}
