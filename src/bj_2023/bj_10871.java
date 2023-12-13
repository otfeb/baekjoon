package bj_2023;

import java.util.Scanner;

public class bj_10871 {

public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		int x = sc.nextInt();
		
		String arr = "";
		
		for(int i=0;i<n;i++) {
			int a = sc.nextInt();
			if(a<x) {
				arr+=a+" ";
			}
		}
		
		System.out.println(arr);

	}


}
