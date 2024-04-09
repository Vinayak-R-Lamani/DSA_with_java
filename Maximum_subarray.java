public class Maximum_subarray {
    public int Maximumsubarr(int[] arr){
        int max = 0;
        int count = 0;

        for (int i = 0; i < arr.length; i++) {
            count +=arr[i];
            if (count > max) {
                max = count;
            }
            if (count < 0) {
                count = 0;
                
            }
        }

        return max;
    }
    public static void main(String[] args) {
        int[] arr = {-2,1,-3,4,-1,2,1,-5,4};
        int max = new Maximum_subarray().Maximumsubarr(arr);
        System.out.println(max);
    }   
}
