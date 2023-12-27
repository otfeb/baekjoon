package bj_2023;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class bj_11718 {

	public static void main(String[] args) throws IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		String r = "";
		
		for(int i=0;i<100;i++) {
			String s = br.readLine();
			if(s==null || s.equals("")) {
				break;
			}
			r+=s+",";
		}
		String[] arr = r.split(",");
		
		for(int j=0;j<arr.length;j++) {
			System.out.println(arr[j]);
		}
	}

}
