package crt_classes;

import java.util.Arrays;

public class ArrayDemo {
	public static void main(String[] args) {
//		int[] primes = { 2, 3, 5, 7, 11, 13, 17, 19 };
//		System.out.println(Arrays.toString
//				(primes));
//		int i = 0;
//		while (i < primes.length) {
//			System.out.println(primes[i]);
//			i++;
//		}
		int [][] a = {{1,2,3},{1,2,3},{1,2,3}};
		int [][] b = {{1,2,3},{1,2,3},{1,2,3}};
		int [][] c = new int[3][3];
		for (int i =0;i<3;i++) {
			for(int j=0;j<3;j++) {
				c[i][j]=0;
				for(int k=0;k<3;k++) {
					c[i][j] += a[i][k] * b[k][j];
				}
				System.out.print(c[i][j]+" ");
			}
			System.out.println();
		}
	}
}