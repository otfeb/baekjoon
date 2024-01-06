package bj_2024;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class bj_2738 {

   public static void main(String[] args) throws IOException {

      BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
      
      String s = br.readLine();
      StringTokenizer st = new StringTokenizer(s," ");
      
      int n = Integer.parseInt(st.nextToken());
      int m = Integer.parseInt(st.nextToken());
      
      int[][] array1 = new int[n][m];
      int[][] array2 = new int[n][m];
      
      for(int i=0;i<n*2;i++) {
         String c = br.readLine();
         StringTokenizer st2 = new StringTokenizer(c," ");
         for(int j=0;j<m;j++) {
            if(i<n) {
               array1[i][j] = Integer.parseInt(st2.nextToken());
            }
            else {
               array2[i-n][j] = Integer.parseInt(st2.nextToken());
            }
         }
      }
      int[][] result = new int[n][m];
      
      for(int k=0;k<n;k++) {
         for(int r=0;r<m;r++) {
            result[k][r] = array1[k][r] + array2[k][r];
         }
      }
      
      for(int b=0;b<n;b++) {
         for(int a=0;a<m;a++) {
            System.out.print(result[b][a]+" ");
         }
         System.out.println();
      }
      
   }

}