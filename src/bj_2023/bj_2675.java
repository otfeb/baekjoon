package bj_2023;

import java.util.Scanner;

public class bj_2675 {

   public static void main(String[] args) {

      Scanner sc = new Scanner(System.in);
      
      int t = sc.nextInt();
      String[] resultArr = new String[t];
      
      for(int i=0;i<t;i++) {
         int r = sc.nextInt();
         String s = sc.next();
         
         String[] arr = s.split("");
         String result = "";
         
         for(int k=0;k<arr.length;k++) {
            for(int j=0;j<r;j++) {
               result+=arr[k];
            }
         }
         resultArr[i] = result;
      }
      for(int i=0;i<t;i++) {
         System.out.println(resultArr[i]);
      }
   }
}