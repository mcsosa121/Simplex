package simplex;

import org.apache.commons.math3.linear.MatrixUtils;
import org.apache.commons.math3.linear.RealMatrix;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Hi");
		double[][] matrixData = { {1d,2d,3d}, {2d,5d,3d}};
		RealMatrix m = MatrixUtils.createRealMatrix(matrixData);
		
		double[][] matrixData2 = { {1d,2d},{2d,5d},{1d,7d}};
		//RealMatrix n = new Array2DRowRealMatrix(matrixData2);
		RealMatrix n = MatrixUtils.createRealMatrix(matrixData2);
		//multiplies m by n
		RealMatrix p = m.multiply(n);
		System.out.println(p.toString());
		
		double[][] matrixData3 = {{1d}, {2d},{3d}};
		RealMatrix g = MatrixUtils.createRealMatrix(matrixData3);
		
		System.out.println(p.getColumn(1));
		double[][] matrixTest = {p.getColumn(0), p.getColumn(1)};
		RealMatrix test = MatrixUtils.createRealMatrix(matrixTest);
		System.out.println(test.transpose());
	}

}
