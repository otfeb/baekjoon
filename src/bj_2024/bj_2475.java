package bj_2024;

import java.util.Scanner;

public class bj_2475 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int sum = 0;
		
		for(int i=0;i<5;i++) {
			int a = sc.nextInt();
			sum += a*a;
		}
		int result = sum%10;
		System.out.println(result);
	}

}
