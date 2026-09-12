class Solution {
    fun maxDepth(root: TreeNode?): Int {
        if (root == null) return 0
        val leftDepth = maxDepth(root.left)
        val rightDepth = maxDepth(root.right)
        return 1 + maxOf(leftDepth, rightDepth)
    }
}

// Рекурсия если дошел до конца то отдает 0
// Проверяет слева до конца потом справа до конца
// Отдает максимум слева или справа +1 это сама нода где он находиться
// В конце вся рекурсия отдаст максимальную ветку +1 самая верхушка
