package bj_2024;

import java.io.BufferedWriter;
import java.io.OutputStreamWriter;
import java.util.Scanner;
import java.util.Stack;

public class bj_1914 {
	
	//스택 3개 생성
	static Stack<Integer> s1 = new Stack<>();
	static Stack<Integer> s2 = new Stack<>();
	static Stack<Integer> s3 = new Stack<>();
	static int cnt = 0;

	public static void main(String[] args) {
		
		Scanner in = new Scanner(System.in);
		//n이 20이하면 수행 과정 출력 아니면 출력할 필요 x
		int n = in.nextInt();
		
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

		//1번 스택에 원판 넣기
		for(int i=n;i>0;i--) {
			s1.push(i);
		}
		
		recursion(n);
		
		if(n <= 20) {
			System.out.println(cnt);
			//수행 과정 출력
			
		}
		else {
			System.out.println(cnt);
		}
		
	}

	private static void recursion(int n) {

		//base case는 3번 스택이 완성될때
		if(s3.size() == n) {
			return;
		}
		else {
			//3번 기둥에 가장 큰 원판이 와야함
			//이웃된 기둥에 가장 큰 원판을 제외한 모든 원판이 와야함
			
		}
	}

}
