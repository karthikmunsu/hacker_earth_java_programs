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
import java.util.Arrays;
import java.util.List;
import java.util.StringTokenizer;

/**
 *
 * @author fs-fleet
 */
public class Weighing_the_Stones {

    public static void main(String args[]) throws IOException {
        BufferedReader input = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(input.readLine());
        int T = Integer.parseInt(st.nextToken());
        List<String> res = new ArrayList<String>();
        for (int i = 0; i < T; i++) {
            st = new StringTokenizer(input.readLine());
            int len = Integer.parseInt(st.nextToken());
            int arr[] = new int[len];
            int sarr[] = new int[len];
            st = new StringTokenizer(input.readLine());
            for (int j = 0; j < len; j++) {
                arr[j] = Integer.parseInt(st.nextToken());
            }
            st = new StringTokenizer(input.readLine());
            for (int j = 0; j < len; j++) {
                sarr[j] = Integer.parseInt(st.nextToken());
            }
            Arrays.sort(arr);
            Arrays.sort(sarr);
            if (arr[len - 1] > sarr[len - 1]) {
                res.add("Rupam");
            } else if (arr[len - 1] < sarr[len - 1]) {
                res.add("Ankit");
            } else {
                res.add("Tie");
            }
        }
        for (String s : res) {
            System.out.println(s);
        }
    }
}
