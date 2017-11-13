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
public class Micro_and_Array_Update {
    public static void main(String args[]) {
        Scanner in = new Scanner(System.in);
        int T = in.nextInt();
        List<Integer> res = new ArrayList<>();
        for(int i = 0; i < T; i++){
            int N = in.nextInt();
            int K = in.nextInt();
            int arr[] = new int[N];
            int min = 0;
            for(int j = 0; j < N; j++) {
                arr[j] = in.nextInt();
            if((min>arr[j])||(j==0))
                min = arr[j];
            }
            if(min > K || min == K)
            System.out.println("0");
            else
            System.out.println(K-min);
        }
    }
}
