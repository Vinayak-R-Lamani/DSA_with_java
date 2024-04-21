import java.util.*;

public class subset {
    public static void generateSubset(int[] nums){
        List<List<Integer>> ans = new ArrayList<>();
        backtrack(ans,new ArrayList<>(),nums,0); 
        System.out.println("All subset");
        for(List<Integer> l:ans){
            System.out.println(l);
        }   
    }

    private static void backtrack(List<List<Integer>> ans, List<Integer> ds, int[] nums, int index){
        {
            ans.add(new ArrayList<>(ds));
            for(int i=index;i<nums.length;i++){
                ds.add(nums[i]);
                backtrack(ans,ds,nums,i+1);
                ds.remove(ds.size()-1);
            }
        }
    }

    public static void main(String[] args) {
        int[] nums = {1,2,3,4};
        generateSubset(nums);
    }
}