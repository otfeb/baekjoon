package bj_2024;

import java.util.Scanner;

public class bj_27433 {

	public static void main(String[] args) {

		Scanner in = new Scanner(System.in);
		
		int n = in.nextInt();
		
		Long f = factorial(n);
		System.out.println(f);

	}

	private static Long factorial(int n) {

		if(n == 0)
			return (long) 1;
		else {
			return n * factorial(n-1);
		}
		
	}

}
