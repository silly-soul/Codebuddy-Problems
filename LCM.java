/* Author: Aditya Agrawal
https://codebuddy.co.in/problems/LCM */


import java.util.Scanner;

public class LCM_Q12 {

	public static void main(String[] args) {
	
		int t, a, b,lcm;
		Scanner sc = new Scanner(System.in);
		t = sc.nextInt();
		while(t!=0){
		a = sc.nextInt();
		b = sc.nextInt();
		lcm = LCM(a, b);
		System.out.println(lcm);
		t--;
	    
	}
		sc.close();
	}

	public static int LCM(int n1, int n2) {
		int rem, lcm ;
		int num1 = n1;
		int num2 = n2;
		rem = n2 % n1;
		while (rem != 0) {
			n2 = n1;
			n1 = rem;
			rem = n2 % n1;
		}
		
		int lcm1=num1/n1;
		int lcm2=num2/n1;
		lcm = n1*lcm1*lcm2;
		return lcm;
	}}