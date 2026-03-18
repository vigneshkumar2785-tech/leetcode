class Solution {
    public void backtrack(TreeNode root, List<Integer> result, int level) {
        if (root == null) {
            return;
        }
        if (result.size() == level) {
            result.add(root.val);
        }

        backtrack(root.right, result, level + 1);
        backtrack(root.left, result, level + 1);
    }

    public List<Integer> rightSideView(TreeNode root) {
        List<Integer> result = new ArrayList<>();
        backtrack(root, result, 0);
        return result;
    }
}
