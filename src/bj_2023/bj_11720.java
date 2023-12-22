package bj_2023;

import java.util.Scanner;

public class bj_11720 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		int sum = 0;
		String s = sc.next();
		String[] arr = s.split("");
		
		for(int i=0;i<arr.length;i++) {
			sum+=Integer.parseInt(arr[i]);
		}
		
		System.out.println(sum);
	}

}
