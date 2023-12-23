package bj_2023;

import java.util.Scanner;

public class bj_10809 {

	public static void main(String[] args) {
		
		String a = "abcdefghijklmnopqrstuvwxyz";
		//System.out.println(a.length());
		
		String[] arr = a.split("");

		Scanner sc = new Scanner(System.in);
		
		String s = sc.next();
		String[] arr2 = s.split("");
		
		int cnt = 0;
		
		for(int i=0;i<arr.length;i++) {
			for(int j=0;j<arr2.length;j++) {
				if(arr[i].equals(arr2[j])) {
					System.out.print(j+" ");
					cnt++;
					break;
				}
			}
			if(cnt==0) {
				System.out.print(-1+" ");
			}
			cnt = 0;
		}

	}

}
