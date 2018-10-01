/* Author: Aditya Agrawal
https://codebuddy.co.in/problems/CHOCOLATE */

import java.util.*;

 class Main
{
	public static void main (String[] args)
	{
	Scanner scn = new Scanner(System.in);
	int t=scn.nextInt();
	while(t>0){
		int n = scn.nextInt();
		int k=scn.nextInt();
	int sum = 0;
    		int term = n*(k - 1) + 1;
    		for(int i = 0 ; i<n;i++)
    		{
    			sum+=term;
    			term += n-(k-1);
    		}
    		
			System.out.println(sum);
				t--;
		}
		scn.close();
		}
	
	}