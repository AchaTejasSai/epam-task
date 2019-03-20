/**
 * The program estimates cost of the house
 * depending on the material used and 
 * area of the house and other features like automation
 * @author Acha Tejas Sai
 *
 */
public class CostEstimator {
	
    char materialType;
	double areaOfHouse;
	boolean isAutomated;
	
	/*
	 * constructor for the CostEstimator class 
	 * job is to initialize class data
	 * @param materialType
	 * @param areaOfHouse
	 * @param isAutomated
	 */
	
    public CostEstimator(char materialType,double areaOfHouse,boolean isAutomated) {
		this.areaOfHouse=areaOfHouse;
		this.materialType=materialType;
		this.isAutomated=isAutomated;
	}
	
	/*
	 * function to calculate the cost of the house
	 * depending on the class instance data
	 * @return double cost of the house
	 */
    
	public double findCost() {
		int cost = 0;
		if(materialType=='A')
			cost = 1200;
		else if(materialType=='B')
			cost = 1500;
		else if(materialType=='C')
			cost = 1800;
		else if(materialType=='C' && isAutomated)
			cost = 2500;
		 
		return areaOfHouse*cost;
	}
}