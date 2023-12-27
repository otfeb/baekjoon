package bj_2023;

import java.util.Scanner;

public class bj_5622 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		String s = sc.nextLine();
		String[] arr = s.split("");
		
		String[] numArr = {"ABC","DEF","GHI","JKL","MNO","PQRS","TUV","WXYZ"};
		int sum = 0;
		
		for(int i=0;i<arr.length;i++) {
			for(int j=0;j<numArr.length;j++) {
				String[] num = numArr[j].split("");
				for(int k=0;k<numArr[j].length();k++) {
					if(arr[i].equals(num[k])) {
						sum+=j+3;
						break;
					}
				}
			}
		}
		System.out.println(sum);
	}

}
