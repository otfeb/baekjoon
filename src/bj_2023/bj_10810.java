package bj_2023;

import java.util.Scanner;

public class bj_10810 {

   public static void main(String[] args) {

      Scanner sc = new Scanner(System.in);
      
      int n = sc.nextInt();
      int m = sc.nextInt();
      
      int[] arr = new int[n];
      
      for(int num=0;num<m;num++) {
         
         int i = sc.nextInt();
         int j = sc.nextInt();
         int k = sc.nextInt();
         
         for(int num2=i-1;num2<=j-1;num2++) {
            arr[num2] = k;
         }
         
      }
      
      for(int i=0;i<arr.length;i++) {
         System.out.print(arr[i]+" ");
      }
   }

}