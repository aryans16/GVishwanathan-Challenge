class solution{
    public boolean isPalindrome(int x){
        if(x < 0 || (x % 10 == 0 && x != 0)){
            return false;
        }

        int reversedNum = 0;
        while(x > reversedNum){
            int digit = x % 10;
            reversedNum = reversedNum * 10 + digit;
            x /= 10;
        }

        return x == reversedNum || x == reversedNum / 10;
    }

    public static void main(String[] args) {
        solution sol = new solution();
        int num = 121; // Example input
        boolean result = sol.isPalindrome(num);
        System.out.println(num + " is a palindrome: " + result);
    }
}