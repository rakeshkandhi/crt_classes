package crt_classes;

import java.util.Arrays;
import java.util.Collections;

public class ArrayDemo {
	public static void main(String[] args) {
		Integer[] prime = { 7, 11, 19, 13, 17, 2, 3, 5 };
//		System.out.println(Arrays.toString(primes));
		int i;
//		int j,k;
//		Arrays.sort(primes, Collections.reverseOrder());
//		System.out.println(Arrays.toString(primes));
		Arrays.sort(prime);
		System.out.println(Arrays.toString(prime));
		for  (i =prime.length-1;i>0;i--)
			System.out.println(prime[i]);

//		int [][] a = {{1,2,3},{1,2,3},{1,2,3}};
//		int [][] b = {{1,2,3},{1,2,3},{1,2,3}};
//		int [][] c = new int[3][3];
//		for (i =0;i<3;i++) {
//			for(j=0;j<3;j++) {
//				c[i][j]=0;
//				for(k=0;k<3;k++) {
//					c[i][j] += a[i][k] * b[k][j];
//				}
//				System.out.print(c[i][j]+" ");
//			}
//			System.out.println();
//		}
		String s[] = { "apple", "banana", "mango" };
		Arrays.sort(s, Collections.reverseOrder());
		System.out.println(Arrays.toString(s));
	}
}