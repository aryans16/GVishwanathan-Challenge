public class sametree {
    public static void main(String[] args) {
        Solution sol = new Solution();
        Solution.TreeNode p = sol.new TreeNode(1);
        p.left = sol.new TreeNode(2);
        p.right = sol.new TreeNode(3);

        Solution.TreeNode q = sol.new TreeNode(1);
        q.left = sol.new TreeNode(2);
        q.right = sol.new TreeNode(3);

        System.out.println(sol.isSameTree(p, q));
    }
    
}



class Solution{
    public class TreeNode{
        int val;
        TreeNode left;
        TreeNode right;
        TreeNode (){}
        TreeNode( int val) {this.val = val;}
        
    
    }

    public boolean isSameTree(TreeNode p, TreeNode q){
        if( p == null && q == null) return true;

        if( p == null || q == null) return false;

        if(p.val != q.val){
            return false;
        }

        return isSameTree(p.left, q.left) && isSameTree(p.right, q.right);

    }
}


