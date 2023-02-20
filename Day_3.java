package crt_classes;

import java.util.Scanner;

public class Day_3 {
	public static void main(String[] args) {
		double n=60.89d;
		int a =(int)n;
		System.out.println(a);
		//Widening Conversion
		char ch='i';
		int p=ch;
		System.out.println(p);
		 Scanner sc=new Scanner(System.in);
		 System.out.println("Enter an Integer Value:");
		 int i=sc.nextInt();
		 char c=(char)i;
		 System.out.println(c);
		 sc.close();
		 
	}
}