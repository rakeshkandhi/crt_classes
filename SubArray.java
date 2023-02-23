package crt_classes;

import java.util.Arrays;

public class SubArray {

	public static void main(String[] args) {
		String[] best = { "ICIC", "SBI", "CITi", "YATRA", "HDFC", "CANARA" };
		String[] SBI_CARDS = new String[3];
//		System.arraycopy(best, 3, SBI_CARDS, 0, 2);
		System.arraycopy(best, 2, SBI_CARDS, 0, 3);
		System.out.println("original array :"+Arrays.toString(best));
		System.out.println("copy array :"+Arrays.toString(SBI_CARDS));
	}

}
