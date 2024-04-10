/**
 * quick_sort
 */
public class quick_sort {


    public  int partition(int[] arr,int low,int high){
        int pivot = arr[low];
        int i = low + 1;
        int j = high;
        while (i <= j) {

            if (arr[i] <= pivot) {
                i++;
            } else if (arr[j] >= pivot) {
                j--;
            } else {
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
                i++;
                j--;
            }
            
        }
        int temp = arr[low];
        arr[low] = arr[j];
        arr[j] = temp;

        return j;

    }

    public void quick(int[] arr,int l ,int j){
        if (l < j) {
            int p = partition(arr,l,j);
            quick(arr, l, p - 1);
            quick(arr, p + 1, j);
            
        }
    }

    public static void main(String[] args) {
        int[] arr = {10, 7, 8, 9, 1, 5 };
        quick_sort q = new quick_sort();
        q.quick(arr, 0, arr.length - 1);
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]+ " ");
        }

    }
}