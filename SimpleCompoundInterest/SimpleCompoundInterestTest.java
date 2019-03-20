/**
 * 
 * @author Acha Tejas Sai
 *
 */
 
 public class SimpleCompoundInterestUnitTestCase
 {
	 
	@Test
	public void UnitTestCaseSimpleInterest() {
		SimpleCompoundInterest simplecompoundinterest;
		 simpleInterest = new SimpleCompoundInterest(30301, 2.5f, 3);
		assertEquals(2272.58, simpleInterest.SimpleInterest());
		simpleInterest = new SimpleCompoundInterest(56890, 1.7f, 6);
		assertEquals(5802.78, simpleInterest.SimpleInterest());
	}
	@Test
	void UnitTestCaseCompoundIntrest() {
		SimpleCompoundInterest compoundInterest;
		compoundInterest = new SimpleCompoundInterest(10000, 2.5f, 3);
		assertEquals(10768.91, compoundInterest.CompoundInterest());
		compoundInterest = new SimpleCompoundInterest(20000, 3.7f, 5);
		assertEquals(23984.12, compoundInterest.CompoundInterest());
	}
 }