import java.util.HashMap;
import java.util.PriorityQueue;

public class TopKfrequentelements {

    public static void main(String[] args) {
        Solution sol = new Solution();

        int[] nums = {1,1,1,2,2,3};

        int k = 2;

        int[] ans = new int[k];

        ans = sol.topKFrequent(nums, k);

        for(int num : ans){
            System.out.print(num + " ");
        }
    }
    
}

class Solution{
    public int[] topKFrequent(int[] nums,int k){
        int[] result = new int[k];

        HashMap<Integer,Integer> freq = new HashMap<>();

        for( int num : nums){
            freq.put(num, freq.getOrDefault(num, 0) + 1);
        }

        PriorityQueue<Integer> pq = new PriorityQueue<>((a,b) -> freq.get(b) - freq.get(a));

        pq.addAll(freq.keySet());

        for(int i = 0 ; i < k ; i++){
            result[i] = pq.poll();
        }

        return result;       
    }
}