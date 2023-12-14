package bj_2023;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class bj_2562 {

	public static void main(String[] args) throws IOException {

		int[] arr = NineNum();
		MaxInt(arr);

	}

	private static int[] NineNum() throws IOException {

		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		int[] arr = new int[9];
		
		for(int i=0;i<arr.length;i++) {
			arr[i] = Integer.parseInt(bf.readLine());
		}
		
		return arr;
	}

	private static void MaxInt(int[] arr) {
		
		int max = 0;
		int cnt = 0;
		
		for(int i=0;i<arr.length;i++) {
			if(arr[i]>max) {
				max = arr[i];
				cnt = i+1;
			}
		}
		System.out.println(max);
		System.out.println(cnt);
	}

}
