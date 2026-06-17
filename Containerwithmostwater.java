public class Containerwithmostwater {
    public static void main(String[] args){
        Solution sol = new Solution();
        int[] height = {1,8,6,2,5,4,8,3,7};
        System.out.println(sol.maxArea(height));

    }
    
}

class Solution{
    public int maxArea(int[] height){
        int n = height.length;
        int left = 0;
        int right = n - 1;
        int maxarea = 0;

        while(left <  right){
            int width = right - left;
            int area = Math.min(height[left],height[right]) * width;
            maxarea = Math.max(maxarea, area);

            if(height[left] < height[right]){
                left++;
            } else {
                right--;
            }
        }
        return maxarea;
    }

}