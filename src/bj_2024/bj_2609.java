package bj_2024;

import java.util.Scanner;

// 최대공약수와 최소공배수
public class bj_2609 {

	public static int gcd(int x, int y) {		// 재귀함수
		if(y == 0) {
			return x;
		}
		else {
			return gcd(y, x%y);
		}
	}
	
	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		int a = scanner.nextInt();
		int b = scanner.nextInt();
		int greatest = gcd(a, b);
		System.out.println(greatest);
		int least = greatest*(a/greatest)*(b/greatest);
		System.out.println(least);
		
	}

}
