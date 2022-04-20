package simulations;

import java.util.Random;

public class NumericSims {
	
	static Random rand = new Random();
	
	public static double[] simulateVector(int n) {
		//double[] arr = new double[n];
		
		
		double[] arr = new double[n];
		
		for (int i = 0; i < n; i++) {
			 arr[i] = rand.nextDouble();
		}
		return arr; 
	}
	
	public static double[][] simulateMatrix2D(int n, int m){
		
		double[][] arr3 = new double[n][m]; 
		
		//Random rnd = new Random(); 
		
		for (int i = 0; i < n; i++) {
			for (int j =0; j<m; j++) {
				arr3[i][j] = rand.nextInt();
			}
		}
		
		return arr3; 
	}
	
	
}
