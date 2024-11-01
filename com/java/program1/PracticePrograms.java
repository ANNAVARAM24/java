package com.java.program1;

public class PracticePrograms {
	PracticePrograms(){
		System.out.println("print constructor");
	}

	public static void main(String[] args) {
		
       System.out.println("main method");
       Calculate(20,20);
       Calculate(10);
	}
	static int Calculate(int a,int b) {
		int sum = a+b;
		int multiply=a*b;
		int divide=a/b;
		System.out.println("sum is: "+sum);
		System.out.println("multiply is: "+multiply);
		System.out.println("divison is: "+divide);
		return 60;
	}
  static void Calculate(int a) {
	  System.out.println(a);
  }
}

