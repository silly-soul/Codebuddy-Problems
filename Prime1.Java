/* Author: Aditya Agrawal
https://codebuddy.co.in/problems/PRIME1 */

import java.util.Scanner;

public class Main{

	public static void main(String args[]) {
		int t,l,r;
		Scanner scn = new Scanner(System.in);
		t = scn.nextInt();
		while(t>0){
         	l = scn.nextInt();
	    	r= scn.nextInt();
		   int  count =0;
	        	while (l <= r) {
		        
			int counter = 2,flag = 0;
			while (counter * counter <= l) {
				if (l % counter == 0) {
					flag = 1;
					break;
				} else {
					counter++;
				}
			
			}
	if (flag != 1&&l!=1) {
				count++;
			}
				l++;
	        	}
		t--;
		System.out.println(count);	}
	
		scn.close();
	}

}