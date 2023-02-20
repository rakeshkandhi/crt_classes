package crt_classes;

import java.util.Scanner;

public class Day_2 {
	public static void main(String[] args) {
		String name;
		char a;
		int sub1,sub2,sub3;
		System.out.println("Enter the Name:");
		Scanner sc =new Scanner(System.in);
		name=sc.next();
		System.out.println("Enter your Initial: ");
		a=sc.next().charAt(0);
		System.out.println("Enter sub1 marks:");
		sub1=sc.nextInt();
		System.out.println("Enter sub2 marks:");
		sub2=sc.nextInt();
		System.out.println("Enter sub3 marks:");
		sub3=sc.nextInt();
		int total=sub1+sub2+sub3;
		System.out.println("Enter Name:"+name);
		System.out.println(" Initial:"+a);
		System.out.println(" sub1 marks:"+sub1);
		System.out.println(" sub2 marks:"+sub2);
		System.out.println(" sub3 marks:"+sub3);
		System.out.println("Total marks:"+total);
		sc.close();		
	}
}
