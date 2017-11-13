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
public class RiyaString {

    public static void main(String args[]) {
        Scanner in = new Scanner(System.in);
        String str = in.nextLine();
        String tmp = "";
        String pre = str;
        while (true) {
            StringBuilder sb = new StringBuilder(pre);
            int len = sb.length();         
            tmp = "";
            while (len != 0) {
                if (len % 2 == 0) {
                    tmp += sb.charAt((len / 2) - 1);
                    sb.deleteCharAt((len / 2) - 1);
                } else {
                    tmp += sb.charAt((len / 2));
                    sb.deleteCharAt((len / 2));
                }
                len -= 1;
            }
            if (tmp.contentEquals(str)) {
                break;
            }
            pre = tmp;
        }
        System.out.println(pre);
    }
}
