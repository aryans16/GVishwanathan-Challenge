
class Solution {
    public int lengthOfLongestSubstring(String s) {
        int maxlen = 0;

        for(int i = 0; i < s.length(); i++){
            boolean[] seen = new boolean[128];
            int len = 0;

            for(int j = i ; j < s.length() ; j++){
                char c = s.charAt(j);

                if(seen[c]){
                    break;
                } else {
                    seen[c] = true;
                    len++;
                }
            }
            maxlen = Math.max(maxlen, len);
        }
        return maxlen;
        
    }
    public static void main(String[] args){
         Solution sol = new Solution();
         System.out.println(sol.lengthOfLongestSubstring("pwwkew"));
    }
}