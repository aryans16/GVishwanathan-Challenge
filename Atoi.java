import java.util.*;

public class Atoi {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        Solution sol = new Solution();
        System.out.println(sol.myAtoi(s));
        sc.close();
    }
}
class Solution {
    public int myAtoi(String s) {
        int i = 0, n = s.length();

        while (i < n && s.charAt(i) == ' ') {
            i++;
        }

        int sign = 1;
        if (i < n && (s.charAt(i) == '+' || s.charAt(i) == '-')) {
            if (s.charAt(i) == '-') {
                sign = -1;
            }
            i++;
        }

        long num = 0;

        while (i < n && Character.isDigit(s.charAt(i))) {
            num = num * 10 + (s.charAt(i) - '0');

            if (sign * num > Integer.MAX_VALUE) {
                return Integer.MAX_VALUE;
            }

            if (sign * num < Integer.MIN_VALUE) {
                return Integer.MIN_VALUE;
            }

            i++;
        }

        return (int) (sign * num);
    }
}