package bj_2023;

import java.util.Scanner;

public class bj_1546 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		double n = sc.nextDouble();
		int a = (int)n;
		double[] scoreArr = new double[a];		//점수 배열
		double[] avgScore = new double[a];	//바뀐 점수의 배열
		int max = 0;
		double avg = 0;
		
		for(int i=0;i<scoreArr.length;i++) {
			scoreArr[i] = sc.nextInt();
			if(scoreArr[i]>max) {
				max = (int) scoreArr[i];
			}
		}
		
		for(int i=0;i<avgScore.length;i++) {
			avgScore[i] = scoreArr[i]/max*100.0;
			avg+=avgScore[i];
		}
		
		System.out.println(avg/=a);		//바뀐 점수의 평균

	}

}
