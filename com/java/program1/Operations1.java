package com.java.program1;

public class Operations1 {
		 static void multiplication() {
			 int a = 10;
			 int b = 5;
			 System.out.println(a*b);
		 }
		 static void subtraction() {
			 int a =20;
			 int b = 4;
			 System.out.println(a-b);
		 }
		  void division() {
			 int a=34;
			 int b=2;
			 System.out.println(a%b);
		 }
		public static void main(String[] args) {
			multiplication();
			subtraction();
			Operations1 e = new Operations1();
			e.division();
		}
	
}
