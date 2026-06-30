public class maximum_subarray {
    public static void main(String[] args) {
        max_subarray sol = new max_subarray();
        int[] array = {5,4,-1,7,8};
        int result = sol.maxSubArray(array);
        System.out.println(result);
    }
    
}

class max_subarray{
    public int maxSubArray(int[] nums){
        

        int max_sum = nums[0];
        int current_sum = nums[0];

        for(int i = 1 ; i < nums.length ; i++){
            current_sum = Math.max(nums[i],current_sum + nums[i]);
            max_sum = Math.max(max_sum,current_sum);
        }
        return max_sum;
    }
}