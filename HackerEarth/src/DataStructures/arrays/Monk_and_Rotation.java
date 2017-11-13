/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DataStructures.arrays;

import java.util.*;
import java.io.*;

/**
 *
 * @author fs-fleet
 */
public class Monk_and_Rotation {

    public static void main(String args[]) throws IOException {
       BufferedReader input = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer tk = new StringTokenizer(input.readLine());
        
 
        int t = Integer.parseInt(tk.nextToken());
        for (int i = 0; i < t; i++) {
            StringBuilder sb = new StringBuilder();
            tk = new StringTokenizer(input.readLine());
            int n = Integer.parseInt(tk.nextToken());
            int k = Integer.parseInt(tk.nextToken());
            int[] arr = new int[n];
 
            tk = new StringTokenizer(input.readLine());
 
            for (int j = 0; j < n; j++) {
                arr[j] = Integer.parseInt(tk.nextToken());
            }
            for (int z = 0; z < n; z++) {
                System.out.println((z + (n - (k % n))) % n);
                sb.append(arr[(z + (n - (k % n))) % n] + " ");
            }
            sb.append("\n");
            System.out.println(sb);
        }
    }
}
