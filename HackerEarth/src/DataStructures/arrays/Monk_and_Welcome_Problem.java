/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DataStructures.arrays;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

/**
 *
 * @author fs-fleet
 */
public class Monk_and_Welcome_Problem {
    public static void main(String args[]) throws IOException{
        BufferedReader input = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer tk = new StringTokenizer(input.readLine());
        int n = Integer.parseInt(tk.nextToken());
        int a[] = new int[n];
        int b[] = new int[n];
        tk = new StringTokenizer(input.readLine());
        for(int i = 0; i < n; i++) {
            a[i] = Integer.parseInt(tk.nextToken());
        }
        tk = new StringTokenizer(input.readLine());
        for(int i = 0; i < n; i++) {
            b[i] = Integer.parseInt(tk.nextToken());
        }
        for(int i = 0; i < n; i++) {
            System.out.print((a[i]+b[i])+" ");
        }
    }
}
