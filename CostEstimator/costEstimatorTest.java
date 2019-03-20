/**
 * 
 * @author Acha Tejas Sai
 *
 */

import static org.junit.jupiter.api.Assertions.*;

class CostEstimatorTest {

	@Test
	public void TestCostEstimator() {
		CostEstimator ce;
		ce = new CostEstimator('A', 300, false);
		assertEquals(360000.0, ce.findCost());
		ce = new CostEstimator('B', 360.123, false);
		assertEquals(540184.5, ce.findCost());
		ce = new CostEstimator('C', 350, true);
		assertEquals(875000.0, ce.findCost());
		ce = new CostEstimator('C', 400, false);
		assertEquals(720000.0, ce.findCost());
		
	}

}