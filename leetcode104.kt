class Solution {
    fun maxDepth(root: TreeNode?): Int {
        if (root == null) return 0
        val leftDepth = maxDepth(root.left)
        val rightDepth = maxDepth(root.right)
        return 1 + maxOf(leftDepth, rightDepth)
    }
}

// Recursion, if it reached the end then it returns 0
// Checks on the left to the end, then on the right to the end
// Returns the maximum of the left or the right +1, this is the node itself where it is located
// In the end the whole recursion will return the maximum branch +1, the very top
