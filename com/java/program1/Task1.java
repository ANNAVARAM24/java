package com.java.program1;

import java.util.Scanner;

public class Task1 {
	public static void main(String[] args) {
		factorial();
		fibonacci();
	}

	static void factorial() {
		int fact1 = 1;
		System.out.println("Enter a number for Factorial");
		Scanner fact = new Scanner(System.in);
		int n = fact.nextInt();
		for (int i = 1; i <= n; i++) {
			fact1 *= i;
		}
		System.out.println("Factorial of given number is " + fact1);
		System.out.println("-------------------------");
	}
	static void fibonacci() {
		int a=0,b=1;
		int sum = 0;
		System.out.println("Enter a number for Fibonacci Series");
		Scanner fibnoc = new Scanner(System.in);
		int n1 = fibnoc.nextInt();
		System.out.println("Fibonacci series : ");
		System.out.println(a);
		System.out.println(b);
		for(int i=1;i<=n1;i++) {
			sum=a+b;
			a=b;
			b=sum;
			System.out.println(sum);

		}
		
	}

}
