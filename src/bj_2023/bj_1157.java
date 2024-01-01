package bj_2023;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class bj_1157 {

	public static void main(String[] args) throws IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

		String s = br.readLine();
		String[] arr = s.toUpperCase().split("");

		int cnt = 1;
		int cntArr[] = new int[arr.length];
		int max = 0;
		String r = "";

		if (arr.length == 1) {
			System.out.println(s);
		}
		else {
			for (int i = 0; i < arr.length; i++) {
				for (int j = 0; j < arr.length; j++) {
					if (i != j && arr[i].equals(arr[j])) {
						cnt++;
					}
				}
				cntArr[i] = cnt;
				max = Math.max(max, cnt);
				cnt = 1;
			}
			for (int k = 0; k < cntArr.length; k++) {
				if (cntArr[k] == max) {
					if (r.length() != 0 && !r.equals(arr[k])) {
						r = "?";
						break;
					}
					r = arr[k];
				}
			}
			bw.write(r);
			bw.flush();
		}
	}
}
