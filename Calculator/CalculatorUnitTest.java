/**
*
*
* Unit test cases for Calculator
*
*
*/

import static org.junit.jupiter.api.Assertions.*;

class CalculatorUnitTestCase{
    
    @org.junit.jupiter.api.Test
        
	public void testOperation() {
		Calculator c = new Calculator();
		assertEquals(5, c.Operation(3,2,"Addition"));
		assertEquals(52, c.Operation(32,20,"Subtraction"));
		assertEquals(68, c.Operation(34,2,"Multiplication"));
        assertEquals(19, c.Operation(38,2,"Division"));
	}
}