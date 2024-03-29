package matrixoperations;

import java.util.Arrays;
import simulations.NumericSims;

public class MatrixArithmetic {
	
	public static double[][] matrixAddition(double[][] a, double[][] b){
		
		double[][] sum = new double[a.length][a[0].length]; 
		for (int i = 0; i < a.length; i++) {
			for(int j = 0; j < a[0].length; j++) {
				sum[i][j] = a[i][j] + b[i][j];
			}
		}
		return sum; 
	}
	
	public static void main(String[] args) {
		
		/*
		double[] arr1; 
		double[] arr2; 
		
		arr1 = NumericSims.simulateVector(5);		
		arr2 = NumericSims.simulateVector(5);
		
		
		
		System.out.println("The first matrix: ");
		for (int i = 0; i<5; i++) {
			System.out.println(arr1[i]);
		}
		
		System.out.println("The second matrix: ");
		for (int i = 0; i < 5; i++) {
			System.out.println(arr2[i]);
			
		} */
		
		double[][] arr3 = NumericSims.simulateMatrix2D(3, 3);
		double[][] arr4 = NumericSims.simulateMatrix2D(3, 3);
		
		double[][] arr5 = matrixAddition(arr3, arr4);
		
		for (double[] a  : arr5) {
			System.out.println(Arrays.toString(a));
		}
	}

	
}
