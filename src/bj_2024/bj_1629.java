package bj_2024;

import java.util.Scanner;

public class bj_1629 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		long a = sc.nextInt();
		long b = sc.nextInt();
		long c = sc.nextInt();
		
		long result = a;
		
		long end = Math.abs(cal(a,b,c,result));
		System.out.println(end);
	}

	private static long cal(long a, long b, long c, long result) {

		if(b == 0) {
			int subEnd = (int)(result % c);
			return subEnd;
		}
		else {
			result *= a;
			return cal(a,b-1,c,result);
		}
	}

}
