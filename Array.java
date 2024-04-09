public class Array {
    public  static  void main(String[] args){
        int[][] nums = new int[4][4];
        for(int i = 0 ;i < 4; i++){
            for(int j = 0 ; j < 4 ; j++){
                nums[i][j] = (int)(Math.random()*1000);
            }
        }

        for(int i[] : nums){
            for(int j : i){
                System.out.print(j + " ");
            }
            System.out.println();
        }

    }
}
