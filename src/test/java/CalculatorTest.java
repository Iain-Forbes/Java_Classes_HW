import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class CalculatorTest {

    @Test
    public void calCanAdd(){
        Calculator calculator = new Calculator(2, 2);
        assertEquals(4, calculator.addition(2,2));
    }

    @Test
    public void calCanSubtract(){
        Calculator calculator = new Calculator(2, 4);
        assertEquals(-2, calculator.subtract(2,4));
    }

    @Test
    public void calCanMultiply(){
        Calculator calculator = new Calculator(10, 10);
        assertEquals(100, calculator.multiply(10,10));
    }

    @Test
    public void calCanDivide(){
        Calculator calculator = new Calculator(10, 5);
        assertEquals(2, calculator.divide(10, 5), 0.00);
    }


}
