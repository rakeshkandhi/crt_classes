package crt_classes;

import java.util.Scanner;

public class Day_1 {
	static void fibonacci(int n) {
		int x = 0;
		int y = 1;
		int z=x+y;
		System.out.println(x+"\n"+y);
		while(z<=n){
			System.out.println(z);
			x=y;
			y=z;
			z=x+y;
		}
	}
	static void factorial(int fact) {
		int i,temp=1;
		for (i=fact;i != 0;i--) {
			temp = temp * i;
		}
		System.out.print("Factorial is: "+temp);
	}
	static void palindrome(String x) {
		String r = "";
		for(int i = x.length() - 1;i>=0;i--) {
			r = r + x.charAt(i);
		}
		if(x.equals(r)) 
			System.out.print("It is a Palindrome");
		else
			System.out.print("Not a Palindrome");
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int choice;
		do {
			System.out.println("\n1:Palindrome\n2:Fibbonnaci\n3:Factorial\n4:Exit\nEnter the choice:");
			choice = sc.nextInt();
			switch(choice) {
			  case 1:
				  System.out.println("Enter the palindrome:");
				  String x = sc.nextLine();
				  x = sc.nextLine();
				  palindrome(x);
				  break;
			  case 2:
				  System.out.println("Enter the fibbonnaci limit:");
				  int fib = sc.nextInt();
				  fibonacci(fib);
				  break;
			  case 3:
				  System.out.println("Enter the factorial1:");
				  int fact = sc.nextInt();
				  factorial(fact);
				  break;
			  case 4:
				  System.out.println("Exit!!!!!!");
				  System.exit(0);
			  default:
				  System.out.println("PLeace enter the correct choice!!!!!");
				  break;
		}
		}while(choice!=4);
		sc.close();
	}
}