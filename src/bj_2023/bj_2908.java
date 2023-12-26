package bj_2023;

import java.util.Scanner;

public class bj_2908 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		String a = sc.next();
		String b = sc.next();
		
		String[] aa = a.split("");
		String[] ba = b.split("");
		
		for(int i=0;i<aa.length/2+1;i++) {
			String temp = aa[i];
			String temp2 = ba[i];
			
			aa[i] = aa[(aa.length-1)-i];
			aa[(aa.length-1)-i] = temp;
			
			ba[i] = ba[(ba.length-1)-i];
			ba[(ba.length-1)-i] = temp2;
		}
		
		String resultA = "";
		String resultB = "";
		
		for(int i=0;i<aa.length;i++) {
			resultA+=aa[i];
			resultB+=ba[i];
		}
		
		int result = Math.max(Integer.parseInt(resultA), Integer.parseInt(resultB));
		
		System.out.println(result);

	}

}
