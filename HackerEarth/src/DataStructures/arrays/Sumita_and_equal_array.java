/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DataStructures.arrays;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;
import java.util.StringTokenizer;

/**
 *
 * @author fs-fleet
 */
public class Sumita_and_equal_array {
    static class FastReader
    {
        BufferedReader br;
        StringTokenizer st;
 
        public FastReader()
        {
            br = new BufferedReader(new
                     InputStreamReader(System.in));
        }
 
        String next()
        {
            while (st == null || !st.hasMoreElements())
            {
                try
                {
                    st = new StringTokenizer(br.readLine());
                }
                catch (IOException  e)
                {
                    e.printStackTrace();
                }
            }
            return st.nextToken();
        }
 
        int nextInt()
        {
            return Integer.parseInt(next());
        }
 
        long nextLong()
        {
            return Long.parseLong(next());
        }
 
        double nextDouble()
        {
            return Double.parseDouble(next());
        }
 
        String nextLine()
        {
            String str = "";
            try
            {
                str = br.readLine();
            }
            catch (IOException e)
            { 
                e.printStackTrace();
            }
            return str;
        }
    }
   public static void main(String args[]) {
      FastReader in = new FastReader(); 
      int T = in.nextInt();
      List<String> res = new ArrayList<String>();
      for(int i = 0; i < T; i++) {
          int N = in.nextInt();
          for(int j = 0; j < N; j++) {
              int X = in.nextInt();
              int Y = in.nextInt();
              int Z = in.nextInt();
              int arr[] = new int[N];
              boolean check = false;
              for(int k = 0; k < N; k++) {
                  arr[k] = in.nextInt();
                  while(arr[k]%X==0){
                      arr[k]/=X;
                  }
                  while(arr[k]%Y==0){
                      arr[k]/=Y;
                  }
                  while(arr[k]%Z==0){
                      arr[k]/=Z;
                  }
              }
              for(int m = 1; m < N; m++) {
                  if(arr[m]!=arr[m-1]){
                      check = true;
                      break;
                  }
              }
              if(!check)
                  res.add("She can");
              else
                  res.add("She can't");    
          }
      }
      for(String i : res){
          System.out.println(i);
      }
   } 
}
