/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DataStructures.arrays;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 *
 * @author fs-fleet
 */
public class Sumits_Happiness {
    public static void main(String args[]) {
        Scanner in = new Scanner(System.in);
        int T = in.nextInt();
        List<Integer> res = new ArrayList<Integer>();
        for(int i =0; i < T; i++) {
            int N = in.nextInt();
            int arr[] = new int[N];
            int result = 0;
            for(int j = 0; j< N; j++) {
                arr[j] = in.nextInt();
                result += (1*arr[j]);
            }
            res.add(result);
        }
        for(int i : res) {
          System.out.println(i);
        }
    }
}
