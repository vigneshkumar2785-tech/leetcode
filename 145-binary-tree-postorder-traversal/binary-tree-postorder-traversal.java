class Solution {
    public List<Integer> postorderTraversal(TreeNode root) {
        List<Integer> result = new ArrayList<>();
        helper(root, result);
        return result;
    }

    private void helper(TreeNode root, List<Integer> l) {
        if (root == null) {
            return;
        }
        helper(root.left, l);
        helper(root.right, l);
                l.add(root.val);

    }
}
