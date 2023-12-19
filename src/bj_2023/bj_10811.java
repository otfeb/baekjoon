package bj_2023;

import java.util.Scanner;

public class bj_10811 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		int m = sc.nextInt();
		
		int[] arr = new int[n];
		
		for(int i=0;i<n;i++) {
			arr[i]=i+1;
		}
		
		for(int i=0;i<m;i++) {
			int a = sc.nextInt();
			int b = sc.nextInt();
			int c = b-a;
			for(int k=0;k<c;k++) {
				
				for(int j=a-1;j<b-1;j++) {
					int x = arr[j];
					int y = arr[j+1];
					
					arr[j] = y;
					arr[j+1] = x;
				}
				b--;
			}
		}
		for(int i=0;i<arr.length;i++) {
			System.out.print(arr[i]+" ");
		}
	}
}
