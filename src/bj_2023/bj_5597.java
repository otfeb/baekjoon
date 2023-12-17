package bj_2023;

import java.util.Scanner;

public class bj_5597 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		int[] arr = new int[30];
		
		for(int i=0;i<arr.length;i++) {
			arr[i] = i+1;
		}
		
		for(int j=0;j<28;j++) {
			int a = sc.nextInt();
			arr[a-1] = 0;
		}
		
		for(int k=0;k<arr.length;k++) {
			if(arr[k] != 0) {
				System.out.println(arr[k]);
			}
		}

	}

}
