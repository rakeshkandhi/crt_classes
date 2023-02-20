package crt_classes;

import java.util.Scanner;

public class Recursive {

	public static int fibonnaciRecursive(int n) {
		if (n <= 1)
			return 1;
		return fibonnaciRecursive(n - 1) + fibonnaciRecursive(n - 2);
	}

	public static int fatorialRecursive(int fact) {
		int temp = 1;
		if (fact <= 0) {
			return 1;
		}
		temp = temp * fact;
		return temp * fatorialRecursive(fact - 1);
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the choice:");
		System.out.println("1:Fibbonnaci\n2:Factorial");
		int choice = sc.nextInt();
		switch (choice) {
		case 1:
			System.out.println("fibonacci range:");
			int f = sc.nextInt();
			for (int i = 0; i < f; i++) {
				System.out.println(fibonnaciRecursive(i));
			}
			break;
		case 2:
			System.out.println("Enter the number:");
			int ft = sc.nextInt();
			System.out.println("The factirial of 5 is " + fatorialRecursive(ft));
			break;
		default:
			System.out.println("Enter the correct choice");
		}
		sc.close();
	}
}
