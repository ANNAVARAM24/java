package com.java.program1;

import java.util.Arrays;

public class DeletingAnArray {

	public static void main(String[] args) {
      int [] originalArray= {1,2,3,4,5};
      int newArray[]=new int[originalArray.length-1];
      int index=2;
    	for(int i=0;i<index;i++) {
    		newArray[i]=originalArray[i];
    	}
    	for(int i=index;i<newArray.length;i++) {
    		newArray[i]=originalArray[i+1];
    	}
    	System.out.println( Arrays.toString(newArray));
	}

} 
