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
import java.util.Stack;
import java.util.StringTokenizer;

/**
 *
 * @author fs-fleet
 */
public class Monks_Love_for_Food {

    public static void main(String args[]) throws IOException {
        BufferedReader input = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(input.readLine());
        int q = Integer.parseInt(st.nextToken());
        //st = new StringTokenizer(input.readLine());
        Stack stack = new Stack();
        List<String> res = new ArrayList<String>();
        for (int i = 0; i < q; i++) {
            st = new StringTokenizer(input.readLine());
            int val = Integer.parseInt(st.nextToken());
            if (val == 1) {
                if (stack.isEmpty()) {
                    //System.out.println("No Food");
                    res.add("No Food");
                } else {
                    //System.out.println(stack.pop());
                    res.add(stack.pop().toString());
                }
            } else if (val == 2) {
                stack.push(Integer.parseInt(st.nextToken()));
            }
        }
        for(String s : res) {
            System.out.println(s);
        }

    }
}
