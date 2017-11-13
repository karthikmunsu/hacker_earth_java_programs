/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DataStructures.arrays;

import java.util.Scanner;

/**
 *
 * @author fs-fleet
 */
public class Mark_The_Answer {
    public static void main(String args[]) {
        Scanner in = new Scanner(System.in);
        int N = in.nextInt();
        int X = in.nextInt();
        int arr[] = new int[N];
        boolean skip = false;
        boolean check = true;
        int count = 0;
        for(int i = 0; i < N ; i++){
            arr[i] = in.nextInt();
            if(check){
                 if(arr[i]>X){
                if(!skip)
                    skip = true;
                else
                    check=false;
            }else if(arr[i]<=X){
                count++;
            }
            }
        }
        /*for(int i = 0; i < N; i++) { // two solutions ive written.
            if(arr[i]>X){
                if(!skip)
                    skip = true;
                else
                    break;
            }else if(arr[i]<=X){
                count++;
            }
        }*/
        System.out.println(count);
    }
}
