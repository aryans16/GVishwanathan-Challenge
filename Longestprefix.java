public class Longestprefix {
    public static void main(String[] args){
        Solution sol = new Solution();
        String[] strs = {"flower","flow","flight"};
        System.out.println(sol.longestCommonPrefix(strs));
    }
    
}

class Solution {
    public String longestCommonPrefix(String[] strs) {
        if (strs == null || strs.length == 0) {
            return "";
        }

        String prefix = strs[0];

        for (int i = 1; i < strs.length; i++) {
            while (!strs[i].startsWith(prefix)) {
                prefix = prefix.substring(0, prefix.length() - 1);

                if (prefix.isEmpty()) {
                    return "";
                }
            }
        }

        return prefix;
    }
}