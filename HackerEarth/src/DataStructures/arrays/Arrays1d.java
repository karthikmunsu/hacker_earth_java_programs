/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DataStructures.arrays;
import java.util.*;
/**
 *
 * @author fs-fleet
 */
public class Arrays1d {
    public static void main(String args[] ) throws Exception {

        //Scanner
        Scanner s = new Scanner(System.in);
        int T = s.nextInt();
        List<Integer> res = new ArrayList<>();
        for(int j = 0; j < T; j++){
            int N = s.nextInt();
            int arr[] = new int[N];
            Set<Integer> setString = new LinkedHashSet<Integer>();
            for (int i = 0; i < N; i++) {
            arr[i] = s.nextInt();
            setString.add(arr[i]);
            }
            Arrays.sort(arr);
            
                for(int k : setString){
                    int count = 0;
                    for(int l= 0;l<N;l++){
                        if(k == arr[l]){
                            count++;
                        }
                    }
                    if(count == 1){
                        res.add(k);
                    }
                }
        }
        for(int m : res){
            System.out.println(m);
        }
        
    }
}
