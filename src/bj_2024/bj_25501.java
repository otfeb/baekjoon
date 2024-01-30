package bj_2024;

import java.util.Scanner;

public class bj_25501 {
	
	static int cnt = 1;

	public static int recursion(String s, int l, int r){
        if(l >= r) return 1;
        else if(s.charAt(l) != s.charAt(r)) return 0;
        else cnt++; return recursion(s, l+1, r-1);
    }
	
    public static int isPalindrome(String s){
        return recursion(s, 0, s.length()-1);
    }
    
    public static void main(String[] args){
    	Scanner in = new Scanner(System.in);
    	int t = in.nextInt();
    	
    	for(int i=0;i<t;i++) {
    		String s = in.next();
    		System.out.println(isPalindrome(s)+" "+cnt);
    		cnt = 1;
    	}
    	
    }

}
