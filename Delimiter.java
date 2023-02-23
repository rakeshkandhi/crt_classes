package crt_classes;

import java.util.Arrays;

class conv {
	public String arrayToString(String[] currencies, String delimiter) {
		String result = "";
		if (currencies.length > 0) {
			StringBuilder sb = new StringBuilder();
			for (String s : currencies) {
				sb.append(s).append(delimiter);
				result = sb.deleteCharAt(sb.length() - 1).toString()+" ";
			}
		}
		return result;
	}
}

public class Delimiter {
	public static void main(String args[]) {
		String[] currencies = { "USD", "INR", "AUD", "GBP" };
		conv c = new conv();
		System.out.println("Array is : "+Arrays.toString(currencies));
		String output = c.arrayToString(currencies, ",");
		System.out.println(output);
	}
}
