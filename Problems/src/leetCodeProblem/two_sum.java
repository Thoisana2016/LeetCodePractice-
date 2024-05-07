package leetCodeProblem;

public class two_sum {

    public static int[] twoSum(int[] nums, int target) {
        int x = 0;
        int arr[] = new int[2];
        for(int i = 0; i < nums.length; i++){
            for(int j = i+1; j < nums.length; j++){
                System.out.println(nums[i]+" : "+nums[j]);
                if(nums[i] + nums[j] == target ){
                    System.out.println(i+" "+j);
                    arr[0] = i;
                    arr[1] = j;
                    return arr;

                }
            }
        }
        return null;
    }

    public static void main(String[] args) {
        int arr[] = {1,2,3,5,9};
        int []res = twoSum(arr, 7);
        if(res.length > 0){
            System.out.println(res);
        }else {
            System.out.println("not found ");
        }
    }
}
