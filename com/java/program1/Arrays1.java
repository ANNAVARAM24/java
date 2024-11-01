package com.java.program1;

import java.util.Arrays;

public class Arrays1 {

	public static void main(String[] args) {
//      int a[][]= {{1,3,4,5},{6,7,8,9,10}};
//      for(int i=0;i<a.length;i++) {
//    	  for(int j=0;j<a[i].length;j++) {
//    		  
//    		  //System.out.println(a[i][j]);
//    	  }
//      }
//		int a[]= new int[5];
//		for(int i=0;i<a.length;i++) {
//			
//			a[i]=i+1;
//			if(i==2) {
//				a[2]=0;
//			}
//			System.out.println(a[i]);
//		}
//      
		int a[]=new int[5];
		int b[]=new int[a.length+1];
		for(int i=0;i<a.length;i++) {
			a[i]=i+1;
		}
		int p =3;
		for(int j=0;j<p;j++) {
			b[j]=a[j];
		}
		b[p]=9;
		for(int i=p;i<a.length;i++) {
			b[i+1]=a[i];
			
		}
	System.out.println(Arrays.toString(b));

//		for(int i=0;i<b.length;i++) {
//			if(i==3) {
//				b[i]=9;
//			}
//			else {
//				b[i]=i+1;
//			}
//			System.out.println(b[i]);
//		}
	}

}
