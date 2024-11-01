package com.java.program1;

public class Java {
public static void main(String[] args) {
	String s1="Hello";
	String s2="Hello";
	if(s1==s2) {
		System.out.println("I'm executed");
	}
	if(s1.equals(s2)) {
		System.out.println("same string");
	}
	int len=s1.length();
	System.out.println(len);
	String str2="world";
	String str3=str2.concat(s1);
	System.out.println(str3);
	String s3=s1.substring(1);
	System.out.println(s3);
	char c=s1.charAt(1);
	System.out.println(c);
	String s4="string methods";
	String s5=s4.toUpperCase();
	System.out.println(s5);
	int i1=s4.codePointAt(7);
	System.out.println(i1);
	int i2=str2.compareTo(s4);
	System.out.println(i2);
	int i3=s1.compareToIgnoreCase(s2);
	System.out.println(i3);
	boolean b1=s2.contains(s1);
	System.out.println(b1);
	int i4=str2.length();
	System.out.println(i4);
	boolean b2=s2.equals(str2);//it checks 
	System.out.println(b2);
	int i5=str3.indexOf('o');
	System.out.println(i5);
	String s6=s2.trim();
	System.out.println(s6);
	boolean b3 = s2.isBlank();
	System.out.println(b3);
	boolean b4=s3.isEmpty();
	System.out.println(b4);
	int i6=str2.lastIndexOf('l');
	System.out.println(i6);
	
}
}
