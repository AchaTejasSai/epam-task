/**
 * 
 * @author Acha Tejas Sai
 *
 */
import java.util.Math;

import static org.junit.Assert.*;

import org.junit.Test;

public class SimpleCompoundInterest
{
   int principle;
   int interestRate;
   int time;
	@Test
    public SimpleCompoundInterest(int principle,int interestRate,int time)
  {
        this.principle = principle;
        this.interestRate=interestRate;
        this.time = time;
  }
    public double SimpleInterest()
    { 
	   return principle*interestRate*time/100;
    }
    public double CompoundInterest()
    { 
	return principle *(Math.pow((1 + interestRate / 100),time));  
    }
    
}
