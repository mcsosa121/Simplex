package simplex;

public class Simplex {
	public static void main(String[] sa) {
		float[][] dog = new float[3][2];
		for(int i = 0; i<3;i++) {
			for(int j = 0; j<2; j++) {
				dog[i][j] = j;
				//System.out.print(dog[i][j]+" ");
			}
			//System.out.println();
		}
		Matrix m = new Matrix(3,2,dog);
		System.out.println(m.toString());
		//openHome();
	}
	
	static void openHome() {
		HomeFrame homepage = new HomeFrame();
		homepage.setVisible(true);
	}
}
