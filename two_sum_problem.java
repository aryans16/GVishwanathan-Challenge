import java.util.HashMap;
import java.util.Arrays;
import java.util.Scanner;

public class two_sum_problem {

    public static int[] twoSum(int[] nums, int target) {
        HashMap<Integer, Integer> map = new HashMap<>();

        for (int i = 0; i < nums.length; i++) {
            int complement = target - nums[i];

            if (map.containsKey(complement)) {
                return new int[]{map.get(complement), i};
            }

            map.put(nums[i], i);
        }

        return new int[]{};
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input array size
        System.out.print("Enter the number of elements: ");
        int n = scanner.nextInt();

        // Input array elements
        int[] nums = new int[n];
        System.out.print("Enter the elements: ");
        for (int i = 0; i < n; i++) {
            nums[i] = scanner.nextInt();
        }

        // Input target
        System.out.print("Enter the target: ");
        int target = scanner.nextInt();

        // Get result
        int[] result = twoSum(nums, target);

        // Display result
        if (result.length == 2) {
            System.out.println("Output: " + Arrays.toString(result));
            System.out.println("Because nums[" + result[0] + "] + nums[" + result[1] + "] = "
                    + nums[result[0]] + " + " + nums[result[1]] + " = " + target);
        } else {
            System.out.println("No solution found.");
        }

        scanner.close();
    }
}