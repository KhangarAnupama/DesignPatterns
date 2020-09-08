package com.design.patterns;
/**
 * Pyramid programme for interview preparation
 * @author Anupama Khangar
 *
 */
public class Test {
	
	public static void main(String[] args) {
		int last_status = 1;
		System.out.println("        1");
		int limit = 5;
		
		for(int i=1 ; i<limit ; i++) {
			for(int i1 = limit-1 ; i1 > last_status  ; i1--) {
				System.out.print("  ");
			}
			 for(int j = i+1; j <= i+last_status ; j++ ) {
				 System.out.print(j+ " ");
			 }
			 for(int j = i+last_status+1 ; j > i ; j-- ) {
				 System.out.print(j+ " ");
			 }
			 last_status = last_status +1;
			 System.out.println("\n");
		}
		
	}

}
