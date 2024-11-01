package com.java.program1;

public class ObjectCreation {
   ObjectCreation(){
	   System.out.println("constructor");
	   
   }
   ObjectCreation(String a){
	   System.out.println("argumented constructor");
   }
   {
	   System.out.println("This is a instance block");
   }
   static {
	   System.out.println("static block");
	   int a  = 10;
		System.out.println(a);
   }
   public static void main(String []args) {
	System.out.println("main method");
	ObjectCreation obj = new ObjectCreation();
	ObjectCreation obj1 = new ObjectCreation("");

}
}
