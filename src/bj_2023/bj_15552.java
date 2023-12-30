package bj_2023;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class bj_15552 {

	public static void main(String[] args) throws IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

		int t = Integer.parseInt(br.readLine());
		String[] arr;
		
		for(int i=0;i<t;i++) {
			String s = br.readLine();
			arr = s.split(" ");
			
			bw.write(Integer.parseInt(arr[0])+Integer.parseInt(arr[1])+"\n");
			
		}
		
		bw.flush();
	}

}
