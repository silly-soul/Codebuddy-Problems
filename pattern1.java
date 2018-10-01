/* Author: Aditya Agrawal
https://codebuddy.co.in/problems/PATTERN1 */

import java.util.Scanner;

public class Main{

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		int n = scn.nextInt();
		int row = 1, cst;
		int nst = 1;
	

		while (row <= n) {

			cst = 1;

			while (cst <= row) {

				if (cst % 2 == 0) {
					System.out.print("@");
				} else {
					System.out.print("*");
				}
			
				cst = cst + 1;
				System.out.print(" ");
			    
			}

			nst = nst + 1;
			System.out.println("\n");
			row = row + 1;
		}
		scn.close();
	}
}