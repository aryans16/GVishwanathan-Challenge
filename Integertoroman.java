public class Integertoroman {
    public static void main(String[] args){
        Solution sol = new Solution();
        int num =  58;
        System.out.println(sol.intToRoman(num));
    }
    
}

class Solution{
    public String intToRoman(int num){
        int[] values = {1000, 900, 500, 400, 100, 90, 50, 40, 10, 9,8,7,6, 5, 4,3,2,1};
        String[] symbols = {"M", "CM", "D", "CD", "C", "XC", "L", "XL", "X", "IX","VIII","VII","VI", "V", "IV", "III", "II", "I"};

        StringBuilder roman = new StringBuilder();
        for(int i = 0; i < values.length; i++){
            while(num >= values[i]){
                num -= values[i];
                roman.append(symbols[i]);
            }
        }
        return roman.toString();
    }
}
