package bj_2023;

import java.util.Scanner;

public class bj_10813 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();	//바구니 개수
		int m = sc.nextInt();	//바꾸는 횟수
		int[] arr = new int[n];
		
		for(int i=0;i<n;i++)
		{
			arr[i] = i+1;
		}
		for(int num=0;num<m;num++) {
			int i = sc.nextInt();
			int j = sc.nextInt();
			
			int a = arr[i-1];
			int b = arr[j-1];
			
			arr[i-1] = b;
			arr[j-1] = a;
		}
		
		for(int r=0;r<arr.length;r++) {
			System.out.print(arr[r]+" ");
		}

	}

}
