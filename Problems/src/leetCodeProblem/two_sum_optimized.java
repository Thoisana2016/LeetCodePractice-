package leetCodeProblem;

import java.util.HashMap;
import java.util.Map;

public class two_sum_optimized {

    public static int[] twoSum(int nums[], int target){
        Map<Integer, Integer> numToIndex = new HashMap<>();
        for(int i = 0; i < nums.length; i++){
            numToIndex.put(nums[i], i);
            if(numToIndex.containsKey(target - nums[i])){
                return new int[] {numToIndex.get(target-nums[i]), i};//;
            }
        }
        return new int[]{};
    }

    public static void main(String[] args) {
        int arr[] = {1,2,3,5,9};
        int []res = twoSum(arr, 7);
        if(res.length > 0){
            for(int i = 0; i < res.length; i++){
                System.out.println(res[i]+" ");
            }
        }else {
            System.out.println("target not found ");
        }
    }
}


/*
  Map<Integer, Integer> numToIndex = new HashMap<>();
        for (int i = 0; i < nums.length; i++){
            if(numToIndex.containsKey(target - nums[i])){
                return new int[]{numToIndex.get(target-nums[i]), i};
            }
            numToIndex.put(nums[i], i);
        }
 */