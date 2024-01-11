package bj_2024;

import java.util.Scanner;

public class bj_1929 {
	
	private static String prime(int a, int b) {

		String primeNum = "";
		
		for(int i=a;i<=b;i++) {
			if(i==1 || i==2 || i==3) {
				primeNum += i+" ";
			}
			else if(i%2!=0 && i%3!=0) {
				primeNum += i+" ";
			}
		}
		
		return primeNum;
		
	}

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int m = sc.nextInt();				//자연수 M
		int n = sc.nextInt();				//자연수 N

		String result = prime(m,n);
		String[] arr = result.split(" ");
		
		for(String s : arr) {
			System.out.println(s);
		}

	}

	
}
