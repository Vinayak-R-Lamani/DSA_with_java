package problems;
import java.util.*;

public class permute_two_array_sum {
    public  boolean check(Integer[] a,int[] b,int k){

        Arrays.sort(a,Collections.reverseOrder());
        Arrays.sort(b);
        int n=a.length ;
        for (int i = 0 ;i < n; i++){
            if (a[i]+b[i] <k) return  false;
        }
         return true;
     }
}
