package hw3;

public class javahw3 {
	
	public static void main(String[] args) {
		double x[][] = new double[3][3];
		double y[][] = new double[3][3];
		double z[][] = new double[3][3];
		System.out.println("git測試JAVA很好玩");
		for (int i = 0; i < x.length; i++) {
			for (int j = 0; j < x[i].length; j++) {
				x[i][j] = (int) (Math.random() * 31);
				System.out.print("x" + x[i][j] + "\t");
			}
			System.out.println();
		}
		System.out.print("=====================\n");
		for (int i = 0; i < y.length; i++) {
			for (int j = 0; j < y[i].length; j++) {
				y[i][j] = (int) (Math.random() * 31);
				System.out.print("y" + y[i][j] + "\t");
			}
			System.out.println();

		}
		System.out.print("=====================\n");
		for (int i = 0; i < z.length; i++) {
			for (int j = 0; j < z[i].length; j++) {
				z[i][j] = x[i][j] + y[i][j];
				System.out.print("z" + z[i][j] + "\t");
			}
			System.out.println();
		}
	}

}
