package javaprograms;

public class LoopStatements {

	public static void main(String[] args) {

		for(int a=2;a<=100;a++) {
			
			int count=0;
            for(int b=1;b<=a;b++) {
            	if(a%b==0) {
            		      count++;
            	}
            }
            if(count==2) {
            System.out.println(a); 
            	
            } 
	}

 }
}
