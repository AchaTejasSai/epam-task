import java.util.Math;

public class SimpleCompoundInterest
{
   int principle;
   int interestRate;
   int time;
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