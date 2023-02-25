package crt_classes;

import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

public class ArrayDemo {
	public static void ArrayCopy() {
		byte[] a = { 65, 66, 67, 68, 69, 70 };
		byte[] b = { 71, 72, 73, 74, 75, 76 };
		System.arraycopy(a, 2, b, 1, a.length - 2);
	}

	public static void reverse(String primes[]) {
		System.out.println("Original Array\n" + Arrays.toString(primes));
		Arrays.sort(primes, Collections.reverseOrder());
		System.out.println(Arrays.toString(primes));
	}

	public static void Compare() {
		char a[] = { 'a', '5', 'A', ' ' };
		System.out.print(Character.isDigit(a[0])+" ");
		System.out.print(Character.isWhitespace(a[3])+" ");
		System.out.println(Character.isUpperCase(a[2]));
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int choice = 0;
		while (choice != 4) {
			System.out.println("1: Array copy\n2: Reverse array\n3: Compare array\n4: Exit\nEnter the choice");
			choice = sc.nextInt();
			switch (choice) {
			case 1:
				ArrayCopy();
				break;
			case 2:
				System.out.println("Enter the number of array elements:");
				int n = sc.nextInt();
				String[] prime = new String[n];
				for (int i = 0; i < n; i++) {
					System.out.printf("Enter the %d element", i);
					prime[i] = sc.next();
				}
				reverse(prime);
			case 3:
				Compare();
				break;
			case 4:
				System.out.println("Exit!!!");
				System.exit(0);
			default:
				System.out.println("Please enter the correct choice!!");
				break;
			}
		}
		sc.close();
	}
}