/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DataStructures.arrays;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.Arrays;
import java.util.Scanner;
import java.util.StringTokenizer;

/**
 *
 * @author fs-fleet
 */
public class Long_ATM_Queue {
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
        //Scanner in = new Scanner(System.in); //dont use scanner class if we use scanner class the performance time is very high it takes 2.74 seconds to compile
        FastReader in = new FastReader();
        int N = in.nextInt();
        int arr[] = new int[N];
        for(int i = 0; i < N; i++) {
            arr[i] = in.nextInt();
        }
         int count = 0;
        for(int i = 0; i < N-1; i++){
            if(arr[i+1] < arr[i]){
                count++;
            }
        }
        System.out.println(count+1);
    }
}
