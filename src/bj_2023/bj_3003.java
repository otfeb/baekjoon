package bj_2023;

import java.util.Scanner;

public class bj_3003 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int[] chess = {1,1,2,2,2,8};
		int[] arr = new int[6];
		
		for(int i=0;i<arr.length;i++) {
			arr[i] = sc.nextInt();
			arr[i] = chess[i] - arr[i];
		}
		for(int j=0;j<arr.length;j++) {
			System.out.print(arr[j]+" ");
		}
	}

}
