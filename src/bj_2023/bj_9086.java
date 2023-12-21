package bj_2023;

import java.util.Scanner;

public class bj_9086 {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		
		int t = scanner.nextInt();
		String[] arr = new String[t];
		
		for(int i=0;i<t;i++) {
			String s = scanner.next();
			arr[i] = s;
		}
		for(int i=0;i<arr.length;i++) {
			System.out.println(arr[i].charAt(0)+""+arr[i].charAt(arr[i].length()-1));
		}
	}

}
