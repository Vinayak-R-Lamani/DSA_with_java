package problems;
import java.util.*;
class Pair{
    public int Min;
    public int Max;
}

public class MinMax {
   static Pair Getminmax(int[] arr,int n){
        Pair minmax = new Pair();
        Arrays.sort(arr);
        minmax.Min = arr[0];
        minmax.Max = arr[n-1];
        return minmax;
   } 

   public static void main(String[] args) {
    int[] arr ={2,5,1,6,7,9};
    int n = arr.length;
    Pair minmax = Getminmax(arr,n);
    System.out.println(minmax.Max + " " + minmax.Min);
   }
}
