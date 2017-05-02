package simplex;

import org.apache.commons.math3.linear.LUDecomposition;
import org.apache.commons.math3.linear.RealMatrix;

public class Simplex {
	//A matrix
	private RealMatrix A;
	//b vector
	private RealMatrix b;
	//costs
	private RealMatrix costs;
	
	
	//cbark
	public double cbark(int k) {
		
		return 0d;
	}
	//Abar
	public RealMatrix compABark(int k) {
		return b;
	}
	//bbar
	public RealMatrix compbBar() {
		return b;
	}	
	//zbar
	public RealMatrix compZbar() {
		return b;
	}
	//ybar
	public RealMatrix compYbar() {
		
		return b;
	}
	
	public RealMatrix compAinv() {
		RealMatrix aInv = new LUDecomposition(this.A).getSolver().getInverse();
		return aInv;
	}
}
