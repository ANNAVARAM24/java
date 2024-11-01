package com.java.program1;

public class String_Buffer {
public static void main(String []args) {
  StringBuilder sb = new StringBuilder("Hello");
  sb.append("world");
  System.out.println(sb);
  StringBuffer sbf=new StringBuffer("Hi");
  sbf.append("java");
  System.out.println(sbf);
  System.out.println("Reverse of the given string is: "+sbf.reverse());
  System.out.println("Inserting in the string: "+sb.insert(2,"session"));
  System.out.println("Delete operation: "+sb.delete(2,9));
}
}
