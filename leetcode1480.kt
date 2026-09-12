class Solution {
    fun runningSum(nums: IntArray): IntArray {
        var sum = 0
        return nums.map { num ->
            sum += num
            sum
        }.toIntArray()
    }
}

// создаем переменную sum где будем зарнить сумму
// через nums.map деалем операции внутри {} тем самым проходимся по nums
// каждую итерацию мы суммируем корнкретное число в sum и делаем из них List
// потом через toIntArray конвертируем ее в IntArray (и делаем return)
