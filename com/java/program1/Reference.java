package com.java.program1;

public class Reference {
//
//	public static void main(String[] args) {
//		// TODO Auto-generated method stub
//
//	}
//
//}
 
	Reference() {
		System.out.println("inside First_Java_Program constructor");
	}
	Reference(int a) {
		System.out.println("inside First_Java_Program constructor");
	}
 
	static void sum() {
		int a = 10 + 20;
		System.out.println(a);
 
	}
 
	static void sum2(int a, int b) {
		int c = a + b;
		System.out.println(c);
 
	}
	static void sum2(String c, int d) {
		String e = c + d;
		System.out.println(e);
 
	}
	static void sum(String a, String b) {
		String c = a + b;
		System.out.println(c);
 
	}
 
	public static void main(String[] args) {
		//String name = "Abhi";
		System.out.println("main method");
		addNumber();
		addString();
		print();
		sum();
		sum2(500,500);
		sum("Ram", "Bheem");
 
	}
 
	static void print() {
		System.out.println("print" + " method");
	}
 
	static int addNumber() {
		int a = 10 + 20;
		System.out.println(a);
		return 90;
	}
 
	static String addString() {
		String name = "Devara" + " " + "NTR";
		System.out.println(name);
		return name;
	}
 
	void run() {
		System.out.println("print it");
	}
	void walk() {
		System.out.println("walk in the street");
	}
}

 
 