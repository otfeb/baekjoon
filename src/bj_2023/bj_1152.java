package bj_2023;

import java.util.Scanner;

public class bj_1152 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		String s = sc.nextLine().trim();
		
		String[] arr = s.split(" ");

		if(s.length()==0) {
			System.out.println(0);
		}
		else {
			System.out.println(arr.length);
		}
	}

}
