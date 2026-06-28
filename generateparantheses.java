import java.util.*;

public class generateparantheses {
    public static void main(String[] args){
    generate_parantheses sol = new generate_parantheses();
    int n = 2;
    List<String> result = sol.generateParantheses(n);
    System.out.println(result);
    }
}

class generate_parantheses{
    public List<String> generateParantheses(int n){
        List<String> result = new ArrayList<>();

        backtrack(result,"",0,0,n);

        return result;

    }

    private void backtrack(List<String> result , String current , int open,int close,int n){
        if(current.length() == 2 *n){
            result.add(current);
            return ;
        }

        if (open < n) {
            backtrack(result, current + "(", open + 1, close, n);
        }

        if (close < open) {
            backtrack(result, current + ")", open, close + 1, n);
        }
    }
}