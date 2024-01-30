package bj_2024;

import java.util.Scanner;

public class bj_10870 {

	public static void main(String[] args) {

		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		
		int a = fibonacci(n);
		System.out.println(a);
	}

	private static int fibonacci(int n) {

		if(n < 2)
			return n;
		else {
			return fibonacci(n-1) + fibonacci(n-2);
		}
		
	}

}
