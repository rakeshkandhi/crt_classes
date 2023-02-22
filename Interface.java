package crt_classes;

import java.util.Arrays;

interface Bnk {
	float rateofIntrest();
}

class PNB implements Bnk {
	public float rateofIntrest() {
		return 9.15f;
	}
}

class Sc implements Bnk {
	public float rateofIntrest() {
		return 7.4f;
	}
}

public class Interface {
	public static void print2d() {
		int[][] cubes = { { 1, 1 }, { 2, 2 }, { 3, 3 } };
		System.out.println(Arrays.deepToString(cubes));
	}

	public static void main(String[] args) {
//		Bnk b;
//		b = new PNB();
//		System.out.println("ROI :- " + b.rateofIntrest());
//		b = new Sc();
//		System.out.println("ROI :- " + b.rateofIntrest());
		print2d();
	}
}
