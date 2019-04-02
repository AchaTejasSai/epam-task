package epam-task3;

import java.util.*;
class Weights implements Comparator<Weights>{
	int key;
	int WeightChanged;
	public int compare(Weights w1,Weights w2){
		if(w2.WeightChanged == w1.WeightChanged){
			return w1.key - w2.key;
		}
		return w2.WeightChanged-w1.WeightChanged;
	}
	public String toString()
	{
		return ""+key;
	}
}
class DescendingWeights {
	
    public static void main(String []args){
        Scanner sc=new Scanner(System.in);
        int number=sc.nextInt();
        int k=sc.nextInt();
	ArrayList<Weights> al=new ArrayList<Weights>();
        for(int i=0;i<number;i++){
	    Weights w=new Weights();
            w.key=sc.nextInt();
            w.changed=(w.key)%k;
	    al.add(w);
        }
        sc.close();
	Collections.sort(al, new Weights());
        for(int i=0;i<number;i++){
        	System.out.print(al.get(i)+" ");
        }
    }
}

