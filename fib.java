package crt_classes;

public class fib {

	public static int fibo(int n) {
		if(n == 1)
			return 1;
		if(n <= 0)
			return 0;
		return fibo(n-1)+fibo(n-2);
	}

	public static int fat(int fact) {
		int temp = 1;
		if (fact <= 0) {
			return 1;
		}
		temp = temp * fact;
		return temp * fat(fact - 1);
	}

	public static void main(String[] args) {
		for (int i = 0; i < 10; i++) {
			System.out.println(fibo(i));
		}
	}

}
