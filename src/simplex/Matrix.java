package simplex;

public class Matrix {
	//# of rows
	private int m;
	//# of columns
	private int n;
	//contents
	float[][] contents;
	//initiates a matrix (float)
	public Matrix(int m, int n, float[][] contents) {
		this.m = m;
		this.n = n;
		this.contents = contents;
	}
	//returns if the matrix is square
	public boolean isSquare() {
		return (this.m==this.n);
	}
	//setters
	public void setContents(float[][] contents) {
		this.contents = contents;
	}
	//getters
	public int getM() {
		return this.m;
	}
	public int getN() {
		return this.n;
	}
	public float[][] getContents() {
		return this.contents;
	}
	//to string
	public String toString() {
		String sep = " ";
		StringBuffer res = new StringBuffer();
		for (int i=0; i<this.m; i++) {
			for(int j=0; j<this.n;j++) {
				res.append(this.contents[i][j]);
				res.append(sep);
			}
			res.setLength(res.length() - sep.length());
			res.append("\n");
		}
		return res.toString();
	}
}
