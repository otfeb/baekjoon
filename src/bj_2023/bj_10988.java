package bj_2023;

import java.util.Scanner;

public class bj_10988 {

	public static void main(String[] args) {

		result();

	}

	private static void result() {

		Scanner sc = new Scanner(System.in);
		
		String s = sc.nextLine();
		
		System.out.println(palindrome(s));
	}
	
	private static int palindrome(String s) {

		String[] arr = s.split("");
		int cnt = 0;
		
		for(int i=0;i<arr.length/2;i++) {
			if(arr[i].equals(arr[arr.length-1-i])) {
				cnt++;
			}
			else {
				break;
			}
		}
		if(cnt==arr.length/2) {
			return 1;
		}
		else {
			return 0;
		}
		
	}

}
