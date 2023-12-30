package bj_2023;

import java.util.Scanner;

public class bj_2444 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		String s = "";
		
		for(int i=0;i<2*n-1;i++) {
			if(i<n) {
				for(int j=0;j<n+i;j++) {
					if(j>=n-1-i && j<=n-1+i) {
						s+="*";
					}
					else {
						s+=" ";
					}
				}
				System.out.println(s);
				s="";
			}
			else {
				for(int k=0;k<3*n-2-i;k++) {
					if(k<=i-n) {
						s+=" ";
					}
					else {
						s+="*";
					}
				}
				System.out.println(s);
				s="";
			}
		}
	}
}
