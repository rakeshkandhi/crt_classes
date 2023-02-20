package crt_classes;

public class Recursive {

	public static int fibonnaciRecursive(int n) {
		if (n == 1)
			return 1;
		if (n <= 0)
			return 0;
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
		for (int i = 0; i < 10; i++) {
			System.out.println(fibonnaciRecursive(i));
		}
		System.out.println(fatorialRecursive(5));
	}
}
