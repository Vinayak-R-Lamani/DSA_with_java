public class Array {
    public  static  void main(String[] args){
        int sum = 0;
        int[][][] nums = new  int[4][4][4];
        for (int i = 0 ; i< 4 ;i++ ){
            for(int j = 0 ; j < 4 ;j++){
                for (int k = 0 ; k < 4 ;k++) {
                    nums[i][j][k] = 2;
                }
            }

        }

        for (int i = 0 ; i< 4 ;i++ ){
            for(int j = 0 ; j < 4 ;j++){
                for (int k = 0 ; k < 4 ;k++) {
                    System.out.print(nums[i][j][k] +  " ");
                    sum +=nums[i][j][k];
                }
                System.out.println();
            }
            System.out.println();

        }


        System.out.println(sum);
    }
}
