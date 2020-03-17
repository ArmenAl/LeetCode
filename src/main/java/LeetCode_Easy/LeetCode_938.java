package LeetCode_Easy;

public class LeetCode_938 {
    public static void main(String[] args) {
        TreeNode root = new TreeNode(10); //[10,5,15,3,7,null,18];
        TreeNode root1 = new TreeNode(5);
        TreeNode root2 = new TreeNode(15);
        TreeNode root3 = new TreeNode(3);
        TreeNode root4 = new TreeNode(7);
        TreeNode root6 = new TreeNode(18);
        root.left = root1;
        root.right = root2;
        root1.left = root3;
        root1.right = root4;
        root2.right = root6;
        int L = 7, R = 15;
        rangeSumBST(root, L, R);
    }

    public static class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;

        TreeNode(Integer x) {
            val = x;
        }
    }

    public static int rangeSumBST(TreeNode root, int L, int R) {
        int sum = 0;

        if(root != null && root.val >= L && root.val <= R ){
            sum += root.val;
        }

        if(root.left != null){
            sum += rangeSumBST(root.left, L, R);
        }

        if(root.right != null ){
            sum += rangeSumBST(root.right, L, R);
        }

        //System.out.println(sum);
        return sum;
    }
}
