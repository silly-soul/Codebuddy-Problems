/* Author: Aditya Agrawal
https://codebuddy.co.in/problems/ODDEVEN */

package cakwalk;

import java.util.*;
import java.lang.*;
import java.io.*;

public class Main
{
	public static void main (String[] args) throws java.lang.Exception
	{
	
	int n;
	Scanner scn=new Scanner(System.in);
	n=scn.nextInt();
	if(n%2==0){
	    System.out.println("EVEN");
	    
	}
	else{
	    System.out.println("ODD");
	}
	scn.close();
	}
}