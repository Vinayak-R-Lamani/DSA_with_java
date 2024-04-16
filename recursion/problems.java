package recursion;
public class problems {
    public void   print(int n) {
      if (n == 0){
          return;
      }
        System.out.println(n);
      print(n-1);
    }

    public int pow(int n, int p) {
        if (p == 0) {
            return 1;
        } else
            return n * pow(n, p - 1);
    }

    public int factorial(int n) {
        if (n == 0) {
            return 1;
        } else
            return factorial(n - 1) * n;
    }

    public  int fibonacci(int n) {
        if (n == 0 || n == 1) {
            return n;
        }
        System.out.println(fibonacci(n - 1));
        return  fibonacci(n - 1) + fibonacci(n - 2);
    }

    public boolean sorted(int[] arr,int idx){
        boolean flag = false;
        if(idx == arr.length-1){
            flag = true;
        }
        else if(arr[idx] <= arr[idx+1]){
            flag = sorted(arr,idx+1);
           

        }
        return flag;
    }
    public boolean sorted1(int[] arr,int idx){
        if(idx == arr.length-1){
            return true;
        }
        boolean result = sorted1(arr,idx+1);

        boolean ans = result && arr[idx] <= arr[idx+1];
        return ans;
    }

    public  void tower_of_honai(int n,char source,char temp,char dest){
        if(n == 0){
            return;
        }
        tower_of_honai(n-1,source,dest,temp);
        System.out.println("move disk" +n+" source "+source+" destination "+dest);
        tower_of_honai(n-1,temp,dest,source);
    }
    public static void main(String[] args) {
        problems m = new problems();
        int[] arr = {2,3,4,5,6,1};
        System.out.println(m.sorted1(arr,0));


    }
}
