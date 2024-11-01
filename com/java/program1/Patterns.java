package com.java.program1;

public class Patterns {

	public static void main(String[] args) {
		pattern1();
		pattern2();
		pattern3();
		pattern4();
		pattern5();
		pattern6();
		pattern7();
	}

	static void pattern1() {
		for (int i = 1; i <= 5; i++) {
			for (int j = 1; j <= 5; j++) {
				System.out.print(i);
			}
			System.out.println();
		}
		System.out.println("---------------------------");
	}

	static void pattern2() {
		for (int i = 1; i <= 6; i++) {
			for (int j = 1; j <= i; j++) {
				System.out.print(j);
			}
			System.out.println();
		}
	System.out.println("---------------------------");
	}
	static void pattern3() {
		for(int i=6;i>=1;i--) {
			for(int j=1;j<=i;j++) {
				System.out.print(j);
			}
			System.out.println();
		}
		System.out.println("------------------------");
	}
   static void pattern4() {
	   for(int i=1;i<=6;i++) {
		   for(int j=i;j<6;j++) {
			   System.out.print("  ");
		   }
		   for(int k=1;k<=2*i-1;k++) {
			   System.out.print(k+" ");
			   }
		 
		   System.out.println();
	     }
	   System.out.println("-----------------------");
   }
   
   static void pattern5() {
	   for(int i=1;i<=7;i++) {
		   for(int j=1;j<=i;j++) {
			   if(i%2==0) {
				   System.out.print(0);
			   }
			   else {
				   System.out.print(1);
			   }
		   }
		   System.out.println();
	   }
	   System.out.println("----------------------");
   }
   static void pattern6() {
	   int a=1;
	   for(int i=1;i<=4;i++) {
		   for(int j=1;j<=i;j++) {
			  System.out.print(a++); 
		   }
		   System.out.println();
	   }
	   System.out.println("----------------------");
   }
   static void pattern7() {
	   for(int i=1;i<=6;i++) {
		   for(int j=i;j<6;j++) {
			   System.out.print("  ");
		   }
		   for(int k=1;k<=2*i-1;k++) {
			   System.out.print(k+" ");
		   }
		 
		   System.out.println();
	     }
   }
}
   
