class Solution {
    fun runningSum(nums: IntArray): IntArray {
        var sum = 0
        return nums.map { num ->
            sum += num
            sum
        }.toIntArray()
    }
}

// we create a variable sum where we will store the sum
// through nums.map we do operations inside {}, thereby going through nums
// each iteration we add the specific number to sum and make a List out of them
// then through toIntArray we convert it to IntArray (and do return)
