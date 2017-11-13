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
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.StringTokenizer;

/**
 *
 * @author fs-fleet
 */
public class Most_Frequent {
    public static void main(String args[]) throws IOException {
        BufferedReader input = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(input.readLine());
        int t = Integer.parseInt(st.nextToken());
        st = new StringTokenizer(input.readLine());
        ArrayList<Integer> arr = new ArrayList<Integer>();
        for(int i = 0; i < t; i++) {
            arr.add(Integer.parseInt(st.nextToken()));
        }
        Set<Integer> set = new HashSet<Integer>();
        set.addAll(arr);
        int count = 0;
        int previous = 0;
        for(int i : set){
            int val = 0;
            previous = i;
            for(int j : arr) {
                if(i == j) {
                    val+=1;
                }
            }
            if(count == 0)
                count = val;
            else if(count < val)
                count = val;
        }
        System.out.println(count);
        
    }
}
