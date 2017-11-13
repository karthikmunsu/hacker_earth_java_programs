/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DataStructures.arrays;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Scanner;

/**
 *
 * @author fs-fleet
 */
public class Memorise_Me {
    public static void main(String args[]) {
        Scanner in = new Scanner(System.in);
        int N = in.nextInt();
        int arr[] = new int[N];
        for(int i = 0; i < N; i++) {
            arr[i] = in.nextInt();
        }
        int Q = in.nextInt();
        int qarr[] = new int[Q];
        for(int i = 0; i < Q; i++) {
            qarr[i] = in.nextInt();
        }
        
        for(int i = 0; i < Q; i++){
            Arrays.sort(arr);
            //System.out.println(Arrays.stream(arr).anyMatch(qarr[i]::equals));
            if(Arrays.binarySearch(arr, qarr[i]) > 0){
                int count = 0;
                for(int j = 0; j < N; j++){
                if(qarr[i] == arr[j])
                    count++;
                }
                    System.out.println(count);
            }else{
                System.out.println("NOT PRESENT");
            }
        }
    }
    
}
