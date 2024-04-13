import java.util.Arrays;

public class sort {
    int[] arr;
    int n;
    sort(int[] arr){
        this.arr = arr;
        this.n = arr.length;
    }

    public void swap(int[] arr, int i, int j)
    {
        int temp = arr[ i ];
        arr[ i ] = arr[ j ];
        arr[ j ] = temp;

    }

    public  int[] buble_sort() {
    
        for(int i = 0; i < arr.length - 1; i++){
            for(int j = 0 ;j < arr.length - i - 1 ; j++){
                if(arr[j] > arr[j+1]){
                    swap(arr,j,j+1);
                }
            }
        }

        return arr;
         
    }

    public int[] selection_sort(){
        for(int i = 0 ;i < arr.length- 1; i++){
            int min = i;
            for(int j = i + 1; j < arr.length ; j++){
                if (arr[i] > arr[j]) {
                    min =j;
                }
            }
            swap(arr, i, min);
        }

        return arr;
    }

    public int[] insertion_sort(){
        for(int i = 1; i < arr.length ; i++){
           int temp = arr[i];
           int j = i - 1;
            while (j >= 0 && arr[j] > temp) {
                arr[j + 1] = arr[j];
                j--;
            }
            arr[j + 1] = temp;
        }
        return arr;
    }


    public static void main(String[] args) {
        int[] arr = {10, 7, 8, 9, 1, 5};
        String str = "";
        sort s = new sort(arr);
        System.out.println(Arrays.toString(s.insertion_sort()));
        System.out.println(Arrays.toString(s.selection_sort()));
        System.out.println(Arrays.toString(s.buble_sort()));
    }
    
}