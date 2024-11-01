package com.java.program1;

public class TypeConversions {
	public static void main(String[]args) {
		byte b =23;
		int i=b;
		int i1=983;//implict
		System.out.println(i1);
		byte b1= (byte) i1;
		float f =2345.67f;
		int j  = (int) f;
		double d =f;
		String s ="string";
		String s1 = String.valueOf(i1);//Explicit typecasting
		System.out.println(s1);
		
	}

}
